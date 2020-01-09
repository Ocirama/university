package lt.sdacademy.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lecturer")
public class LecturerEntity extends AbstractEntity {

    @Column(name = "level", length = 50, nullable = false)
    private String level;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Column(name = "person_id")
    private int personId;
}
