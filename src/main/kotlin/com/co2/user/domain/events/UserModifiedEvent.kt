package com.co2.user.domain.events

import com.co2.user.commonApplicationEvent.DomainEvent
import com.co2.user.domain.model.User

class UserModifiedEvent(private val eventSource: Any, val modifiedUser: User) : DomainEvent(eventSource)