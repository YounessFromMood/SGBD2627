package be.ipam.sgbd2627.models;

import be.ipam.sgbd2627.models.enums.EtatChronique;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "chronique")
@NoArgsConstructor //Imposé par JPA apparemment
//TODO check le besoin de @NoArgsConstructor

public class Chronique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, updatable = false)
    private UUID publicId = UUID.randomUUID();

    @Column(name = "titre")
    private String titre;

    @Column(name = "date_publication")
    private LocalDateTime datePublication;

    @Column(name = "critique")
    private String critique;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EtatChronique etat = EtatChronique.BROUILLON;

    //Reference a l'album sur lequel tiens la chronique
    @ManyToOne
    private Redacteur nomRedacteur;

    @OneToOne
    private Album album;

    @OneToMany(mappedBy = "chronique")
    private List<ChroniqueMorceau> ChroniqueMorceau = new ArrayList<>();

    /* -- Inutile car j'ai pas besoin de les stocker dans la chronique. La table commentaire sais déjà quelle chronique
     * elle commente --
     * @OneToMany
     * private Commentaire commentaire;
     * @OneToMany
     * private Reaction reaction;
     */
}
