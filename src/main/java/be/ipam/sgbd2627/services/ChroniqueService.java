package be.ipam.sgbd2627.services;

import be.ipam.sgbd2627.DTO.ChroniqueDTO;
import be.ipam.sgbd2627.models.ChroniqueEntity;

import java.util.UUID;

public interface ChroniqueService {
    public ChroniqueDTO getChronique(UUID id);
    public ChroniqueEntity getChronique(UUID id);
}
