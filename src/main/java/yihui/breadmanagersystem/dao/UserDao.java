package yihui.breadmanagersystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import yihui.breadmanagersystem.Entry.User;

import java.util.List;
/*
编写一个数据库操作自定义接口，定制操作接口，这里只演示定制查询接口
 */

public interface UserDao extends JpaRepository<User, String> {
    public List<User> findByUser(String username);

}
