package be.ipam.sgbd2627.services.impl;

import be.ipam.sgbd2627.DTO.ChroniqueDTO;
import be.ipam.sgbd2627.services.ChroniqueService;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class ChroniqueServiceImpl implements ChroniqueService {
    //On réecris logiquement la méthode abstraite que l'on implémente
    @Override
    public ChroniqueDTO getChronique(UUID id) {
        return null;
    }
}
