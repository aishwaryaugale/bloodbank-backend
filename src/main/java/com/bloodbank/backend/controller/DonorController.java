package com.bloodbank.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

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
        return repo.findAll();
    }
}
