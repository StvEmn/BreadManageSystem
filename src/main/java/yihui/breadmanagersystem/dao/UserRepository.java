package yihui.breadmanagersystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import yihui.breadmanagersystem.entity.User;

import java.util.List;

/*
接下来就可以进行user表的增删改查了
这个UserRepository接口的功能，与SSM框架中 dao 层接口功能有异曲同工之妙；
在SSM框架中，Service层通过该接口，间接执行Mybatis数据库映射文件(.xml)里的
相应sql语句，执行数据库增删改查的操作。(Mapper自动实现DAO接口)
用户查询的接口
 */
//用户查询的接口
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //查询所有用户
    @Query(value = "select * from User u", nativeQuery = true)
    public List<User> findAll();

    //通过username查询
    @Query(value = "select * from  User u where u.username= :username", nativeQuery = true)
    public List<User> findByUsername(String username);

    //删除用户
    @Modifying
    @Query(value = "delete from User u where u.username= :username")
    public int deleteByUsername(String username);

    //添加用户
    @Modifying
    @Query(value = "insert into user(username,password) value(?1,?2)", nativeQuery = true)
    public int Add(String username, String password);

    //修改用户
    @Modifying
    @Query(value = "update user set password=?2 where username=?1", nativeQuery = true)
    public int modify(String username, String password);

}
