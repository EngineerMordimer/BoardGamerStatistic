package pl.enginnermordimer.boardgamerstatistic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pl.enginnermordimer.boardgamerstatistic.model.User
import pl.enginnermordimer.boardgamerstatistic.service.BggService
import pl.enginnermordimer.boardgamerstatistic.service.CustomService
import pl.enginnermordimer.boardgamerstatistic.service.UserService

@RestController
class HelloController(
    val userService: UserService,
    val customService: CustomService,
    val bggService: BggService
) {

    @GetMapping("/")
    fun index(): String {
        return "Test - it's working!"
    }

    @GetMapping("/checkConnection")
    fun checkConnection(): List<User> = customService.usersBySql()

    @GetMapping("/user/getAll")
    fun getAll(): MutableIterable<User> = userService.findAll()

    @GetMapping("/user")
    fun getUserById(@RequestParam id: Long): User? = userService.findUserById(id)

    @GetMapping("/bgg/checkConnection")
    fun bggCheckConnection(): String? = bggService.getCustomGame()

    @GetMapping("/bgg/boardgame")
    fun bggCheckConnection(@RequestParam id: Long): String? = bggService.getGameById(id)

}