package com.abelpinheiro.trackinglibraryapp

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.provider.Settings.System.getConfiguration
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.imageview.ShapeableImageView
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ShapeableImageView>(R.id.app_icon)
        if (isDarkTheme(this)){
            img.setColorFilter(getColor(R.color.deep_orange_200))
        }else{
            img.setColorFilter(getColor(R.color.deep_orange_600))
        }

        var loginButton = findViewById<Button>(R.id.login_button);

        loginButton.setOnClickListener {
            val intent = Intent(this, SeriesListActivity::class.java)
            startActivity(intent)
        }
    }

    fun isDarkTheme(activity: Activity): Boolean {
        return activity.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    }
}