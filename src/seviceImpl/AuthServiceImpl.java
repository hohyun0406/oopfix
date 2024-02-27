package seviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtillService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    Map<String, UserDto> users;
    private AuthServiceImpl(){
        this.users = new HashMap<>();
    }

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String join(Scanner sc) {
        System.out.println("id,비밀번호,비밀번호확인, 이름, 주민번호,전화번호,주소, 직업을 입력하십시오.");

        UserDto user = new UserBuilder()
                .username(sc.next())
                .password(sc.next())
                .confirmPassword(sc.next())
                .name(sc.next())
                .jmNumber(sc.next())
                .callNumber(sc.next())
                .address(sc.next())
                .job(sc.next())
                .build()
                ;
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtillService util = UtillServiceImpl.getInstance();
        String newUsername = util.createRandomUsername();

        for(int i = 0 ; i<5 ; i++){
            map.put(newUsername,
                    new UserBuilder()
                            .username(newUsername)
                            .password("1")
                            .confirmPassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public UserDto findUser(String username) {
        UserDto user = new UserBuilder().build();
        return user;
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        users.forEach((k,v)-> System.out.print("{"+k+","+v+"}"));
        return users;
    }

    @Override
    public String count() {
        return users.size()+"";
    }
}
