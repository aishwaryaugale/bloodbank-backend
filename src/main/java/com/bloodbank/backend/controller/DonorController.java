package com.bloodbank.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.backend.model.Donor;
import com.bloodbank.backend.repository.DonorRepository;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {

    private final DonorRepository repo;

    public DonorController(DonorRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Donor addDonor(@RequestBody Donor donor) {
        return repo.save(donor);
    }

    
    @GetMapping
public List<Donor> getAllDonors() {
    System.out.println("API HIT ZALI");
    return repo.findAll();
}

}
