package com.example.filmjetpacksub1.ui.detail

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.filmjetpacksub1.R
import com.example.filmjetpacksub1.data.FilmEntity
import com.example.filmjetpacksub1.databinding.ActivityDetailBinding
import com.example.filmjetpacksub1.viewmodel.DetailViewModel
import com.example.filmjetpacksub1.viewmodel.ViewModelFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    private lateinit var detViewModel: DetailViewModel

    companion object {
        const val EXTRA_NAME = "extra_name_film"
        const val EXTRA_FRAGMENT = "extra_fragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showLoading(true)

        val factory = ViewModelFactory()
        detViewModel = ViewModelProvider(
            this, factory
        ).get(DetailViewModel::class.java)

        val bundle = intent.extras
        if (bundle != null) {
            val filmName = bundle.getString(EXTRA_NAME)
            when (bundle.getString(EXTRA_FRAGMENT)) {
                "MOVIE" -> {
                    if (filmName != null) {
                        CoroutineScope(Dispatchers.IO).launch {
                            detViewModel.setSelectedMovie(filmName)
                            val movie = detViewModel.getSelectedMovie()
                            withContext(Dispatchers.Main) {
                                setSupportBar(filmName)
                                manageData(movie)
                                showLoading(false)
                            }
                        }
                    }
                }
                "TV SHOW" -> {
                    if (filmName != null) {
                        CoroutineScope(Dispatchers.IO).launch {
                            detViewModel.setSelectedTvShow(filmName)
                            val show = detViewModel.getSelectedTvShow()
                            withContext(Dispatchers.Main) {
                                setSupportBar(filmName)
                                manageData(show)
                                showLoading(false)
                            }
                        }
                    }
                }
            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setSupportBar(movieName: String) {
        supportActionBar?.apply {
            customView = setTitleBar(movieName)
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
            setDisplayShowHomeEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
    }

    private fun setTitleBar(movieName: String): TextView {
        return TextView(this).apply {
            text = movieName

            val params = ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT
            )
            layoutParams = params
            params.gravity = Gravity.START

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                setTextAppearance(
                    android.R.style.TextAppearance_Material_Widget_ActionBar_Title
                )
            } else {
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 14F)
                setTypeface(null, Typeface.BOLD)
            }
            setTextColor(Color.WHITE)
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun manageData(film: FilmEntity) {
        with(binding) {
            tvJudulDetail.text = film.judul
            tvOverviewContent.text = film.desc
            tvDuration.text = film.durationStr
            tvGenre.text = film.genre

            val yearFormat = SimpleDateFormat("yyyy")
            val dateFormat = SimpleDateFormat("dd MMM yyyy")

            val yearForm = yearFormat.format(film.tanggal)
            val dateForm = dateFormat.format(film.tanggal)
            tvTahunDetail.text = yearForm
            tvDateDetail.text = dateForm

            btnShare.setOnClickListener { onShareClick(film) }

            Glide.with(root)
                .load(film.poster)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(imgPosterDetail)
        }
    }

    private fun onShareClick(film: FilmEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(this@DetailActivity)
                .setType(mimeType)
                .setChooserTitle(resources.getString(R.string.share_title))
                .setText(resources.getString(R.string.share_text, film.judul))
                .startChooser()
        }
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.INVISIBLE
        }
    }
}