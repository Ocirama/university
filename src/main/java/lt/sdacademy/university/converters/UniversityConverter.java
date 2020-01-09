package lt.sdacademy.university.converters;

import static java.util.stream.Collectors.toList;

import java.util.List;
import lt.sdacademy.university.model.StudyProgramEntity;
import lt.sdacademy.university.model.dto.StudyProgramStudent;
import org.springframework.stereotype.Component;

@Component
public class UniversityConverter {

    public List<StudyProgramStudent> convert(List<StudyProgramEntity> studyProgramEntities) {
        return studyProgramEntities.stream()
            .map(sp -> new StudyProgramStudent(
                sp.getTitle(),
                sp.getStudents().stream()
                    .map(s -> s.getPerson().getName()+ " " + s.getPerson().getSurname())
                    .collect(toList()))
            )
            .collect(toList());
    }
}

