package yihui.breadmanagersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.dao.UserRepository;
import yihui.breadmanagersystem.entity.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // 查询所有用户
    public List<User> findAll() {
        return userRepository.findAll();
    }

    //通过username查询
    public List<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    //添加用户
    public int Add(String username, String password) {
        return userRepository.Add(username, password);
    }

    //删除用户
    public int deleteByUsername(String username) {
        return userRepository.deleteByUsername(username);
    }

    //修改密码
    public int modify(String username, String password) {
        return userRepository.modify(username, password);
    }
}

