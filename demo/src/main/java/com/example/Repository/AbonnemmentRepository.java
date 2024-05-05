package com.example.Repository;

import com.example.entities.Abonnement;
import com.example.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnemmentRepository extends JpaRepository<Abonnement,Long> {
}
