package com.example.newsapp.presentation.screens.subscriptions

import com.example.newsapp.domain.entity.Article

data class SubscriptionUIState(
    val query: String = "",
    val subscriptions: Map<String, Boolean> = mapOf(),
    val articles: List<Article> = listOf()
) {
    val subscribeButtonEnabled: Boolean
        get() = query.isNotBlank()
    val selectedTopics: List<String>
        get() = subscriptions.filter { it.value }.map { it.key }
}

