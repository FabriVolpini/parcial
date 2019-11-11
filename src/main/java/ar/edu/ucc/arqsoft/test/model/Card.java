package ar.edu.ucc.arqsoft.test.model;

import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.HashSet;


//Tabla Con info de las tarjetas, se declara entidad y nombre de la tabla
@Entity
@Table(name = "CARD")
public class Card extends ObjetoGenerico{

    @Column(name = "NUMBER", nullable = false)
    private int number;

    @Column(name = "BALANCE", nullable = false)
    private double balance;

    //Muchas tarjetas para un usuario
    //https://thoughts-on-java.org/entity-mappings-introduction-jpa-fetchtypes/
    @ManyToOne(fetch = FetchType.EAGER)
    //https://www.oscarblancarteblog.com/2018/12/13/personalizar-las-relaciones-con-joincolumn/
    @JoinColumn(name = "ID_USER", nullable = false)
    private User user;


    //Es un set hash set para evitar que se repitan las transacciones
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CARD")
    private Set<Transactions> transactions = new HashSet<Transactions>();


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
