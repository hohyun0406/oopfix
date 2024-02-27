package service;

import model.UserDto;

import java.util.Map;

public interface AuthService {
    public String join();
    public String login();
    Map<String, UserDto> addUsers();
    void findUser (String username);
}
