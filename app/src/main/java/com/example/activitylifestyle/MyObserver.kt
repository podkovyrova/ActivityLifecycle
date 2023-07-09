@file:Suppress("DEPRECATION")

package com.example.activitylifestyle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MyObserver: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun myFunc (source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("TAG_FOR_ACTIVITY", event.toString())
    }
}