package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FM_Request;

@Repository
public interface FM_Request_Repository extends JpaRepository<FM_Request,Long> {

}