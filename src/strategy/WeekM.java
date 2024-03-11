package strategy;

import java.util.Scanner;

enum Days {
    MONDAY{
        @Override
        public String sendDay(){
            return "월요일";
        }
    },
    TUESDAY{
        @Override
        public String sendDay(){
            return "화요일";
        }
    },
    WEDNESDAY{
        @Override
        public String sendDay(){
            return "수요일";
        }
    },
    THURSDAY{
        @Override
        public String sendDay(){
            return "목요일";
        }
    },
    FRIDAY{
        @Override
        public String sendDay(){
            return "금요일";
        }
    },
    SATURDAY{
        @Override
        public String sendDay(){
            return "토요일";
        }
    },
    SUNDAY{
        @Override
        public String sendDay(){
            return "일요일";
        }
    };

    public abstract String sendDay();
}


public class WeekM {
    static String whichDay(Days day){
       return day.sendDay();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day is it today in Korea?");
        System.out.println(whichDay(Days.valueOf(sc.next())));
    }
}
