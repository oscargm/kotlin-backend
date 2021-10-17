package com.co2.user.domain.model.event

import com.co2.user.domain.model.event.exceptions.InvalidDate
import java.time.LocalDateTime
import java.time.format.DateTimeParseException

class EventDate {

  constructor(datetime: LocalDateTime) {
    this.datetime = datetime
  }

  private final var datetime: LocalDateTime
    get() {
      return this.datetime
    }

  private fun getDateTime(): LocalDateTime {
    return this.datetime
  }


  fun isAfter(datetime: EventDate): Boolean {
    return this.datetime.isAfter(datetime.getDateTime())
  }

  fun isFutureDate(): Boolean {
    return this.datetime.isAfter(LocalDateTime.now())
  }

  fun valueOf(datetime: String): EventDate {
    return EventDate(toDate(datetime))
  }

  fun toDate(date: String): LocalDateTime {
    try {
      return LocalDateTime.parse(date)
    } catch (ex: DateTimeParseException) {
      throw InvalidDate()
    }
  }
}