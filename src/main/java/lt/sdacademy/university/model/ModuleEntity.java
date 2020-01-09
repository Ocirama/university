package lt.sdacademy.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "module")
public class ModuleEntity extends AbstractEntity {

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name = "lecturer_id")
    private int lecturerId;



}
