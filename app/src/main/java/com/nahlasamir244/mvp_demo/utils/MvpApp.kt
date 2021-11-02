package com.nahlasamir244.mvp_demo.utils
import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import android.app.Application
import com.nahlasamir244.mvp_demo.model.dataHelper.SharedPreferenceHelper


class MvpApp : Application() {
    lateinit var dataManager: DataManager

    override fun onCreate() {
        super.onCreate()
        val sharedPrefsHelper = SharedPreferenceHelper(applicationContext)
        dataManager = DataManager(sharedPrefsHelper)
    }
}
