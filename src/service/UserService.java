package service;

import model.UserDto;

import java.util.List;
import java.util.Map;

public interface UserService {

    String addUsers();

    String countUser();

    Map<String,UserDto> getUserMap();

    String join(UserDto build);

    String login(UserDto build);
}
