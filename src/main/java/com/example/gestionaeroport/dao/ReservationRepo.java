package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
