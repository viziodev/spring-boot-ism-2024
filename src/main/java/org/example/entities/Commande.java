package org.example.entities;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class Commande {
    private Long id;
    private LocalDateTime dateCmde;
    private Double totalCmde;
}
