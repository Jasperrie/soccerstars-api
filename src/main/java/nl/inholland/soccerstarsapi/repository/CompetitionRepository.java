package nl.inholland.soccerstarsapi.repository;

import nl.inholland.soccerstarsapi.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
