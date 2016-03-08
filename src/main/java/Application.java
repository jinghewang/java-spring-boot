import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hltravel on 16/3/8.
 */

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String root(String name) {
        return "Hello World:" + name;
    }


    @RequestMapping("/home")
    String home(String name) {
        return "Hello World:" + name;
    }


    @RequestMapping("/json")
    String json(String name) {
        return "{name:'wjh',age:18}";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
