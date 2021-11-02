package com.nahlasamir244.mvp_demo.presenter.presenters

import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.presenter.base.BasePresenter
import com.nahlasamir244.mvp_demo.presenter.presenterContracts.SplashMvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.SplashMvpView

//extends BasePresenter and implements the interface we have for this presenter.

class SplashPresenter<V: SplashMvpView>(dataManager: DataManager)
    : BasePresenter<V>(dataManager), SplashMvpPresenter<V> {
    override fun decideNextActivity() {
        if (dataManager.getLoggedInMode()) {
            mvpView.openMainActivity();
        } else {
            mvpView.openLoginActivity();
        }
    }
}



