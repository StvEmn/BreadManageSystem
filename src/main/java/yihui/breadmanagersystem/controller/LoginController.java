package yihui.breadmanagersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

//import org.apache.shiro.authc.UsernamePasswordToken;
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        //如果是Ajax请求，返回json字符串
        return "/login";
    }

    @PostMapping("/user/login")
    public String loginInMain(@RequestParam("username") String username,//用户名
                              @RequestParam("password") String password,//密码
                              Map<String, Object> map,
                              //设置变量session
                              HttpSession session,
                              HttpServletResponse response) throws IOException {
//        UsernamePasswordToken token =  new UsernamePasswordToken()
        if ("admin".equals(username) && "123456".equals(password)) {
            session.setAttribute("user", username);
            return "redirect:/index";
        } else {
            map.put("msg", "账号或密码出错");
            response.sendRedirect("/login");
            return response.encodeRedirectURL("/login");
            //账号或密码错误
//            map.put("msg", "账号或密码出错");
//            return "/login";
        }
    }
}
