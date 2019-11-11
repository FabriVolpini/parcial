package ar.edu.ucc.arqsoft.test.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    //nombre, apellido, dni y tarjetas

    //String value columns necesitan el lenght

    @Column(name = "NAME",length = 100, nullable = false)
    private String name;

    @Column(name = "LASTNAME", length = 100, nullable = false)
    private String lastname;

    @Column(name = "DNI", nullable = false)
    private int dni;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="CARD")
    private List<Card> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
