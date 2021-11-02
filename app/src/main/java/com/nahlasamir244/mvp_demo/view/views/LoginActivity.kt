package com.nahlasamir244.mvp_demo.view.views

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.nahlasamir244.mvp_demo.view.base.BaseActivity
import com.nahlasamir244.mvp_demo.R
import com.nahlasamir244.mvp_demo.presenter.presenters.LoginPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.LoginMvpView
import android.view.View
import android.widget.Toast
import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.utils.CommonUtils
import com.nahlasamir244.mvp_demo.utils.MvpApp


class LoginActivity : BaseActivity() , LoginMvpView {
    lateinit var loginPresenter: LoginPresenter<LoginActivity>
    lateinit var editTextEmail: EditText
    lateinit var editTextPassword: EditText
    lateinit var button: Button
    lateinit var dataManager: DataManager
    companion object{
        fun getStartIntent(context: Context) = Intent(context, LoginActivity::class.java)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        dataManager= (application as MvpApp).dataManager
        loginPresenter = LoginPresenter(dataManager)
        loginPresenter.onAttach(this)
        editTextEmail = findViewById<View>(R.id.editTextEmail) as EditText
        editTextPassword = findViewById<View>(R.id.editTextPassword) as EditText
        button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            onLoginButtonClick()
        }
    }

    override fun openMainActivity() {
        val intent = MainActivity.getStartIntent(this)
        startActivity(intent)
        finish()
    }

    override fun onLoginButtonClick() {
        val emailId:String  = editTextEmail.text.toString()
        val password:String = editTextPassword.text.toString()

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show()
            return
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show()
            return
        }

        loginPresenter.startLogin(emailId)

    }
    }
