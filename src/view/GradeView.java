package view;

import model.Subject;
import model.User;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오.");

        UtilService util = serviceImpl.UtilService.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        System.out.println("학생 이름 : ");
        User student23 = User.builder()
                .name(sc.next())
                .build();

        Subject subjects = Subject.builder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build();


        int totalScore = grade.getTotalScore();
        double average = grade.findAvg();



        System.out.printf("=============성적표=============\n+" +
                        " Name : %s \n" +
                        " Korean : %s \n" +
                        " English %s \n" +
                        " Math %s \n" +
                        " Total %s \n" +
                        " Average %s \n",
                String.valueOf(subjects.getKorean()),
                String.valueOf(subjects.getEnglish()),
                String.valueOf(subjects.getMath()),
                String.valueOf(totalScore),
                String.valueOf(average));

    }
}
