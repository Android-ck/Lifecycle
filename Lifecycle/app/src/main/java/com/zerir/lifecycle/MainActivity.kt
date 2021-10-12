package com.zerir.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import com.zerir.lifecycle.ui.theme.LifecycleTheme

class MainActivity : ComponentActivity() {

    private var state: String? = null
    private val stateKey = "GAME_STATE_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("LIFECYCLE: -", "ON-CREATE ACTIVITY 1")
        Log.e("STATE: -", "ON-CREATE-state $state")

        savedInstanceState?.let {
            //get state from saved state
            state = savedInstanceState.getString(stateKey)
            Log.e("STATE: -", "ON-CREATE-state FROM SAVED INSTANCE $state")
        }

        setContent {
            LifecycleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        Button(onClick = {
                            state = "Random String"
                        }) {
                            Text("set state")
                        }
                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, VisibleActivity::class.java))
                        }) {
                            Text("Go Away")
                        }
                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, SmallActivity::class.java))
                        }) {
                            Text("Dialog As Activity")
                        }
                    }
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(stateKey, state)
        Log.e("LIFECYCLE: -", "ON-SAVED-INSTANCE ACTIVITY 1")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        state = savedInstanceState.getString(stateKey)
        Log.e("LIFECYCLE: -", "ON-RESTORED-INSTANCE ACTIVITY 1")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onStart() {
        Log.e("LIFECYCLE: -", "ON-START ACTIVITY 1")
        super.onStart()
    }

    override fun onResume() {
        Log.e("LIFECYCLE: -", "ON-RESUME ACTIVITY 1")
        Log.e("STATE: -", "ON-RESUME-state $state")
        super.onResume()
    }

    override fun onPause() {
        Log.e("LIFECYCLE: -", "ON-PAUSE ACTIVITY 1")
        super.onPause()
    }

    override fun onStop() {
        Log.e("LIFECYCLE: -", "ON-STOP ACTIVITY 1")
        super.onStop()
    }

    override fun onRestart() {
        Log.e("LIFECYCLE: -", "ON-RESTART ACTIVITY 1")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.e("LIFECYCLE: -", "ON-DESTROY ACTIVITY 1")
        super.onDestroy()
    }
}