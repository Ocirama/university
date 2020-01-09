package lt.sdacademy.university.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity extends AbstractEntity {

    @Column(name = "study_type", length = 50, nullable = false,columnDefinition = "ENUMA4")
    private String studyType;
    @Column(name = "date_started", nullable = false)
    private Date dateStarted;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PersonEntity person;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "study_program_id", referencedColumnName = "id")
    private StudyProgramEntity studyProgram;



}
