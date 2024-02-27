package seviceImpl;

import model.UserDto;
import service.KaupService;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    private KaupServiceImpl(){}
    public static KaupService getInstance(){return instance;}
    @Override
    public String createBmi(UserDto user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = (weight/(height*height)*10000);
        return String.valueOf(bmi);    }

    @Override
    public String createBodyMass(String bmi) {
        double bmiDouble = Double.parseDouble(bmi);
        String bodyMass = "";
        if (bmiDouble < 18.5) {
            bodyMass = "저체중";
        } else if (bmiDouble < 23) {
            bodyMass = "정상";
        } else if (bmiDouble < 25) {
            bodyMass = "위험체중";
        } else if (bmiDouble < 30) {
            bodyMass = "1단계 비만";
        } else {
            bodyMass = "2단계 비만";
        }
        return bodyMass;
    }
}
