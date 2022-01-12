package nog.dsfilmes.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nog.dsfilmes.dsmovie.dto.MovieDTO;
import nog.dsfilmes.dsmovie.entities.Movie;
import nog.dsfilmes.dsmovie.repositories.MovieRepository;

// Classe Customizada precisa ser registrada
// como um componente

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	}
	
	

