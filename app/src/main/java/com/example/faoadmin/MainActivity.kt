package com.example.faoadmin

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 32, 32, 32)

        val title = TextView(this)
        title.text = "Future Aviator Admin"
        title.textSize = 26f
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "Admin dashboard ready"
        status.textSize = 18f
        status.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(status)

        setContentView(layout)
    }
}
