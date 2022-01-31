package com.example.gestionaeroport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Data @ToString
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomReservation;
    @ManyToOne
    private Vol vol;
    @ManyToOne
    private Client client;
}
