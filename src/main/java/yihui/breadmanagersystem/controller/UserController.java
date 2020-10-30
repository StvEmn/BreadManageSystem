package yihui.breadmanagersystem.controller;

import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.entity.User;
import yihui.breadmanagersystem.service.UserService;

import java.util.List;

@RestController
public class UserController {
    //自动注入
    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //查询所有用户
    @GetMapping(value = "/user/allUser")
    private List<User> userList() {
        return userService.findAll();
    }

    //查询某个用户
    @GetMapping(value = "/user/{username}")
    public List<User> findByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

    //添加用户
    @PostMapping("/user/addUser")
    public int addUser(@RequestParam("username") String username,
                       @RequestParam("password") String password) {
        return userService.Add(username, password);
    }

    //删除用户
    @PostMapping(value = "/user/deluser")
    public int deleteByUsername(@RequestParam("username") String username) {
        return userService.deleteByUsername(username);
    }

    // 更新密码
    @PostMapping("/user/modify")
    public int userChangePassword(@RequestParam("username") String username,
                                  @RequestParam("password") String password) {
        return userService.modify(username, password);
    }
}
