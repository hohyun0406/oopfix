package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();
    Map<String, ?> kaupMap;
    List<?> kaupList;


    private KaupServiceImpl(){
        this.kaupMap = new HashMap<>();
        this.kaupList = new ArrayList<>();
    }


    public static KaupService getInstance(){return instance;}
    @Override
    public String createBmi(User user) {
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
