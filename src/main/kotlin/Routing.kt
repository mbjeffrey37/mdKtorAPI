package com.milkdrop

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Delivery DB API Started")
        }
        get("/api/test") {
            call.respondText("API Test Successful")
        }
    }
}