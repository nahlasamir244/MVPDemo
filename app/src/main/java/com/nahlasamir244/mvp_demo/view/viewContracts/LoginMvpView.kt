package com.nahlasamir244.mvp_demo.view.viewContracts

import com.nahlasamir244.mvp_demo.view.base.MvpView

interface LoginMvpView : MvpView {
    fun openMainActivity()

    fun onLoginButtonClick()
}