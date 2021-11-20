package com.kanyideveloper.plugins

import com.kanyideveloper.routes.chickens
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    

    routing {

        chickens()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
