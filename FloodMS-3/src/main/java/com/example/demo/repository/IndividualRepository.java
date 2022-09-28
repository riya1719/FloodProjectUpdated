package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Donation;

@Repository
public interface IndividualRepository extends JpaRepository<Donation ,Long> {

}
