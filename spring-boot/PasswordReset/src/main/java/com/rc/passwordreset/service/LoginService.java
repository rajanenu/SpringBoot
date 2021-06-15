package com.rc.passwordreset.service;

import com.rc.passwordreset.model.LoginUser;
import com.rc.passwordreset.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public LoginUser saveUser(LoginUser user) {
        return loginRepository.save(user);
    }

    public List<LoginUser> saveUsers(List<LoginUser> users) {
        return loginRepository.saveAll(users);
    }

    public List<LoginUser> getAllUsers() {
        return loginRepository.findAll();
    }

    public LoginUser getUserByNUID(String nuid) {
        return loginRepository.findByNUID(nuid);
    }

}
