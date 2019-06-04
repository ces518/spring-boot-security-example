package me.june.springbootsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-06-03
 * Time: 23:17
 **/
@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }

    // /my 요청만 인증을 필요도하도록 구현
    @GetMapping("/my")
    public String my () {
        return "my";
    }
}
