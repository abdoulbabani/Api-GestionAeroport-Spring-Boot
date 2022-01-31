package com.example.gestionaeroport;

import com.example.gestionaeroport.dao.*;
import com.example.gestionaeroport.entity.Aeroport;
import com.example.gestionaeroport.entity.TourControle;
import com.example.gestionaeroport.entity.Ville;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionAeroportApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAeroportApplication.class, args);
    }

    @Bean
    CommandLineRunner start(TourRepo tourRepo, AeroportRepo aeroportRepo, VilleRepo villeRepo, EntrepriseRepo entrepriseRepo
    ,ParticulierRepo particulierRepo){
        return args -> {
           Stream.of("nsimalen","roisy","mohamed 5").forEach(tour->{
               TourControle tourControle=new TourControle();
               tourControle.setNomTour(tour);
               tourRepo.save(tourControle);
           });
            tourRepo.findAll().forEach(p->{
                Aeroport aeroport=new Aeroport();
                aeroport.setTourControle(p);
                aeroportRepo.save(aeroport);
            });
            Stream.of("yaounde","paris","Rabat").forEach(vill->{
                Ville ville=new Ville();
                ville.setNomVille(vill);
                villeRepo.save(ville);
            });

           };


        };

    }

