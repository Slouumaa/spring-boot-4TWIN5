package tn.esprit.ChaouchAbdessalem4Twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
    @OneToOne(mappedBy = "skier")
    Subscription subscription;
    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pisteList;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;

}