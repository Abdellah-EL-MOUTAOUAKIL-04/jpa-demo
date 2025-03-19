package ma.abdellah.jpademo.repositories;

import ma.abdellah.jpademo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
