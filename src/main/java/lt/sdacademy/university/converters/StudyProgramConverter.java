package lt.sdacademy.university.converters;

import lt.sdacademy.university.model.StudyProgramEntity;
import lt.sdacademy.university.model.dto.StudyProgram;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class StudyProgramConverter {

    public List<StudyProgram> convert(List<StudyProgramEntity> studyProgramEntities) {
        return studyProgramEntities.stream()
                .map(sp -> new StudyProgram(
                        sp.getTitle(),
                        sp.getModules().stream()
                                .map(m -> m.getTitle())
                                .collect(toList()))
                )
                .collect(toList());
    }
}
