package nl.inholland.soccerstarsapi.repository;

import nl.inholland.soccerstarsapi.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
