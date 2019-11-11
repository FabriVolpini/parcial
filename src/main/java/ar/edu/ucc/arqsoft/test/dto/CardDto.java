package ar.edu.ucc.arqsoft.test.dto;

import ar.edu.ucc.arqsoft.test.model.Transactions;
import ar.edu.ucc.arqsoft.test.model.User;

import java.util.Set;

public class CardDto {

    private Long id;
    private int number;
    private double balance;
    private User user;
    private Set<Transactions> transactions;


    public CardDto(Long id, int number, double balance, User user) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transactions> transactions) {
        this.transactions = transactions;
    }
}
