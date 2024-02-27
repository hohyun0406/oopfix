package builder;

import model.UserDto;

public class UserBuilder {
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

    public UserBuilder username(String username){
        this.username = username;
        return this;
    }
    public UserBuilder password(String password){
        this.password = password;
        return this;
    }
    public UserBuilder confirmPassword(String confirmPassword){
        this.confirmPassword = confirmPassword;
        return this;
    }
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }
    public UserBuilder jmNumber(String jmNumber){
        this.jmNumber = jmNumber;
        return this;
    }
    public UserBuilder callNumber(String callNumber){
        this.callNumber = callNumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public UserBuilder job(String job){
        this.job = job;
        return this;
    }

    public UserBuilder height(double height){
        this.height = height;
        return this;
    }

    public UserBuilder weight(double weight){
        this.weight = weight;
        return this;
    }

    public UserDto build(){
        return new UserDto(username, password, confirmPassword, name, jmNumber, callNumber, address, job, height, weight);
    }
}
