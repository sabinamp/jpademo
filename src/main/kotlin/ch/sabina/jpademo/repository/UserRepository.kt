package ch.sabina.jpademo.repository

import ch.sabina.jpademo.model.UserM
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserM, Long>

//some JpaRepository functions
//List<T> findAll(): To fetch all the data
//List<T> findAll(Sort var1) : To fetch all the data in sort
//List<T> findAllById(Iterable<ID> var1): To fetch data by ID
//<S extends T> List<S> saveAll(Iterable<S> var1): To insert data using the list of a data