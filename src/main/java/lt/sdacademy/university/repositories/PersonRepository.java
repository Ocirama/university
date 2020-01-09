package lt.sdacademy.university.repositories;

import lt.sdacademy.university.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PersonRepository extends JpaRepository<PersonEntity,Integer> {
    List<PersonEntity> findBySurname(String surname);

    PersonEntity findById(long id);

    @Query("SELECT p FROM PersonEntity p")
    PersonEntity retrieveAll();


    /*public List<String> getAllPersonNames() {
        List<String> nameList = new ArrayList<>();
        nameList.addAll(jdbcTemplate.queryForList("select name from person;", String.class));
        return nameList;
    }
    public List<String> getAllPersonSurnames() {
        List<String> surnameList = new ArrayList<>();
        surnameList.addAll(jdbcTemplate.queryForList("select surname from person;", String.class));
        return surnameList;
    }
    public List<String> getAllPersonGender() {
        List<String> genderList = new ArrayList<>();
        genderList.addAll(jdbcTemplate.queryForList("select gender from person;", String.class));
        return genderList;
    }*/
}
