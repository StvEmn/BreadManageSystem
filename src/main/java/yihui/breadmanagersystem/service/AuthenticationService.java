package yihui.breadmanagersystem.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.entity.User;

import java.io.UnsupportedEncodingException;

@Service
public class AuthenticationService {
    public String getToken(User user) {
        String token = "";
        token = JWT.create()
                .withAudience(user.getId().toString())          // 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));   // 以 password 作为 token 的密钥
        return token;
    }
}