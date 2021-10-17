package com.co2.user.commonApplicationEvent

import org.springframework.context.ApplicationEvent

abstract class DomainEvent(source: Any) : ApplicationEvent(source)