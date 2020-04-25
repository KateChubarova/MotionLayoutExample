package com.crocodile.motionlayoutexample

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/*TODO: если этот класс появился с 14 апи то как его получить не использую constraint layout dependency 2.0.beta? */
//motion scene can be set up programmatically
//contains : constraintSets, transitions + keyFrames
//Android studio 4.0 beta editing&previewing MotionScene files

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<ImageView>(R.id.button)
    }
}
