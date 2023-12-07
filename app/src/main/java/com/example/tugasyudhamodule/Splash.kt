package com.example.tugasyudhamodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import com.example.tugasyudhamodule.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_splash)

        binding.apply {
            text1.animation = AnimationUtils.loadAnimation(this@Splash, R.anim.animone)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3500)
    }
}