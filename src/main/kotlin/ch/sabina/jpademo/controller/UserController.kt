package ch.sabina.jpademo.controller

import ch.sabina.jpademo.repository.*
import ch.sabina.jpademo.model.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
class UserController{
    @Autowired
    private lateinit var userRepository: UserRepository

    // to get all the users details
    @GetMapping("/users")
    fun getAllUsers(): List<UserM>{
        return userRepository.findAll()
    }
}