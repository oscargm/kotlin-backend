package com.co2.user.domain.model.shared

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

open class DomainEvent {

  private var id: DomainEventId
    get() {
      return this.id
    }
  private var date: LocalDateTime
    get() {
      return this.date
    }
  private var data: Map<String, Object>
    get() {
      return this.data
    }


  constructor() {
    this.id = DomainEventId(UUID.randomUUID())
    this.date = LocalDateTime.now(ZoneId.of("UTC"))
    this.data = Collections.emptyMap<String, Object>()
  }

  constructor(data: Map<String, Object>) {
    this.id = DomainEventId(UUID.randomUUID())
    this.date = LocalDateTime.now(ZoneId.of("UTC"))
    this.data = data
  }

}