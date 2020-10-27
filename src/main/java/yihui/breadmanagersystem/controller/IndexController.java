package yihui.breadmanagersystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index_root(HttpServletRequest request) {
        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            // 未登录，返回登录页面
            // request.getRequestDispatcher("/login").forward(request, response); // 获取到转发器
            // request.setAttribute("msg", "请先登录");
            return "redirect:/login";
        } else {
            // 已登录，放行请求
            return "/index";
        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object user = request.getSession().getAttribute("user");
        // 未登录返回登录页面
        // request.setAttribute("msg", "没有权限，请先登录");
        // request.getRequestDispatcher("/login").forward(request, response);
        // response.encodeRedirectURL("/login");
        if (user == null) {
            response.sendRedirect("/login");
            return response.encodeRedirectURL("/login");
        } else {
            return "/index";
        }
    }
}
