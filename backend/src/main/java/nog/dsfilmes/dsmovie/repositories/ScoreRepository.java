package nog.dsfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nog.dsfilmes.dsmovie.entities.Score;
import nog.dsfilmes.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK>{

			
}
