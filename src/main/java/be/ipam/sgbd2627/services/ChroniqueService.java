package be.ipam.sgbd2627.services;

import be.ipam.sgbd2627.DTO.ChroniqueDTO;
import be.ipam.sgbd2627.models.Chronique;

import java.util.UUID;

public interface ChroniqueService {
    public ChroniqueDTO getChronique(UUID id);
    public Chronique getChronique(UUID id);
}
