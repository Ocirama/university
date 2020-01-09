package lt.sdacademy.university.services;

import java.util.List;
import lt.sdacademy.university.converters.StudyProgramConverter;
import lt.sdacademy.university.converters.StudyProgramStudentConverter;
import lt.sdacademy.university.model.StudyProgramEntity;
import lt.sdacademy.university.model.dto.StudyProgram;
import lt.sdacademy.university.model.dto.StudyProgramStudent;
import lt.sdacademy.university.repositories.StudyProgramRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudyProgramService {

    private final StudyProgramRepository studyProgramRepository;
    private final StudyProgramConverter studyProgramConverter;
    private final StudyProgramStudentConverter studyProgramStudentConverter;

    public StudyProgramService(StudyProgramRepository studyProgramRepository, StudyProgramConverter studyProgramConverter,
        StudyProgramStudentConverter studyProgramStudentConverter) {
        this.studyProgramRepository = studyProgramRepository;
        this.studyProgramConverter = studyProgramConverter;
        this.studyProgramStudentConverter = studyProgramStudentConverter;
    }
    @GetMapping
    public List<StudyProgram> getStudyPrograms() {
        List<StudyProgramEntity> studyProgramEntities = studyProgramRepository.findAll();
        List<StudyProgram> result = studyProgramConverter.convert(studyProgramEntities);
        return result;
    }

    @GetMapping
    public List<StudyProgramStudent> getStudentPrograms() {
        List<StudyProgramEntity> studyProgramEntities = studyProgramRepository.findAll();
        List<StudyProgramStudent> result = studyProgramStudentConverter.convert(studyProgramEntities);
        return result;
    }
}
