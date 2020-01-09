package lt.sdacademy.university.repositories;

import java.util.List;
import lt.sdacademy.university.model.StudyProgramEntity;
                import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyProgramRepository extends JpaRepository<StudyProgramEntity, Integer> {

    List<StudyProgramEntity> findAll();

}
