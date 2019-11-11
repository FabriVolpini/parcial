package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION")
public class Transaction extends ObjetoGenerico {

    //Fecha, monto, tipo de operacion tarjeta


    @Column(name = "DATE", nullable = false)
    private Date date;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    //https://thoughts-on-java.org/hibernate-enum-mappings/
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "OPERATION_TYPE", nullable = false)
    private OperationType operationType;

    //Varias transacciones para una tarjeta
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Card.class)
    @JoinColumn(name = "CARD", nullable = false)
    private Card card;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
