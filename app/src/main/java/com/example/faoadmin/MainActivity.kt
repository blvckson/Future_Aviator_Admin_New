package com.example.faoadmin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            android.widget.TextView(this).apply {
                text = "Future Aviator Admin"
                textSize = 24f
                gravity = android.view.Gravity.CENTER
            }
        )
    }
}
