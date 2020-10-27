package yihui.breadmanagersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogOutController {
    @RequestMapping("/logout")
    public String logOut(HttpSession session) {
        session.setAttribute("user", null);
        return "redirect:/login";
    }
}
