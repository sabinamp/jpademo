package ch.sabina.jpademo.model

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name="user_jpa")
/**JPA entity listener to capture auditing information on persiting and updating entities.
 * To get this one flying be sure you configure it as entity listener in your orm.xml as follows:
 * */
@EntityListeners(AuditingEntityListener::class)
data class UserM(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        var id: Long = 0,

        @NotBlank
        @Column(name = "name")
        var name: String ?= null,

        @NotBlank
        @Column(email = "email")
        var email: String ?= null,

        @NotBlank
        @Column(name = "contact_nb")
        var contact_nb: String ?= null

)