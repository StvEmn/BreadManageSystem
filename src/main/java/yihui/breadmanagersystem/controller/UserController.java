package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.entity.User;
import yihui.breadmanagersystem.service.UserService;

import java.util.List;

@RestController
public class UserController {
    //自动注入
    @Autowired
    UserService userService;

    //查询所有用户
    @GetMapping(value = "/allUser")
    private List<User> userList() {
        return userService.findAll();
    }

    //查询某个用户
    @GetMapping(value = "/user/{username}")
    public List<User> findByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

    //添加用户
    @PostMapping("/addUser")
    public int addUser(@RequestParam("username") String username,
                       @RequestParam("password") String password) {
        return userService.Add(username, password);
    }

    //删除用户
    @DeleteMapping(value = "/deluser/{username}")
    public void deleteByUsername(@PathVariable("username") String username) {
        userService.deleteByUsername(username);
    }

    // 更新密码
    @PutMapping("/user/{username}")
    public int userChangePassword(@PathVariable("username") String username,
                                  @RequestParam("Password") String password) {
        return userService.Add(username, password);
    }
}
