package com.example.androidavanzado

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CoroutineViewModel: ViewModel() {
    fun lanzarCorrutinaConLaunch() {
        Log.d("Hola","3")
   val job = GlobalScope.launch {
        corrutina1()
    }
        Log.d("Hola","4")
    }

    suspend fun corrutina1() {
        Log.d("Hola","1")
        Thread.sleep(1000)
        Log.d("Hola","2")
    }
}