package ma.abdellah.jpademo.repositories;

import ma.abdellah.jpademo.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
