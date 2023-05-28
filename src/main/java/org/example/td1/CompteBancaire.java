package org.example.td1;

import org.example.td1.OperationBancaire;

import java.time.LocalDate;
import java.util.Arrays;

public class CompteBancaire {
    private String nom;
    private double solde;
    private float taux;
    private int nbre_operations;
    private OperationBancaire[] operationBancaires;
    public CompteBancaire(String nom, double solde, float taux) {
        this.nom = nom;
        this.solde = solde;
        this.taux = taux;
        this.operationBancaires = new OperationBancaire[10];
        this.nbre_operations=0;
    }
    public void ajouterOperation(OperationBancaire op){
        if(this.nbre_operations==this.operationBancaires.length){
            this.operationBancaires= Arrays.copyOf(this.operationBancaires,this.nbre_operations+10);
        }
        this.operationBancaires[this.nbre_operations++]=op;
    }
    public int getNbre_operations() {
        return nbre_operations;
    }

    public void setNbre_operations(int nbre_operations) {
        this.nbre_operations = nbre_operations;
    }

    public CompteBancaire() {
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public float getTaux() {
        return taux;
    }

    public OperationBancaire[] getOperationBancaires() {
        return Arrays.copyOf(operationBancaires,nbre_operations);
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "nom='" + nom + '\'' +
                ", solde=" + solde +
                ", taux=" + taux +
                ", operationBancaires=" + operationBancaires +
                '}';
    }


    public void depot(double m, LocalDate d){
        solde+=m;
       OperationBancaire op=new OperationBancaire(d,m);
       operationBancaires[nbre_operations++]=op;
    }
    public void retrait(double m, LocalDate d){
        if (solde>m) {
            solde -= m;
            OperationBancaire op = new OperationBancaire(d, m);
            operationBancaires[nbre_operations++] = op;
        }
    }

}
