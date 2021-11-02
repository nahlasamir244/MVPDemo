package com.nahlasamir244.mvp_demo.presenter.base

import com.nahlasamir244.mvp_demo.model.dataManager.DataManager
import com.nahlasamir244.mvp_demo.view.base.MvpView

//It is base class for all presenter that implements MvpPresenter
// and it is extended by all other presenters there in application.
open class BasePresenter<V : MvpView>(var dataManager: DataManager
                                 ) : MvpPresenter<V> {

    lateinit var mvpView: V
    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }

}