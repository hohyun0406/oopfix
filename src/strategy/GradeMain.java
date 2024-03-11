package strategy;


import java.util.Scanner;

enum Grade{
    A(9),
    B(8),
    C(7),
    D(6),
    E(5),
    F(4)
    ;
    private final int score;
    Grade(int score){
        this.score = score;
    }

    static String getGrade(int score){
        return score/10+"";
    }

}

public class GradeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Score");
        System.out.println(Grade.getGrade(98));
    }
}
