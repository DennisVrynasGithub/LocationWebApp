package com.dennis.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dennis.location.entities.Location;

public interface Locationepository extends JpaRepository<Location, Integer> {

}
