package ch.sabina.jpademo.controller

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.beans.factory.annotation.Autowired


@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest{
    @Autowired
    private val mvc: MockMvc? = null

    @Test
    @kotlin.Throws(Exception::class)
    fun getUserOne() {
        mvc?.perform(MockMvcRequestBuilders.get("/user/1").accept(MediaType.APPLICATION_JSON))
                ?.andExpect(status().isOk())

    }
    @Test
    @kotlin.Throws(Exception::class)
    fun getUser5() {
        mvc?.perform(MockMvcRequestBuilders.get("/user/5").accept(MediaType.APPLICATION_JSON))
                ?.andExpect(status().isOk())

    }
}