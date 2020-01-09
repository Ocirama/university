package lt.sdacademy.university.controllers;

import lt.sdacademy.university.model.dto.University;
import lt.sdacademy.university.repositories.PersonRepository;
import lt.sdacademy.university.services.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public  class UniversityController  {

    private final UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }
    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<University> getInfo() {
        return universityService.getAll();
    }
    /*@GetMapping("/getpersonnames")
    public List<PersonEntity> getAllPersons() {
        return (List<PersonEntity>) personRepository.retrieveAll();
    }*/
    /*@GetMapping("/getpersonsurnames")
    public List<String> getAllPersonSurnames() {
        return personRepository.getAllPersonSurnames();
    }
    //@GetMapping("/getpersongender")
    public List<String> getAllPersonGender() {
        return personRepository.getAllPersonGender();
    }


   /* @GetMapping("/{id}")
    public University getUniversity(@PathVariable Long id) {
        return universityService.getUniversity(id);
    }

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody University university) {
        return universityService.create(university) ?
                ResponseEntity.status(HttpStatus.OK).body(true) :
                ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
    }*/

}
