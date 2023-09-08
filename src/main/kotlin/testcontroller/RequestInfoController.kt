package testcontroller


import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RequestInfoController {
    @RequestMapping("/info/**")
    fun info(
        @RequestHeader headers: Map<String, String>,
        method: HttpMethod,
        @RequestParam params: Map<String, String>,
        request: HttpServletRequest
    ): RequestInfo {

        return RequestInfo(headers, params, method.toString(), request.requestURI)
    }


}