package com.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Abonnement implements Serializable {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private long numAbon;
    private LocalDate datedeb;
    private  LocalDate dateFin;
    private float prixAbon;
   @Enumerated(EnumType.STRING)
    private TypeAbonne typeAbonne;


}
