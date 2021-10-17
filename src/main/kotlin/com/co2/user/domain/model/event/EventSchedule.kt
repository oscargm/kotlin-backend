package com.co2.user.domain.model.event

import com.co2.user.domain.model.event.exceptions.EndDateIsBeforeStartDate

class EventSchedule {

  private constructor(startDate: EventDate, endDate: EventDate) {
    this.startDate = startDate
    this.endDate = endDate

  }

  private var startDate: EventDate
    get():EventDate {
      return this.startDate
    }


  private var endDate: EventDate
    get():EventDate {
      return this.endDate
    }

  fun isFutureDate(): Boolean {
    return this.startDate.isFutureDate()
  }

  fun eventSchedule(startDate: EventDate, endDate: EventDate): EventSchedule {
    validateStartBeforeEnd(startDate, endDate)
    return EventSchedule(startDate, endDate)
  }

  private fun validateStartBeforeEnd(startDate: EventDate, endDate: EventDate) {
    if (startDate.isAfter(endDate)) {
      throw  EndDateIsBeforeStartDate()
    }
  }

}