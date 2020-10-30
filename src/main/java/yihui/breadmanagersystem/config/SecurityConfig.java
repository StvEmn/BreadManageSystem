package yihui.breadmanagersystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/*
基于配置类实现创建用户名和密码
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 自定义实现类登录认证
    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(password());
    }

    @Bean
    PasswordEncoder password() {
        return new BCryptPasswordEncoder();
    }

    // 自定义登录页面以及那些页面不需要登录可以访问
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()    // 定义登录的时候转到自己的登录页面
                .loginPage("/login")    //登录页面设置
                .loginProcessingUrl("/user/login") //定义登录访问的路径（表单提交地址）
                .defaultSuccessUrl("/").permitAll()    //登录成功后跳转的路径
                .and().authorizeRequests() //定义那些url访问需要认证，哪些访问不需要认证
                //【"/","/hello","/login","/user/login"】这些不需要登录就可以访问
                .antMatchers("/login", "/user/login", "/static/**", "/img/**", "/font-awesome-4.7.0/**", "/css/**", "/js/**", "/icons/**").permitAll()
                .anyRequest().authenticated()   //所有请求都可以访问
                .and().csrf().disable();   //关闭csrf的防护
    }
}
