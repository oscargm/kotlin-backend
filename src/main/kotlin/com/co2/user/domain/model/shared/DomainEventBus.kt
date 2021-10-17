package com.co2.user.domain.model.shared

interface DomainEventBus {
  fun publish(domainEvent: DomainEvent)

  fun publish(events: Collection<DomainEvent>) {
    events.stream().forEach(this::publish)
  }

  fun publish(collection: DomainEventCollection) {
    collection.publish(this)
  }
}