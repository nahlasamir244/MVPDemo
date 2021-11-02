package com.nahlasamir244.mvp_demo.model.dataHelper

import android.content.Context
import android.content.Context.MODE_PRIVATE

import android.content.SharedPreferences

class SharedPreferenceHelper(context: Context) {
    companion object{
        const val MY_PREFS = "MY_PREFS"
        const val EMAIL = "EMAIL"
        const val IS_LOGGED_IN ="IS_LOGGED_IN"
    }

    private var mSharedPreferences: SharedPreferences =
        context.getSharedPreferences(MY_PREFS, MODE_PRIVATE)

    //empty sp
    fun clear() {
        mSharedPreferences.edit().clear().apply()
    }

    fun putEmail(email: String) {
        mSharedPreferences.edit().putString(EMAIL, email).apply()
    }

    fun getEmail(): String {
        return mSharedPreferences.getString(EMAIL, "nahla@nahla.com")!!
    }

    fun getLoggedInMode(): Boolean {
        return mSharedPreferences.getBoolean(IS_LOGGED_IN, false)
    }

    fun setLoggedInMode(loggedIn: Boolean) {
        mSharedPreferences.edit().putBoolean(IS_LOGGED_IN, loggedIn).apply()
    }
}