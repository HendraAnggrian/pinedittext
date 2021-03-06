package com.hendraanggrian.appcompat.pinview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hendraanggrian.appcompat.pinview.test.R
import com.hendraanggrian.appcompat.widget.PinGroup

sealed class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<PinGroup>(R.id.pinGroup).setOnStateChangedListener { _, isComplete ->
            findViewById<TextView>(R.id.textView).text = when {
                isComplete -> "Complete"
                else -> "Unfinished"
            }
        }
    }
}

class SimpleActivity : TestActivity()

class CustomActivity : TestActivity()