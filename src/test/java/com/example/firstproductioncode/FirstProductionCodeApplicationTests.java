package com.example.firstproductioncode;
import org.springframework.beans.factory.annotation.*;
import com.example.firstproductioncode.entities.User;
import com.example.firstproductioncode.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProductionCodeApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    UserRepository userRepository;

    @Test
    public void addUser() {
        userRepository.save(new User(1,"micheal", "maicheal@gmail.com", "sfnig3434", "95040593434"));
        System.out.println("user created");
    }

}
