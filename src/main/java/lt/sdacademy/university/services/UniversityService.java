package lt.sdacademy.university.services;

import java.util.List;
import lt.sdacademy.university.model.UniversityEntity;
import lt.sdacademy.university.repositories.StudyProgramRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class UniversityService {

   /* private final StudyProgramRepository studyProgramRepository;


    public UniversityService(StudyProgramRepository studyProgramRepository) {
        this.studyProgramRepository = studyProgramRepository;
    }

    @GetMapping
    public List<UniversityEntity> getUniversities(){
        return studyProgramRepository.findAll();
    }*/
}
