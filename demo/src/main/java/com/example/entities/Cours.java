package com.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Cours {

    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Id
    private int niveau;
    @Enumerated(EnumType.STRING)
    private  TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    private int croneau;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptionSet;


}
