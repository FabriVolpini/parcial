package ar.edu.ucc.arqsoft.test.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER")
public class User extends ObjetoGenerico {

    //nombre, apellido, dni y tarjetas


    @Column(name = "NAME",length = 100, nullable = false)
    private String name;

    @Column(name = "LASTNAME", length = 100, nullable = false)
    private String lastname;

    @Column(name = "DNI", nullable = false)
    private String dni;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="USER")
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
