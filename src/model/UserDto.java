package model;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class UserDto {
    private String username;
    private String password;
    private String confirmPassword;
    private String name;
    private String jmNumber;
    private String callNumber;
    private String address;
    private String job;

    private double height;
    private double weight;

}
