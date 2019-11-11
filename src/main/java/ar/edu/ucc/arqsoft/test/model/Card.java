package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


//Tabla Con info de las tarjetas, se declara entidad y nombre de la tabla
@Entity
@Table(name = "CARD")
public class Card extends ObjetoGenerico{

    @Column(name = "NUMBER", nullable = false)
    private String number;

    @Column(name = "BALANCE", nullable = false)
    private Double balance;

    //Muchas tarjetas para un usuario
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinColumn(name = "USER", nullable = false)
    private User user;


    //Es un set hash set para evitar que se repitan las transacciones
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CARD")
    private java.util.Set<Transaction> transactions = new HashSet<Transaction>();
//    private Set<Transactions> transactions = new HashSet<Transactions>();


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}
