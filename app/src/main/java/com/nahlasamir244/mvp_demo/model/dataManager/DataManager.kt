package com.nahlasamir244.mvp_demo.model.dataManager

import com.nahlasamir244.mvp_demo.model.dataHelper.SharedPreferenceHelper

//the only part of model that interacts with presenter and vice versa
//middle layer between model and presenter
class DataManager(var mSharedPreferencesHelper: SharedPreferenceHelper) {

    fun clear() {
        mSharedPreferencesHelper.clear()
    }

    fun saveEmail(email: String) {
        mSharedPreferencesHelper.putEmail(email)
    }

    fun getEmail(): String {
        return mSharedPreferencesHelper.getEmail()
    }

    fun setLoggedIn(loggedIn:Boolean=true) {
        mSharedPreferencesHelper.setLoggedInMode(loggedIn)
    }

    fun getLoggedInMode(): Boolean {
        return mSharedPreferencesHelper.getLoggedInMode()
    }
}