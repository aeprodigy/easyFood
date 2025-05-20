package com.example.easyfood.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(): ViewModel () {

    init {
        Log.d(TAG, "NewsViewModel initialized")

    }
    companion object{
        private const val TAG = "NewsViewModel"
    }

}