package it.develhope.Hibernate;

import javax.persistence.*;

@Entity
@Table
public class Enrollment {

    @Id
    private String id;
    @ManyToOne(optional = false)
    private Class classEnrollment;
    @ManyToOne(optional = false)
    private Student studentEnrollment;

}
