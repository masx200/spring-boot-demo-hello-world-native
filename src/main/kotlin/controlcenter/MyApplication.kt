package controlcenter

import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
//@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
@SpringBootApplication
class MyApplication {

    @RequestMapping("/")
    fun home() = "Hello World!"

}


