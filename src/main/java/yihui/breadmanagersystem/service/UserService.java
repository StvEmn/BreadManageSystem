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
    private UserRepository repository;

    // 查询所有用户
    public List<User> findAll() {
        return repository.findAll();
    }

    //通过username查询
    public List<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    //添加用户
    public int Add(String username, String password) {
        return repository.Add(username, password);
    }

    //删除用户
    public int deleteByUsername(String username) {
        return repository.deleteByUsername(username);
    }

    //修改密码
    public int modify(String username, String password) {
        return repository.modify(username, password);
    }
}

