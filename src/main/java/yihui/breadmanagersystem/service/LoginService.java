package yihui.breadmanagersystem.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.mapper.UserMapper;

import java.util.List;

// SecurityConfig自定义实现类的 实现
@Service("userDetailsService")
public class LoginService implements UserDetailsService {

    //报错的话需要在UserMapper中添加@Respository注解
    private final UserMapper userMapper;

    public LoginService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 调用userRepository方法。根据用户名查询数据库
        QueryWrapper<yihui.breadmanagersystem.entity.User> wrapper = new QueryWrapper();
        // where username = ?
        wrapper.eq("username", username);
        yihui.breadmanagersystem.entity.User user = userMapper.selectOne(wrapper);
        // 查完之后做判断
        if (user == null) { // 数据库中没有这个用户，认证失败
            throw new UsernameNotFoundException("用户名不存在");
        } else {
            List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
            // 从查询数据库返回user对象，得到用户名称和密码，返回
            return new User(user.getUsername(), new BCryptPasswordEncoder().encode(user.getPassword()), auths);
        }
    }



}
