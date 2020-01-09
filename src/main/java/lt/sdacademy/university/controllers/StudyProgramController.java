package lt.sdacademy.university.controllers;

import java.util.List;
import lt.sdacademy.university.model.StudyProgramEntity;
import lt.sdacademy.university.model.dto.StudyProgram;
import lt.sdacademy.university.model.dto.StudyProgramStudent;
import lt.sdacademy.university.services.StudyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programs")
public class StudyProgramController {

    private final StudyProgramService studyProgramService;

    @Autowired
    public StudyProgramController(StudyProgramService studyProgramService) {
        this.studyProgramService = studyProgramService;
    }

    @GetMapping()
    public List<StudyProgram> getAllStudyPrograms() {
        return studyProgramService.getStudyPrograms();
    }

    @GetMapping("/students")
    public List<StudyProgramStudent> getAllStudentPrograms() {
        return studyProgramService.getStudentPrograms();
    }

   /* @GetMapping
    public List<String> getStudyPrograms() {
        return studyProgramService
    }*/
}
