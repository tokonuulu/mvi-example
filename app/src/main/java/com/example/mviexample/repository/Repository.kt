package com.example.mviexample.repository

import androidx.lifecycle.LiveData
import com.example.mviexample.ui.main.state.MainViewState
import com.example.mviexample.util.AbsentLiveData
import com.example.mviexample.util.DataState

object Repository {

    fun getUser() : LiveData<DataState<MainViewState>> {
        return AbsentLiveData.create()
    }

    fun getBlogPosts() : LiveData<DataState<MainViewState>> {
        return AbsentLiveData.create()
    }
}