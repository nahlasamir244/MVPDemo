package com.nahlasamir244.mvp_demo.presenter.presenterContracts

import com.nahlasamir244.mvp_demo.presenter.base.MvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.MainMvpView

interface MainMvpPresenter<V: MainMvpView>: MvpPresenter<V> {
    fun getEmailId(): String

    fun setUserLoggedOut()
}