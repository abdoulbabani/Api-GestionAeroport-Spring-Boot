package com.example.gestionaeroport.dao;

import ch.qos.logback.core.net.server.Client;
import com.example.gestionaeroport.entity.Particuler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ParticulierRepo extends JpaRepository<Particuler,Long> {
}
