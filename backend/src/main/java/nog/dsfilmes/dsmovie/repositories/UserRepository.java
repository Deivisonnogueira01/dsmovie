package nog.dsfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nog.dsfilmes.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByEmail(String email);
}
