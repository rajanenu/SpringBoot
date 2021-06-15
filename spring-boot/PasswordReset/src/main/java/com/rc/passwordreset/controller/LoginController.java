package com.rc.passwordreset.controller;

import com.rc.passwordreset.model.LoginUser;
import com.rc.passwordreset.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/password-reset")
public class LoginController {

    private static final Logger log =
            LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @PostMapping("/users/addUser")
    public void addUser(LoginUser user) {
        loginService.saveUser(user);
    }

    @GetMapping("/users/getAllUsers")
    public List<LoginUser> getUsers() {
        return loginService.getAllUsers();
    }

    @GetMapping("/users/{nuid}")
    public LoginUser findUserByNUID(@PathVariable String nuid) {
        return loginService.getUserByNUID(nuid);
    }

}
