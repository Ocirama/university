package lt.sdacademy.university.repositories;

import lt.sdacademy.university.model.StudyProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyProgramRepository extends JpaRepository<StudyProgramEntity, Integer> {

    List<StudyProgramEntity> findAll();

}
