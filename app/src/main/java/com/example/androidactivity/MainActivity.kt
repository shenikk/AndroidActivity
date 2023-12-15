package com.example.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Learn more about activities
 * https://developer.android.com/guide/components/activities/activity-lifecycle
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
