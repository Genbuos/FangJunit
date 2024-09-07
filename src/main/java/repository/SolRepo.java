package repository;

import model.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolRepo extends JpaRepository<Solution, Long> {
// query for finding solution by Question name
}
