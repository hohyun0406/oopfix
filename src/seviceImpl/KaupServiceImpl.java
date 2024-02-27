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
        double bmi = 0.0;

        bmi = (weight/(height*height)*10000);

        return String.valueOf(bmi);    }

    @Override
    public String createBodyMass() {
        String bodyMass = "";
//        if (bmi < 18.5) {
//            bodyMass = "저체중";
//        } else if (bmi < 23) {
//            bodyMass = "정상";
//        } else if (bmi < 25) {
//            bodyMass = "위험체중";
//        } else if (bmi < 30) {
//            bodyMass = "1단계 비만";
//        } else {
//            bodyMass = "2단계 비만";
//        }
        return bodyMass;
    }
}
