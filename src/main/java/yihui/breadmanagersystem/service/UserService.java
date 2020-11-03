package yihui.breadmanagersystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.entity.User;
import yihui.breadmanagersystem.mapper.UserMapper;

@Service
public class UserService implements UserMapper {
    @Autowired
    UserMapper userMapper;

    // 查（ByUsername）
    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public User selectAll() {
        return userMapper.selectAll();
    }

    // 增
    @Override
    public boolean add(User user) {
        return userMapper.add(user);
    }

    // 删
    @Override
    public boolean deleteById(Integer id) {
        return false;
    }

    @Override
    public boolean deleteByUsername(String username) {
        return false;
    }

    // 改
    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }
}

