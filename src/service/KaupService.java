package service;

import model.UserDto;

public interface KaupService {
    String createBmi(UserDto user);

    String createBodyMass();
}
