package pl.enginnermordimer.boardgamerstatistic.repository

import org.springframework.data.repository.CrudRepository
import pl.enginnermordimer.boardgamerstatistic.model.User

interface UserRepository : CrudRepository<User, Long>