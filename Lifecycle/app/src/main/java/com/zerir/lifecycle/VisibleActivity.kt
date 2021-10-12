package com.zerir.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class VisibleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visible)

        Log.e("LIFECYCLE: -", "ON-CREATE ACTIVITY 2")

        val fragment1 = BlankFragment()
        val fragment2 = BlankFragment2()

        supportFragmentManager.apply {
            beginTransaction().apply {
                replace(R.id.container, fragment1)
                commit()
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.apply {
                val currentFragment = findFragmentById(R.id.container)
                if (currentFragment is BlankFragment) return@setOnClickListener
                beginTransaction().apply {
                    replace(R.id.container, fragment1)
                    addToBackStack("1")
                    commit()
                }
            }
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            supportFragmentManager.apply {
                val currentFragment = findFragmentById(R.id.container)
                if (currentFragment is BlankFragment2) return@setOnClickListener
                beginTransaction().apply {
                    replace(R.id.container, fragment2)
                    addToBackStack("2")
                    commit()
                }
            }
        }
    }

    override fun onStart() {
        Log.e("LIFECYCLE: -", "ON-START ACTIVITY 2")
        super.onStart()
    }

    override fun onResume() {
        Log.e("LIFECYCLE: -", "ON-RESUME ACTIVITY 2")
        super.onResume()
    }

    override fun onPause() {
        Log.e("LIFECYCLE: -", "ON-PAUSE ACTIVITY 2")
        super.onPause()
    }

    override fun onStop() {
        Log.e("LIFECYCLE: -", "ON-STOP ACTIVITY 2")
        super.onStop()
    }

    override fun onRestart() {
        Log.e("LIFECYCLE: -", "ON-RESTART ACTIVITY 2")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("LIFECYCLE: -", "ON-DESTROY ACTIVITY 2")
        super.onDestroy()
    }
}