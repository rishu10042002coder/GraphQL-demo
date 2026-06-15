package com.demo.garphQL.Service;

import com.demo.garphQL.Entity.User;
import com.demo.garphQL.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User createUser(String name, String email, String phone, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
