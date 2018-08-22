package com.example.hp.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

         val splash = object : Thread()
         {
             override fun run() {
                 try {
                     Thread.sleep(2000)
                     val intent = Intent(baseContext,MainActivity::class.java)
                     startActivity(intent)

                 }catch (e: Exception){
                     e.printStackTrace()
                 }
             }
         }
        splash.start()
    }
}
