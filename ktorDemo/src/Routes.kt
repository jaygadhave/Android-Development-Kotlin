package com.example.ktor

import com.google.gson.JsonArray
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.User() {
    get("/")
    {
        call.respondText("Hello Jenil")

    }

    get("/user")
    {
        val list = arrayListOf<Quiz>(
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
            Quiz("What is My Name?", "Jenil", "Akshar", "Sonu", "Sheela", "Jenil"),
        )
        val data = hashMapOf<String, ArrayList<Quiz>>(Pair("Quiz", list))
        call.respond(data)
    }
    get("/jenil/{id}")
    {
        val id = call.parameters["id"]
        call.respondText("id is $id")
    }
    delete("/path") {}
}