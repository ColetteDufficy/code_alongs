package com.codeclan.example.pirateservices.controllers;

import com.codeclan.example.pirateservices.models.Pirate;
import com.codeclan.example.pirateservices.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController // To tell Spring this is a RestController, we use the annotation @RestController. We use the annotation @RequestMapping to specify the base URL for the controllers endpoints.

public class PirateController {
    @Autowired // inject dependency here - temporary access needed o the pirate repo.
    PirateRepository pirateRepository;

    // FIND ALL PIRATES:
    @GetMapping(value = "/pirates") // annotation to map a route to a method. Note: @GetMapping is simply a version of the commonly used @RequestMapping with the method already set to GET. We can use @GetMapping arguments fpr sub routes
    public List<Pirate> getAllPirates() { //return a list of pirates from the db
        return pirateRepository.findAll();
    }

    // FIND ONE PIRATE
    @GetMapping(value = "/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){
        return pirateRepository.findById(id);
    }




}
