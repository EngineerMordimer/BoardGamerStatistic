package pl.enginnermordimer.boardgamerstatistic.service

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import pl.enginnermordimer.boardgamerstatistic.model.User

@Service
class CustomService(val db: JdbcTemplate) {

    fun usersBySql(): List<User> = db.query("select * from t_user") { response, _ ->
        User(response.getLong("id"), response.getString("bg_username"))
    }

}