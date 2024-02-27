package seviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtillService;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();
    private AuthServiceImpl(){}

    public static AuthService getInstance(){
        return instance;
    }

    @Override
    public String join() {
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public Map<String, UserDto> addUsers() {
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
        return map;
    }

    @Override
    public void findUser(String username) {

    }
}
