package yihui.breadmanagersystem.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yihui.breadmanagersystem.entity.User;
import yihui.breadmanagersystem.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserMapper {
    @Autowired
    UserMapper userMapper;

    // 查
    @Override
    public List<User> select(QueryWrapper<User> wrapper) {
        return userMapper.select(wrapper);
    }


    // 查（ByUsername）
    @Override
    public List<User> selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public List<User> selectAll() {
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

