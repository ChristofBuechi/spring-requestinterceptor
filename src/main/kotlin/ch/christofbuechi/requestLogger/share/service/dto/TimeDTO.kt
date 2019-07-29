package ch.christofbuechi.requestLogger.share.service.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

/**
 * A DTO representing a user, with his authorities.
 */
open class TimeDTO(

    @field:NotBlank
    @field:Size(min = 1, max = 50)
    var time: String? = null
) {

    override fun toString() = "TimeDTO{" +
        "time='" + time + '\'' +
        "}"
}
