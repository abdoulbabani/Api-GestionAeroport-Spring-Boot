package com.example.gestionaeroport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
public class Entreprise extends Client {

    private int numPatente;





}
