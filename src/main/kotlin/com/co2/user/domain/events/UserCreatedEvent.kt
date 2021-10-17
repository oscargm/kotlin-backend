package com.co2.user.domain.events

import com.co2.user.commonApplicationEvent.DomainEvent
import com.co2.user.domain.model.User

data class UserCreatedEvent(private val eventSource: Any, val user: User) : DomainEvent(eventSource)