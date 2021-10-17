package com.co2.user.domain.model.event.domainEvents

import com.co2.user.domain.model.event.EventId
import com.co2.user.domain.model.shared.DomainEvent

class EventCreatedDomainEvent : DomainEvent {

  private var eventId: EventId
    get() {
      return this.eventId
    }

  constructor(eventId: EventId) : super() {
    this.eventId = eventId
  }
}