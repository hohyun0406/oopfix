package controller;


import builder.UserBuilder;
import model.UserDto;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class UserController {
    UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }



    public String addUsers() {
        return userService.addUsers();
    }


    public String countUser() {
        return userService.countUser();
    }

    public Map<String, UserDto> getUserMap() {
        return userService.getUserMap();
    }

    public String join(Scanner sc) {
        return userService.join(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public String login(Scanner sc) {
        return userService.login(new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }


}
