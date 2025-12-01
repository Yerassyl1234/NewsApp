package com.example.newsapp.domain.usecase

import com.example.newsapp.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateNotificationEnabledUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {
    suspend operator fun invoke(enabled: Boolean){
        settingsRepository.updateNotificationEnabled(enabled)
    }
}