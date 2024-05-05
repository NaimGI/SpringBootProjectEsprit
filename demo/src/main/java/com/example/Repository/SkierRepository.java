package com.example.Repository;

import com.example.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkierRepository extends JpaRepository<Skieur,Long> {
}
