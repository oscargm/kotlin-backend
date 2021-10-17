package com.co2.user.domain.model.event

import com.co2.user.domain.model.event.domainEvents.EventCreatedDomainEvent
import com.co2.user.domain.model.event.domainEvents.EventDateRescheduledDomainEvent
import com.co2.user.domain.model.event.exceptions.InvalidDate
import com.co2.user.domain.model.shared.DomainEventCollection

// https://github.com/picodotdev/blog-ejemplos/blob/master/DomainDrivenDesignHexagonalArchitecture/src/main/java/io/github/picodotdev/blogbitix/dddhexagonal/catalog/domain/model/event/Event.java

open class Event {


  private var id: EventId
    get() {
      return this.id
    }

  private var status: EventStatus
    get() {
      return this.status
    }

  private var schedule: EventSchedule
    get() {
      return this.schedule
    }

  private var domainEvents: DomainEventCollection
    get() {
      return this.domainEvents
    }

  constructor(id: EventId, schedule: EventSchedule) {
    this.id = id
    this.status = EventStatus.ACTIVE
    this.schedule = schedule
    this.domainEvents = DomainEventCollection()
  }

  fun create(id: EventId, schedule: EventSchedule): Event {
    if (!schedule.isFutureDate()) {
      throw InvalidDate()
    }
    var event = Event(id, schedule)
    event.domainEvents.add(EventCreatedDomainEvent(event.id))
    return event
  }

  fun activate() {
    this.status = EventStatus.ACTIVE
  }

  fun cancel() {
    this.status = EventStatus.CANCELLED
  }

  fun hide() {
    this.status = EventStatus.HIDDEN
  }

  fun rescheduleDate(schedule: EventSchedule) {
    this.schedule = schedule
    domainEvents.add(EventDateRescheduledDomainEvent(this.id))
  }

}