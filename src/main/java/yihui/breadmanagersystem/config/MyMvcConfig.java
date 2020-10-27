package yihui.breadmanagersystem.config;


import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import yihui.breadmanagersystem.handler.LoginHandlerIntercetor;

/*
拦截器
 */
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //将 login.html映射到路径urlPath为："/"上
        registry.addViewController("/").setViewName("login");

        //将 login.html映射到路径urlPath为："/login"上
        registry.addViewController("/login").setViewName("login");

        // index.html映射到路径urlPath为："/index"上
        registry.addViewController("/index").setViewName("index");
    }

    // 注册拦截器的
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截哪些请求
        registry.addInterceptor(new LoginHandlerIntercetor()).addPathPatterns("/**")
                //排除哪些请求
                .excludePathPatterns("/login", "/", "/user/login");
    }
}
