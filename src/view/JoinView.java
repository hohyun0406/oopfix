package view;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner sc) {
        System.out.println("id,비밀번호,비밀번호확인, 이름, 주민번호,전화번호,주소, 직업을 입력하십시오.");
//        int a = 0;

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

        System.out.println(user.toString());
    }
}
