package be.ipam.sgbd2627.anOldExample.mappers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//Crée automatiquement a la compilation tous les getters et setters de base
//et au developpement autorise l'appel des get et set
@Getter
@Setter
//Une classe qui va faire des objets qui vont persister en DB
//Généralement on va l'utiliser partout où l'on veut garder les données en DB
@Entity
//Nom de la table en DB, même si on le mets pas y'aura un nommage de la table par défaut
@Table(name = "student")
//Le modèle -> représente les entités que l'on utilisera
public class Student {
    //Clé primaire en DB
    @Id
    //La stratégie pour genere l'ID ici c'est de l'UUID
    @GeneratedValue(strategy = GenerationType.UUID)
    //Colonne sur la table en DB
    @Column(name = "id", nullable = false)
    //Avantage de l'UUID c'est que y'a tellement de combinaison possible qu'on peut juste en générer un et l'entrer en
    //BDD directement tellement c'est improbable d'avoir 2 UUID les mêmes
    private UUID id;
    private String name;
}