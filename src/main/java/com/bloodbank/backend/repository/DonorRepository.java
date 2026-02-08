package com.bloodbank.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bloodbank.backend.model.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
