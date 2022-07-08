package com.example.firstproductioncode.restServices;
import com.example.firstproductioncode.entities.User;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.firstproductioncode.services.UserService;
import com.example.firstproductioncode.repository.UserRepository;
import com.example.firstproductioncode.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import  javax.*;
import java.awt.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")


public class UserEndpoints {
    private static final Logger logger = LoggerFactory.getLogger(UserEndpoints.class);
//
//    @Autowired
//    UserService userService;
     UserService userService;

    public UserEndpoints(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  addUser( @RequestBody User user){
        logger.info("hhehehe");
        String me =   this.userService.addUser(user);
        return ResponseEntity.ok(me);
    }
    @GetMapping(value = "/getAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>  addUser(){
        String response = "he to  the only God";
        logger.info("hhehehe");

        return ResponseEntity.ok(response);
    }

}
