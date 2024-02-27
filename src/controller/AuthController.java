package controller;

import model.UserDto;
import service.AuthService;
import seviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;

    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner sc) {
        return auth.join(sc);
    }

    public String login() {
        return auth.login();
    }

    public void addUsers() {
        auth.addUsers();
    }

    public void findUser(String username) {
        auth.findUser(username);
    }

    public Map<String, UserDto> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        return null;
    }

}