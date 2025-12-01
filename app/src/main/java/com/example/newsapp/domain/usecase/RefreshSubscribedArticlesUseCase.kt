package com.example.newsapp.domain.usecase

import com.example.newsapp.domain.repository.NewsRepository
import com.example.newsapp.domain.repository.SettingsRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class RefreshSubscribedArticlesUseCase @Inject constructor(
    private val newsRepository: NewsRepository,
    private val settingsRepository: SettingsRepository
) {
    suspend operator fun invoke():List<String> {
        val settings=settingsRepository.getSettings().first()
        return newsRepository.refreshArticlesForAllSubscriptions(settings.language)
    }
}
