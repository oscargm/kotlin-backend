package com.co2.user.api.controllers

import com.co2.user.application.query.UserQuery
import com.co2.user.domain.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val userQuery: UserQuery) {
    @GetMapping("/user")
    fun findAllUsers(): ResponseEntity<User> {

        return "user"
    }
}