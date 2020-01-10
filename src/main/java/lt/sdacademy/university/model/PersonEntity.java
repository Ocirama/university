package lt.sdacademy.university.model;

import lombok.Data;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person")
public class PersonEntity extends AbstractEntity {
    @Column(name = "name",length = 50,nullable = false)
    private String name;
    @Column(name = "surname",length = 50,nullable = false)
    private String surname;
    @Column(name = "gender",length = 50,nullable = false)
    private String gender;

}
