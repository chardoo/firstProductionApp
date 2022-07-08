package com.example.firstproductioncode.services;
import com.example.firstproductioncode.entities.User;
import org.springframework.beans.factory.annotation.*;
import com.example.firstproductioncode.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return  "succefully created a user";
    }
}
