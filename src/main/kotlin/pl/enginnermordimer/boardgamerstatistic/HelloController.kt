package pl.enginnermordimer.boardgamerstatistic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import pl.enginnermordimer.boardgamerstatistic.model.User
import pl.enginnermordimer.boardgamerstatistic.service.UserService

@RestController
class HelloController(val service: UserService) {

    @GetMapping("/")
    fun index(): String {
        return "Test - it's working!"
    }

    @GetMapping("/checkConnection")
    fun checkConnection(): List<User> = service.usersBySql()

}