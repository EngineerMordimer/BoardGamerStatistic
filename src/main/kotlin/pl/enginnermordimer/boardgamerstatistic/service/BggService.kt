package pl.enginnermordimer.boardgamerstatistic.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class BggService() {

    val restTemplate: RestTemplate = RestTemplate()

    @Value("\${bgg.url.base}")
    lateinit var baseBggUrl: String

    @Value("\${bgg.url.things}")
    lateinit var thingsBggUrl: String

    // TODO show full xml
    fun getCustomGame(): String? = restTemplate.getForObject(
        "https://boardgamegeek.com/xmlapi2/thing?type=boardgame&id=312484", String::class
    )

    fun getGameById(id: Long): String? = restTemplate.getForObject(
        "$baseBggUrl$thingsBggUrl?type={type}&id={id}",
        mapOf("type" to "boardgame", "id" to id)
    )

}