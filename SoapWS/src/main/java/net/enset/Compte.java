package net.enset;

public class Compte {
    private int code;
    private double solde;
    private TypeAccount type;

    public Compte() {
    }

    public Compte(int code, double solde, TypeAccount type) {
        this.code = code;
        this.solde = solde;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public TypeAccount getType() {
        return type;
    }

    public void setType(TypeAccount type) {
        this.type = type;
    }
}
