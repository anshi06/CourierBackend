package com.example.courier.service;/*
 * @author gauravverma
 */


import com.example.courier.model.LoginEntity;
import com.example.courier.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public LoginEntity login(LoginEntity loginEntity){
        LoginEntity details = loginRepository.findByEmailAndPassword(loginEntity.getEmail(), loginEntity.getPassword());
        return details;
    }

    public LoginEntity signUp(LoginEntity signUpDetails) {
        return loginRepository.save(signUpDetails);
    }


}
