package com.example.jellyfishapp

import android.app.Application
import com.example.jellyfishapp.data.MainDb

class App: Application() {
    val database by lazy { MainDb.createDataBase(this) }
}