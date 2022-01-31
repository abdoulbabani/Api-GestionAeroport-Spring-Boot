package com.example.gestionaeroport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) @AllArgsConstructor
@NoArgsConstructor @Data @ToString
public  abstract class Client {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nom;
    private String numero;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations=new ArrayList<Reservation>();


}
