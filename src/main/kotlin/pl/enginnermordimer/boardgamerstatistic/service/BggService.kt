package pl.enginnermordimer.boardgamerstatistic.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class BggService() {

    val restTemplate: RestTemplate = RestTemplate()

    // TODO show full xml
    fun getCustomGame(): String? = restTemplate.getForObject(
        "https://boardgamegeek.com/xmlapi2/thing?type=boardgame&id=312484", String::class
    )

}