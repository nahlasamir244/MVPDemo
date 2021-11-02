package com.nahlasamir244.mvp_demo.view.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.nahlasamir244.mvp_demo.R
import com.nahlasamir244.mvp_demo.view.base.BaseActivity
import com.nahlasamir244.mvp_demo.view.viewContracts.MainMvpView
import com.nahlasamir244.mvp_demo.presenter.presenters.MainPresenter
import android.widget.TextView
import android.view.View
import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.utils.MvpApp

class MainActivity : BaseActivity(),MainMvpView {
    lateinit var textViewShow: TextView
    lateinit var buttonLogout: Button
    lateinit var mainPresenter: MainPresenter<MainActivity>
    private lateinit var dataManager: DataManager
    companion object{
        fun getStartIntent(context: Context) = Intent(context, MainActivity::class.java)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         dataManager= (application as MvpApp).dataManager
        mainPresenter = MainPresenter(dataManager)
        mainPresenter.onAttach(this)
        textViewShow = findViewById<View>(R.id.textViewShow) as TextView
        buttonLogout = findViewById<View>(R.id.buttonLogout) as Button
        textViewShow.setText(mainPresenter.getEmailId())
        buttonLogout.setOnClickListener { mainPresenter.setUserLoggedOut() }
    }

    override fun openSplashActivity() {
        val intent = SplashActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }
}