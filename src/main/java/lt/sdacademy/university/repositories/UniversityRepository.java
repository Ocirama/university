package lt.sdacademy.university.repositories;

import java.util.List;
import lt.sdacademy.university.model.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity,Integer> {
    List<UniversityEntity> findAll();

}
