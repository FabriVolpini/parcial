package ar.edu.ucc.arqsoft.test.dto;

public class NewCardDto {

    private long id;
    private UserDto user;
    private String number;
    private double balance;

    public NewCardDto(UserDto user, String number, double balance) {
        this.user = user;
        this.number = number;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
