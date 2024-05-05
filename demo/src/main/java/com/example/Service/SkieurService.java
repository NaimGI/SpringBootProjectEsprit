package com.example.Service;

import com.example.Repository.SkierRepository;
import com.example.entities.Skieur;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@NoArgsConstructor
public class SkieurService implements  ISkier{
    private SkierRepository skierRepository;

    @Autowired
    public SkieurService(SkierRepository skierRepository) {
        this.skierRepository = skierRepository;
    }
    @Override
    public Skieur addSkieur(Skieur sk) {
        return skierRepository.save(sk);
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skierRepository.save(sk);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skierRepository.findAll();
    }

    @Override
    public Skieur getSkById(Long numsk) {
        return skierRepository.findById(numsk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numsk) {
        skierRepository.deleteById(numsk);
    }
}
