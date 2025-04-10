package game.gamescrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import game.gamescrud.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
