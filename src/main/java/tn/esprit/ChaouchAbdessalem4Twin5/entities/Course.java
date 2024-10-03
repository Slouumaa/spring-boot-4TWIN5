package tn.esprit.ChaouchAbdessalem4Twin5.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support; // This is now an enum, not a reference to another entity.

    private float price;
    private String timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration>registrations;


}
