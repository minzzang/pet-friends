package com.project.petfriends

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetFriendsApplication

fun main(args: Array<String>) {
    runApplication<PetFriendsApplication>(*args)
}
