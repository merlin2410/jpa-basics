package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User Successfully Added";
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(int userId){
        return userRepository.findById(userId).get();
    }

    public String deleteAllUsers(){
        userRepository.deleteAll();
        return "All Users are deleted";
    }

    public String deleteUserById(int userId){
        userRepository.deleteById(userId);
        return "User has been deleted";
    }

    public String updateUserNameById(int userId, String name){
        User user = userRepository.findById(userId).get();
        user.setName(name);
        userRepository.save(user);
        return "User name has be successfully updated";
    }
}
