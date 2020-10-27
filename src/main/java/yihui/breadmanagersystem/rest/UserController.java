package yihui.breadmanagersystem.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.Entry.User;
import yihui.breadmanagersystem.dao.UserDao;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    /*
    查询数据库中所有用户
     */
    @GetMapping(value = "/users")
    public List<User> userList() {
        return userDao.findAll();
    }

    // 添加账号
    @PostMapping(value = "/addUser")
    public User userAdd(@RequestParam("username") String username,
                        @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userDao.save(user);
    }

//    //查询
//    @GetMapping(value = "/user/{username}")
//    public User userFindOne(@PathVariable("username") String username) {
////        return userDao.findOne(username);
//    }
}
