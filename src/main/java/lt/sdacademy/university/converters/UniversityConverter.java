package lt.sdacademy.university.converters;

import lt.sdacademy.university.model.UniversityEntity;
import lt.sdacademy.university.model.dto.University;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class UniversityConverter {

    public List<University> convert(List<UniversityEntity> universityEntities) {
        return universityEntities.stream()
                .map(u -> new University(
                        u.getTitle(),
                        u.getStudyPrograms().stream()
                        .map(s->s.getTitle())
                                /* u.getLecturers().stream()
                                         .map(s -> s.getPerson().getName() + " " + s.getPerson().getSurname())*/
                                .collect(toList()))
                )
                .collect(toList());
    }
}

