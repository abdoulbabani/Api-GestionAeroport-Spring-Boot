package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EntrepriseRepo extends JpaRepository<Entreprise,Long> {
}
