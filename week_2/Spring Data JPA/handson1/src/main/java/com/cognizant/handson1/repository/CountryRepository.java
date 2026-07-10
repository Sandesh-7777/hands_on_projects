package com.cognizant.handson1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.handson1.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}