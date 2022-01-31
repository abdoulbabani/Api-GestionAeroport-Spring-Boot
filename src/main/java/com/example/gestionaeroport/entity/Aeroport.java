package com.example.gestionaeroport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
public class Aeroport {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomAeroport;
    private Date dateDepart;
    private Date dateArrive;
    @OneToOne
    private TourControle tourControle;
    @OneToMany(mappedBy = "aeroportDepart")
    private List<Vol> voldepartList=new ArrayList<Vol>();
    @OneToMany(mappedBy = "aeroportArrive")
    private List<Vol> volArriveList=new ArrayList<Vol>();
    @ManyToMany(mappedBy = "aeroportList")
    private List<Ville> villes=new ArrayList<Ville>();



}
