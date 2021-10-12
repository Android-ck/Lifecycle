package com.zerir.lifecycle

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("LIFECYCLE: -", "ON-CREATE FRAGMENT 1")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("LIFECYCLE: -", "ON-CREATE-VIEW FRAGMENT 1")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e("LIFECYCLE: -", "ON-VIEW-CREATED FRAGMENT 1")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.e("LIFECYCLE: -", "ON-RESTORE-STATE FRAGMENT 1")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.e("LIFECYCLE: -", "ON-START FRAGMENT 1")
        super.onStart()
    }

    override fun onResume() {
        Log.e("LIFECYCLE: -", "ON-RESUME FRAGMENT 1")
        super.onResume()
    }

    override fun onPause() {
        Log.e("LIFECYCLE: -", "ON-PAUSE FRAGMENT 1")
        super.onPause()
    }

    override fun onStop() {
        Log.e("LIFECYCLE: -", "ON-STOP FRAGMENT 1")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.e("LIFECYCLE: -", "ON-SAVE-INSTANCE FRAGMENT 1")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.e("LIFECYCLE: -", "ON-DESTROY_VIEW FRAGMENT 1")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("LIFECYCLE: -", "ON-DESTROY FRAGMENT 1")
        super.onDestroy()
    }
}