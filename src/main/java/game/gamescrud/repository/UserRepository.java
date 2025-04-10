package game.gamescrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import game.gamescrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
