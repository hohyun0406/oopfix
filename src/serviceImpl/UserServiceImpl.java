package serviceImpl;

import builder.UserBuilder;
import model.UserDto;

import repository.UserRepository;
import service.UserService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    Map<String, UserDto> users;

    public UserServiceImpl() {
        this.userRepository = new UserRepository();
        users = new HashMap<>();
    }


    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = serviceImpl.UtilService.getInstance();


        for(int i = 0 ; i<5 ; i++){
            String newUsername = util.createRandomUsername();
            map.put(newUsername,
                    new UserBuilder()
                            .username(newUsername)
                            .password("1")
                            .confirmPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return users.size()+"개 더미값 추가";
    }

    @Override
    public String countUser() {
        return users.size()+"";
    }

    @Override
    public Map<String,UserDto> getUserMap() {
        return users;
    }

    @Override
    public String join(UserDto build) {
        users.put(build.getUsername(), build);
        return "회원가입 성공";
    }

    @Override
    public String login(UserDto build) {
        String msg;

        String inputUsername = build.getUsername();
        String inputPassword = build.getPassword();

        UserDto specificUserDto = users.get(inputUsername);

        if (specificUserDto==null){
            msg = "아이디가 틀렸습니다.";
        }else if (specificUserDto.getPassword()!=inputPassword){
            msg = "비밀번호가 틀렸습니다.";
        }else{
            msg = "로그인 성공";
        }
        return msg;
    }


}
