package pl.enginnermordimer.boardgamerstatistic.service

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import pl.enginnermordimer.boardgamerstatistic.model.User
import pl.enginnermordimer.boardgamerstatistic.repository.UserRepository

@Service
class UserService(val db: UserRepository) {

    fun findAll(): MutableIterable<User> = db.findAll()

    fun findUserById(id: Long): User? = db.findByIdOrNull(id)

}