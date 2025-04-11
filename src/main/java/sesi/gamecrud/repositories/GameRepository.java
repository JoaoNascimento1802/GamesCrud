package sesi.gamecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sesi.gamecrud.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
