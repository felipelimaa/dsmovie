package br.com.felipelima.dsmovie.service

import br.com.felipelima.dsmovie.dto.MovieDTO
import br.com.felipelima.dsmovie.model.Movie
import br.com.felipelima.dsmovie.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MovieService {

    @Autowired
    MovieRepository movieRepository

    @Transactional(readOnly = true)
    Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = movieRepository.findAll(pageable)
        Page<MovieDTO> page = result.map(movie -> new MovieDTO(movie))
        return page

    }

    @Transactional(readOnly = true)
    MovieDTO findById(Long id) {
        Movie movie = movieRepository.findById(id).get()
        MovieDTO movieDTO = new MovieDTO(movie)
        return movieDTO
    }
}
