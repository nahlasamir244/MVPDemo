package com.nahlasamir244.mvp_demo.presenter.presenters

import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.presenter.base.BasePresenter
import com.nahlasamir244.mvp_demo.presenter.presenterContracts.LoginMvpPresenter
import com.nahlasamir244.mvp_demo.view.viewContracts.LoginMvpView

class LoginPresenter<V: LoginMvpView>(dataManager: DataManager)
    : BasePresenter<V>(dataManager), LoginMvpPresenter<V> {
    override fun startLogin(emailId: String) {
        dataManager.saveEmail(emailId)
        dataManager.setLoggedIn()
        mvpView.openMainActivity()
    }

}