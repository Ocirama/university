package lt.sdacademy.university.model.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudyProgramStudent {

    private String title;
    private List<String> students;

}
