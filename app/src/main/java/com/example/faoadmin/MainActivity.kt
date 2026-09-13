package com.example.faoadmin

import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

```
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        gravity = Gravity.CENTER
        setPadding(32, 32, 32, 32)
    }

    val title = TextView(this).apply {
        text = "Future Aviator Admin"
        textSize = 26f
        gravity = Gravity.CENTER
    }

    val status = TextView(this).apply {
        text = "\nAdmin dashboard ready"
        textSize = 18f
        gravity = Gravity.CENTER
    }

    layout.addView(title)
    layout.addView(status)

    setContentView(layout)
}
```

}
