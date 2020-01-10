package lt.sdacademy.university.repositories;

import lt.sdacademy.university.model.UniversityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity, Integer> {
    List<UniversityEntity> findAll();

}
