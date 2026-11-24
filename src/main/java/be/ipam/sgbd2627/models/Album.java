package be.ipam.sgbd2627.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false, unique = true, updatable = false)
    private UUID public_id = UUID.randomUUID();

    @Column
    private String name;

    @Column
    private String artist;

    @Column
    private LocalDate releaseDate;

    @Column
    private String label;


}