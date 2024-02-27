package service;

import model.UserDto;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String join(Scanner sc); //회원가입 감사합니다
    String login();
    String addUsers();
    UserDto findUser (String username);
    Map<String, UserDto> getUserMap();
    String count();

}
