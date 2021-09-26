package com.example.filmjetpacksub1.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.example.filmjetpacksub1.R
import com.example.filmjetpacksub1.databinding.ActivitySplashBinding
import com.example.filmjetpacksub1.ui.home.MainActivity

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Animations
        binding.tvAppNameTitle.animation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        binding.logo.animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        binding.tvMotto.animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        //to go to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }
}