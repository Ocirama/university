package lt.sdacademy.university.controllers;

import lt.sdacademy.university.model.PersonEntity;
import lt.sdacademy.university.repositories.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @GetMapping()
    List<PersonEntity> all() {
        return personRepository.findAll();
    }
    /*@GetMapping("/{id}")
    public PersonRepository getPersonRepository(@PathVariable Long id){
        return personRepository.findById(id);
    }*/


}
