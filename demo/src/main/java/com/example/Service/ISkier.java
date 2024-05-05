package com.example.Service;

import com.example.entities.Skieur;

import java.util.List;

public interface ISkier {

    public Skieur addSkieur(Skieur sk);

    public Skieur updateSkieur(Skieur sk);

    public List<Skieur> getAllSkieur();

    public Skieur getSkById(Long numsk);

    public void deleteSkieur(Long numsk);
}
