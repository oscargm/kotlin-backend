package com.co2.user.domain.model.shared

import java.util.*

class DomainEventId {

  private val id: UUID

  constructor(id: UUID) {
    this.id = id
  }

  fun getValue(): String {
    return this.id.toString()
  }
}