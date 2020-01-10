package lt.sdacademy.university.services;

import lt.sdacademy.university.converters.UniversityConverter;
import lt.sdacademy.university.model.StudyProgramEntity;
import lt.sdacademy.university.model.UniversityEntity;
import lt.sdacademy.university.model.dto.StudyProgram;
import lt.sdacademy.university.model.dto.University;
import lt.sdacademy.university.repositories.UniversityRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class UniversityService {


    private final UniversityRepository universityRepository;
    private final UniversityConverter universityConverter;

    public UniversityService(UniversityRepository universityRepository, UniversityConverter universityConverter) {
        this.universityRepository = universityRepository;
        this.universityConverter = universityConverter;
    }


    @GetMapping
    public List<University> getUniversities() {
        List<UniversityEntity> universityEntities = universityRepository.findAll();
        List<University> result = universityConverter.convert(universityEntities);
        return result;
    }
}
