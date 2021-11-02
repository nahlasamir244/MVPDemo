package com.nahlasamir244.mvp_demo.presenter.base

import com.nahlasamir244.mvp_demo.view.base.MvpView

//It is an interface that is implemented by BasePresenter,
// it acts as base presenter interface that is extended by all other presenter interfaces.
interface MvpPresenter<V: MvpView> {
    fun onAttach(mvpView: V)
}