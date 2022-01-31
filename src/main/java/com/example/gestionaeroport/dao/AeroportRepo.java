package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AeroportRepo extends JpaRepository<Aeroport, Long> {

}
