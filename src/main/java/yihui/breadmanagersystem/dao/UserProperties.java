package yihui.breadmanagersystem.dao;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//获取注入还需要加一个@Component注解，
// @ConfigurationProperties(prefix = "people")获取前缀是people的配置
@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
