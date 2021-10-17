package com.co2.user.domain.model.shared

class DomainEventCollection {

  private var events: MutableList<DomainEvent>

  constructor() {
    this.events = ArrayList<DomainEvent>()
  }

  fun getAll(): List<DomainEvent> {
    return this.events
  }

  fun add(event: DomainEvent) {
    events.add(event)
  }

  fun clear() {
    events.clear()
  }

  fun publish(eventBus: DomainEventBus) {
    eventBus.publish(events)
    clear()
  }
}