package com.vishnevskiypro.myservice1

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.Message
import android.util.Log

class MyServiceExample : Service() {

    val TAG = "MyService"

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        showLog("OnCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        showLog("onStartCommand")

        val runnable = Runnable {
            for (i in 0..10){
                showLog("Service is doing something $i")
                Thread.sleep(500)
            }

            stopSelf()

        }

        val thread = Thread(runnable)
        thread.start()


        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        showLog("onDestroy")
        super.onDestroy()
    }

    fun showLog(message: String){
        Log.d(TAG, message)
    }

}