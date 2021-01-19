package ch.sabina.jpademo.repository

import ch.sabina.jpademo.model.UserM
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserM, Long>

