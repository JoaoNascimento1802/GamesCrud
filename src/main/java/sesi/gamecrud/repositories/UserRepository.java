package sesi.gamecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sesi.gamecrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
