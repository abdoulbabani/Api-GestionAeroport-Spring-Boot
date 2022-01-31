package com.example.gestionaeroport.dao;

import com.example.gestionaeroport.entity.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface VolRepo extends JpaRepository<Vol,Long> {

}
