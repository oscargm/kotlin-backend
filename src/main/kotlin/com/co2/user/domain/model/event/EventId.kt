package com.co2.user.domain.model.event

import java.math.BigInteger

class EventId {

  constructor()
  constructor(id: BigInteger) {
    this.id = id
  }


  private var id: BigInteger
    get() {
      return this.id
    }
    set(id: BigInteger) {
      this.id = id
    }

  fun valueOf(id: String): EventId {
    return EventId(BigInteger(id))
  }

  fun valueOf(id: BigInteger): EventId {
    return EventId(id)
  }

}