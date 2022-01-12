package br.com.felipelima.dsmovie.repository

import br.com.felipelima.dsmovie.model.Movie
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository extends JpaRepository<Movie, Long> {

}