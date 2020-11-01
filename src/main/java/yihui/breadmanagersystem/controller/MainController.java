package yihui.breadmanagersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//视图控制
@Controller
public class MainController {

    @GetMapping("/")
    public String index_root() {
        return "/test";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @GetMapping("/uauth")
    public String uauth() {
        return "/uauth";
    }

}
