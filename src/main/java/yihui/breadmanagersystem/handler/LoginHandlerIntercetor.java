package yihui.breadmanagersystem.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@: 登录状态检查的拦截器
 */
public class LoginHandlerIntercetor implements HandlerInterceptor {
    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取session中的user属性
        Object user = request.getSession().getAttribute("user");
        if (user == null){
            // 未登录，返回登录页面
            request.getRequestDispatcher("/login").forward(request, response); // 获取到转发器
            request.setAttribute("msg", "请先登录");
            return false;
        }
        else {
            // 已登录，放行请求
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
