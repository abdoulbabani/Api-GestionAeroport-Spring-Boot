package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Client;
import com.example.gestionaeroport.entity.Entreprise;
import com.example.gestionaeroport.entity.TourControle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TourRepo extends JpaRepository<TourControle,Long> {
}
