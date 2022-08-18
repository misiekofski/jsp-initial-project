package pl.coderslab.jspinitialproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.jspinitialproject.entities.Bottle;

@Repository
public interface BottleRepository extends JpaRepository<Bottle, Long> {
}
