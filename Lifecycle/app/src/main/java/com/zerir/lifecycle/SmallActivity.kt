package com.zerir.lifecycle

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Window

class SmallActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_small)

        setFinishOnTouchOutside(false)

        Log.e("LIFECYCLE: -", "ON-CREATE ACTIVITY 3")
    }

    override fun onStart() {
        Log.e("LIFECYCLE: -", "ON-START ACTIVITY 3")
        super.onStart()
    }

    override fun onResume() {
        Log.e("LIFECYCLE: -", "ON-RESUME ACTIVITY 3")
        super.onResume()
    }

    override fun onPause() {
        Log.e("LIFECYCLE: -", "ON-PAUSE ACTIVITY 3")
        super.onPause()
    }

    override fun onStop() {
        Log.e("LIFECYCLE: -", "ON-STOP ACTIVITY 3")
        super.onStop()
    }

    override fun onRestart() {
        Log.e("LIFECYCLE: -", "ON-RESTART ACTIVITY 3")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("LIFECYCLE: -", "ON-DESTROY ACTIVITY 3")
        super.onDestroy()
    }
}