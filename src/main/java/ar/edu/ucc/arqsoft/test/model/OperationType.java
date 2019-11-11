package ar.edu.ucc.arqsoft.test.model;

public enum  OperationType {
    DEBIT("Debito"), CREDIT("Credito");

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
