package ch.christofbuechi.requestLogger.interceptor

import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.client.RestTemplate
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.util.function.Consumer
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class KotlinRequestInterceptor : HandlerInterceptor {

    private val log = LoggerFactory.getLogger(KotlinRequestInterceptor::class.java)


    override fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView?) {

        var url = "http://localhost:8080/springrestexample/employees.xml";

        var headers = HttpHeaders()
        headers.setContentType(MediaType.APPLICATION_JSON)

        request.headerNames.toList().forEach(Consumer {
            log.error("request intercepted from: $it")
        })

        super.postHandle(request, response, handler, modelAndView)
    }
}
