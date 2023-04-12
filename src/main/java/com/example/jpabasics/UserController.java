package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/get")
    public User getUser(@RequestParam("userId") int userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/delete-all")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }

    @DeleteMapping("/delete-user-by-id")
    public String deleteUserById(@RequestParam("userId") int userId){
        return userService.deleteUserById(userId);
    }

    @PutMapping("/update-name-by-id")
    public String updateUserNameById(@RequestParam("userId") int userId, @RequestParam("name") String name){
        return userService.updateUserNameById(userId,name);
    }

}
