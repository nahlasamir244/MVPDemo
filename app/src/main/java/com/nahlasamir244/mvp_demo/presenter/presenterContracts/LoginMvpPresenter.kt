package com.nahlasamir244.mvp_demo.presenter.presenterContracts

import com.nahlasamir244.mvp_demo.presenter.base.MvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.LoginMvpView

interface LoginMvpPresenter<V: LoginMvpView>: MvpPresenter<V> {
    fun startLogin(emailId: String)
}