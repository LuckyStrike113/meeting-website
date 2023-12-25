package com.portfolio.meeting.website.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@Table(name = "people")
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_birth")
    private LocalDate dateBirth;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "people_hobby",
            joinColumns = {@JoinColumn(name = "people_id")},
            inverseJoinColumns = {@JoinColumn (name = "hobby_id")}
    )
    @Column(name = "hobby")
    private List<Hobby> hobby;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "people")
    private List<Images> images;

}