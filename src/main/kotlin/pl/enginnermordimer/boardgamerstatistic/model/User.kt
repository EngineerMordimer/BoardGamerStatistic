package pl.enginnermordimer.boardgamerstatistic.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "t_user")
data class User(

    @Id val id: Long,
    @Column(name = "bg_username") val bgUserName: String
)