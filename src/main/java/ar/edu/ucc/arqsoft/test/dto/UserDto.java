package ar.edu.ucc.arqsoft.test.dto;


import ar.edu.ucc.arqsoft.test.model.Card;

import java.util.List;

public class UserDto {

    

    private Long id;
    private String name;
    private String lastname;
    private int dni;
    //TODO NOSE SI ES NECESARIO
//    private List<Card> cards;


    public UserDto(Long id, String name, String lastname, int dni){

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
