package com.nahlasamir244.mvp_demo.view.views

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import com.nahlasamir244.mvp_demo.view.base.BaseActivity
import com.nahlasamir244.mvp_demo.R
import com.nahlasamir244.mvp_demo.view.viewContracts.SplashMvpView
import com.nahlasamir244.mvp_demo.presenter.presenters.SplashPresenter
import android.content.Intent
import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.utils.MvpApp


//decide which activity to open
// if already logged in, open MainActivity otherwise open LoginActivity.
//extends BaseActivity and implements the interface we have for this view.
@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity(), SplashMvpView {
    lateinit var splashPresenter: SplashPresenter<SplashActivity>
    lateinit var dataManager:DataManager

    companion object{
        fun getStartIntent(context:Context) = Intent(context, SplashActivity::class.java)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        dataManager = (application as MvpApp).dataManager
        splashPresenter = SplashPresenter(dataManager)
        splashPresenter.onAttach(this)
        splashPresenter.decideNextActivity()

    }

    override fun openMainActivity() {
        val intent: Intent = MainActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }

    override fun openLoginActivity() {
        val intent: Intent = LoginActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }
}