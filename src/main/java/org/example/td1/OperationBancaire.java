package org.example.td1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OperationBancaire {
    private LocalDate date;
    private double montant;

    public OperationBancaire(LocalDate date, double montant) {
        this.date = date;
        this.montant = montant;
    }
}
