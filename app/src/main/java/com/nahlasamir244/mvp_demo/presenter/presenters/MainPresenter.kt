package com.nahlasamir244.mvp_demo.presenter.presenters

import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.presenter.base.BasePresenter
import com.nahlasamir244.mvp_demo.presenter.presenterContracts.MainMvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.MainMvpView

class MainPresenter<V : MainMvpView>(dataManager: DataManager) :
    BasePresenter<V>(dataManager), MainMvpPresenter<V> {
    override fun getEmailId(): String {
        return dataManager.getEmail()
    }

    override fun setUserLoggedOut() {
        dataManager.clear()
        mvpView.openSplashActivity()
    }
}