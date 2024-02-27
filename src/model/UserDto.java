package model;

public class UserDto {
    private int id;
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


    public UserDto(String username, String password, String confirmPassword, String name, String jmNumber, String callNumber, String address, String job, double height,double weight) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.name = name;
        this.jmNumber = jmNumber;
        this.callNumber = callNumber;
        this.address = address;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", name='" + name + '\'' +
                ", jmNumber='" + jmNumber + '\'' +
                ", callNumber='" + callNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJmNumber(String jmNumber) {
        this.jmNumber = jmNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getName() {
        return name;
    }

    public String getJmNumber() {
        return jmNumber;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
