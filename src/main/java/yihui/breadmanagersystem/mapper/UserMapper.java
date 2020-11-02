package yihui.breadmanagersystem.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import yihui.breadmanagersystem.entity.User;

import java.util.List;

// 出货表
@Mapper
public interface UserMapper {
    // 查询用户
    @Select("select * from user")
    List<User> select(QueryWrapper<User> wrapper);

    // 根据用户名查询用户
    @Select("select * from user where username =#{username}")
    List<User> selectByUsername(String username);

    // 查询所有
    @Select("select * from user")
    List<User> selectAll();

    // 添加用户
    @Insert("insert into user(username, password) values(#{username}, #{password})")
    boolean add(User user);

    // 删除用户
    @Delete("delete from user where id = #{id}")
    boolean deleteById(Integer id);

    // 删除用户
    @Delete("delete from user where id = #{username}")
    boolean deleteByUsername(String username);


    // 修改用户
    @Update("update user set username =#{username}, password=#{password} where id=#{id}")
    boolean update(User user);
}
