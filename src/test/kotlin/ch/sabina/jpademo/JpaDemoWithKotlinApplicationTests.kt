package ch.sabina.jpademo


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.springframework.boot.test.context.SpringBootTest
import ch.sabina.jpademo.controller.UserController
import org.springframework.beans.factory.annotation.Autowired



@SpringBootTest
class JpaDemoWithKotlinApplicationTests {

	@Autowired
	private val controller: UserController? = null

	@Test
	@Throws(Exception::class)
	fun contextLoads() {
		Assertions.assertNotNull(controller);
	}

}
