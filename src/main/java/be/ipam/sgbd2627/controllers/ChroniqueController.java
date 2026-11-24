package be.ipam.sgbd2627.controllers;

import be.ipam.sgbd2627.DTO.ChroniqueDTO;
import be.ipam.sgbd2627.services.ChroniqueService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/")
/**
 * Controlleur qui va gérer toutes les requêtes perçue en HTTP concernant les chronique et diriger les données JSON au
 * bon service et a la bonne méthode.
 * @Author Youness
 * @Version 0.1
 */
public class ChroniqueController {
    //On déclare l'entité qui va déléguer la logique métier que l'on souhaite
    private final ChroniqueService chroniqueService;

    public ChroniqueController(ChroniqueService chroniqueService) {
        this.chroniqueService = chroniqueService;
    }
    //on précise d'où vient la variable que l'on cherche dans notre API
    //Spring va automatiquement convertir l'objet en JSON woah
    @GetMapping("/chroniques/{id}")
    /**
     * Lorsqu'un utilisateur souhaite consulter une chronique on en fait la demande au service
     */
    public ChroniqueDTO getChronique(@PathVariable UUID id) {
        return chroniqueService.getChronique(id);
    }
    //Pour indiquer a Spring qu'il s'agit d'un POST et qu'en l'occurence on va créer une entité en DB
    @PostMapping
    /**
     * Lorsqu'un Rédacteur souhaite créer sa chronique avec toutes les informations emmise dedans on en fait la demande
     * au service via un post
     */
    public ChroniqueDTO createChronique() {
        return null;
    }


}
