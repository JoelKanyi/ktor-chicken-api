package com.kanyideveloper.routes

import com.kanyideveloper.data.model.Chicken
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://192.168.43.76:8080"

private val chicken = listOf(
    Chicken("Chicken 1", "Chicken one description", "$BASE_URL/chicken/chicken_one.jpg"),
    Chicken("Chicken 2", "Chicken two description", "$BASE_URL/chicken/chicken_two.jpg"),
    Chicken("Chicken 3", "Chicken three description", "$BASE_URL/chicken/chicken_three.jpg"),
    Chicken("Chicken 4", "Chicken four description", "$BASE_URL/chicken/chicken_four.jpg"),
    Chicken("Chicken 5", "Chicken five description", "$BASE_URL/chicken/chicken_five.jpg")
)

fun Route.chickens(){
    get("/chickens"){
        call.respond(
            HttpStatusCode.OK,
            chicken
        )
    }
}