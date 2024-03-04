package service;

import model.User;

public interface KaupService {
    String createBmi(User user);

    String createBodyMass(String bmi);
}
