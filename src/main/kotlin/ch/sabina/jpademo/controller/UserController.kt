package ch.sabina.jpademo.controller

import ch.sabina.jpademo.repository.UserRepository
import ch.sabina.jpademo.model.UserM
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


    // to get one specific user details
    @GetMapping("/user/{id}")
    fun getUser(@PathVariable(name = "id") id: Long): UserM {
        return userRepository.findById(id)
                .orElseThrow { ResourceNotFoundException("User", "id", id) }
    }

    // to add a user
    @PostMapping("/user/new")
    fun addUser(@Valid @RequestBody userModel: UserM): UserM {
        return userRepository.save(userModel)
    }

    // to update a user
    @PutMapping("/user/{id}")
    fun updateUser(@PathVariable(name = "id")id: Long, @Valid @RequestBody userDetails: UserM): UserM {
        val currentUser: UserM = userRepository.findById(id)
                .orElseThrow { ResourceNotFoundException("User", "id", id)}

        currentUser.name = userDetails.name
        currentUser.email = userDetails.email
        currentUser.contact_nb = userDetails.contact_nb

        return userRepository.save(currentUser)
    }

    // to delete a user
    @DeleteMapping("/user/{id}")
    fun deleteUser(@PathVariable(name = "id")id: Long): ResponseEntity<*>{
        userRepository.delete(userRepository.findById(id).get())
        return ResponseEntity.ok().build<Any>()
    }
}