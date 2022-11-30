package com.codeclan.example.pirateservices.repositories;
import com.codeclan.example.pirateservices.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
