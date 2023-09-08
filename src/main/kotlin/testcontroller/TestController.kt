package testcontroller


import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @RequestMapping("/headers")
    fun headers(@RequestHeader headers: Map<String, String>): Map<String, String> {

        return headers
    }

    @RequestMapping("/params")
    fun params(@RequestParam params: Map<String, String>): Map<String, String> {

        return params
    }

    @RequestMapping("/method")
    fun method(method: HttpMethod): String {

        return method.toString()
    }

    @RequestMapping("/url/**")
    fun url(request: HttpServletRequest): String {

        return request.requestURI
    }
}