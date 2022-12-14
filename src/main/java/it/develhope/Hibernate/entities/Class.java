package it.develhope.Hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Classes")
public class Class {

    @Id
    private String id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
}
