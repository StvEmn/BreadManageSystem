package yihui.breadmanagersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import yihui.breadmanagersystem.entity.User;
import yihui.breadmanagersystem.service.AuthenticationService;
import yihui.breadmanagersystem.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/authentication")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;
    private UserService userService;

    public AuthenticationController(AuthenticationService authenticationService, UserService userService) {
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public Object login(@RequestBody User user) throws JSONException {
        User userInDataBase= userService.selectByUsername(user.getUsername());
        JSONObject json = new JSONObject();
        if (userInDataBase == null) {
            json.put("message", "用户不存在");
        } else if (!userInDataBase.getPassword().equals(user.getPassword())) {
            json.put("message", "密码不正确");
        } else {
            String token = authenticationService.getToken(userInDataBase);
            json.put("token", token);
            json.put("user", userInDataBase);
        }
        System.out.println(json);
        return json;
    }
}
