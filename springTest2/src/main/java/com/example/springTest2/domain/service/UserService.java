package com.example.springTest2.domain.service;


import com.example.springTest2.pojo.LoginInfo;
import com.example.springTest2.domain.repository.UserRepository;
import com.example.springTest2.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users getUserById(Integer id) {
        return userRepository.getUserById(id);
    }



    public Users getUserByNameAndPassword(LoginInfo loginInfo) {
        return userRepository.getUserByNameAndPassword(loginInfo.getUsername(), loginInfo.getPassword());
    }
}
