package lt.sdacademy.university.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="university")
public class UniversityEntity extends AbstractEntity{

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @OneToMany
    @JoinColumn(name = "study_program_id")
    private List<StudyProgramEntity> studyPrograms = new ArrayList<>();

}
