package com.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Piste implements Serializable {
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private  Couleur couleur;
    private  int longeur;
    private int pente;
    @ManyToMany(mappedBy = "pistes")
    private Set<Skieur> skieurSet;
}
