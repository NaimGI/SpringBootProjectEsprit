package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Skieur implements Serializable  {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private   long numSk;
    private  String nomSk;
    private String prenomSk;
    private LocalDate dateNaissance;
    private String ville;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscription;
    @ManyToMany
    private Set<Piste> pistes;

}
