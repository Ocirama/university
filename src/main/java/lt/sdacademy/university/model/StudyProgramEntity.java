package lt.sdacademy.university.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "study_program")
public class StudyProgramEntity extends AbstractEntity {

    @Column(name = "title", length = 50, nullable = false, unique = true)
    private String title;

    @OneToMany
    @JoinColumn(name = "study_program_id")
    private List<StudentEntity> students = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id")
    private UniversityEntity university;

    @ManyToMany
    @JoinTable(name = "study_program_module", joinColumns = @JoinColumn(name = "study_program_id"), inverseJoinColumns = @JoinColumn(name="module_id"))
    private List<ModuleEntity> modules = new ArrayList<>();
}

