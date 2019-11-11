package ar.edu.ucc.arqsoft.test.dto;

public class RequestDto {

    private CardDto card;
    private Double amount;

    public RequestDto(CardDto card, Double amount) {
        this.card = card;
        this.amount = amount;
    }

    public CardDto getCard() {
        return card;
    }

    public void setCard(CardDto card) {
        this.card = card;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
