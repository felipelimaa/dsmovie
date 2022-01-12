package br.com.felipelima.dsmovie.dto

import br.com.felipelima.dsmovie.model.Movie

class MovieDTO {

    Long id

    String title

    Double score

    Integer count

    String image

    MovieDTO(Movie movie) {
        this.id = movie.id
        this.title = movie.title
        this.score = movie.score
        this.count = movie.count
        this.image = movie.image
    }

}
