package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.Impl.UserServiceImpl;
import yihui.breadmanagersystem.entity.User;

import java.util.List;
@CrossOrigin
@RestController
public class UserController {
    //自动注入
    @Autowired
    UserServiceImpl userService;

    //查询所有用户
    @GetMapping(value = "/user/allUser")
    private List<User> userList() {
        return userService.selectAll();
    }

    //查询某个用户
    @GetMapping(value = "/user/{username}")
    public List<User> findByUsername(@PathVariable("username") String username) {
        return userService.selectByUsername(username);
    }

    //添加用户
    @PostMapping("/user/addUser")
    public boolean addUser(User user) {
        List<User> userList = userService.selectByUsername(user.getUsername());
        if (userList != null) { //如果存在这个用户返回false
            return false;
        } else {
            return userService.add(user);
        }
    }

    //删除用户(by id)
    @GetMapping(value = "/user/deluser?id={id}")
    public boolean deleteById(@PathVariable("id") Integer id) {
        return userService.deleteById(id);
    }

    //删除用户(by username)
    @GetMapping(value = "/user/deluser?username={username}")
    public boolean deleteByUsername(@PathVariable("username") String username) {
        return userService.deleteByUsername(username);
    }


    // 更新密码
    @PostMapping("/user/modify")
    public boolean userChangePassword(User user) {
        List<User> userList = userService.selectByUsername(user.getUsername());
        if (userList != null) {
            User user1 = userList.get(0);
            Integer id = (Integer) user1.getId();
            user.setId(id);
            return userService.update(user);
        } else {
            return false;
        }


    }
}
