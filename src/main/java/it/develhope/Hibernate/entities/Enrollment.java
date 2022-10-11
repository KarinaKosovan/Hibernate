package it.develhope.Hibernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "Enrollments")
public class Enrollment {

    @Id
    private String id;
    @ManyToOne(optional = false)
    private Class classEnrollment;
    @ManyToOne(optional = false)
    private Student studentEnrollment;

}
