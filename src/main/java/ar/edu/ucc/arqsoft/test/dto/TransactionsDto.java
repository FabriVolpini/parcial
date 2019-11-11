package ar.edu.ucc.arqsoft.test.dto;

import ar.edu.ucc.arqsoft.test.model.Card;
import ar.edu.ucc.arqsoft.test.model.OperationType;

import java.util.Date;

public class TransactionsDto {

    private Long id;
    private Date date;
    private double amount;
    private OperationType operationType;
    private Card card;

    public TransactionsDto(Long id, Date date, double amount, OperationType operationType, Card card) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.operationType = operationType;
        this.card = card;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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
