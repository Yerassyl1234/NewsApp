package com.example.newsapp.presentation.startup

import com.example.newsapp.domain.usecase.StartRefreshDataUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class AppStartManager @Inject constructor(
    private val startRefreshDataUseCase: StartRefreshDataUseCase
) {

    private val scope= CoroutineScope(Dispatchers.IO)

    fun startRefreshData(){
        scope.launch {
            startRefreshDataUseCase()
        }

    }

}