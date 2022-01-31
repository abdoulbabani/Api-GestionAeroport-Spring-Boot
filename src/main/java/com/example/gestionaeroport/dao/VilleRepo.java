package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VilleRepo extends JpaRepository<Ville,Long> {
}
