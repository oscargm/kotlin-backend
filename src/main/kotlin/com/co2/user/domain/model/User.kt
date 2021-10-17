package com.co2.user.domain.model

import com.co2.user.common.AggregateRoot
import com.co2.user.domain.events.UserCreatedEvent
import com.co2.user.domain.events.UserModifiedEvent

class User : AggregateRoot {
  constructor() {
    addDomainEvent(UserCreatedEvent(this, this))
  }

  constructor(id: Int, username: String, password: String) {
    this.id = id
    this.username = username
    this.password = password
    addDomainEvent(UserCreatedEvent(this, this))
  }

  private var id: Int
    get() {
      return this.id
    }
    set(id: Int) {
      this.id = id
      addDomainEvent(UserModifiedEvent(this, this))
    }

  private var username: String
    get() {
      return this.username
    }
    set(username: String) {
      this.username = username
      addDomainEvent(UserModifiedEvent(this, this))
    }

  private var password: String
    get() {
      return this.password
    }
    set(password: String) {
      this.password = password
      addDomainEvent(UserModifiedEvent(this, this))
    }

}