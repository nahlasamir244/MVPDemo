package com.nahlasamir244.mvp_demo.presenter.presenterContracts

import com.nahlasamir244.mvp_demo.presenter.base.MvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.SplashMvpView

interface SplashMvpPresenter<V: SplashMvpView>: MvpPresenter<V> {
    fun decideNextActivity()
}