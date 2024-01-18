package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "commandes")
public class Commande  extends AbstractEntity{
    private LocalDateTime dateCmde;
    private Double totalCmde;
}
