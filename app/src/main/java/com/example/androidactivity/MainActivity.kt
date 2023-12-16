package com.example.androidactivity

import android.Manifest
import android.content.ActivityNotFoundException
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat

/**
 * Learn more about activities
 * https://developer.android.com/guide/components/activities/activity-lifecycle
 */
class MainActivity : AppCompatActivity() {

    private var incrementNumber = 0
    private lateinit var incrementTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        incrementTextView = findViewById(R.id.increment)
        incrementTextView.setOnClickListener {
            ++incrementNumber
            incrementTextView.text = incrementNumber.toString()
        }
        println("MainActivity onCreate")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("SAVED_INT_KEY", incrementNumber)

        println("MainActivity onSaveInstanceState")
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val userInt = savedInstanceState.getInt("SAVED_INT_KEY")
        incrementNumber = userInt
        incrementTextView.text = incrementNumber.toString()

        println("MainActivity onRestoreInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        println("MainActivity onRestart")
    }

    override fun onStart() {
        super.onStart()
        println("MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        println("MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        println("MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        println("MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("MainActivity onDestroy")
    }

    companion object {
        private const val SAVED_INT_KEY = "SAVED_INT_KEY"
    }
}
