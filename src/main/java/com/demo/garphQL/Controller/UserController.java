package com.demo.garphQL.Controller;


import com.demo.garphQL.Entity.User;
import com.demo.garphQL.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @MutationMapping
    public User createUser(@Argument String name, @Argument String email,@Argument String phone,@Argument String password) {
        return userService.createUser(name,email,phone,password);
    }

    @QueryMapping
    public List<User> getUsers() {
        return userService.findAllUser();
    }
    @QueryMapping
    public User getUser(@Argument int id) {
        return userService.getUser(id);
    }
}
