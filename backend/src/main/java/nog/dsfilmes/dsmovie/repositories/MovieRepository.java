package nog.dsfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nog.dsfilmes.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{

			
}
