package com.example.newsapp.domain.usecase

import com.example.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class RefreshSubscribedArticlesUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke() {
        newsRepository.refreshArticlesForAllSubscriptions()
    }
}
