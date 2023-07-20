package com.sachinkumar.hireme.Controllers;

import com.sachinkumar.hireme.Models.JobPost;
import com.sachinkumar.hireme.Models.User;
import com.sachinkumar.hireme.Respository.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthController {

    @Autowired
    AuthRepo authRepo;

    @GetMapping("/")
    public String hello()
    {
        return "Hello World";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user)
    {

        List<User> users = authRepo.findAll();
        for(User u:users)
        {
            if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword()))
            {
                return "User Already Registered";
            }
        }

        authRepo.save(user);
        return "User Registered";
    }

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return authRepo.findAll();
    }

    @PostMapping("/login")
    public String login(@RequestBody User user)
    {
        List<User> users = authRepo.findAll();
        for(User u:users)
        {
            if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword()))
            {
                return "Login Successful";
            }
        }
        return "Login Failed";
    }

    @PostMapping("/deleteUser")
    public String deleteUser(@RequestBody User user)
    {


        return "User Deleted";
    }

}
