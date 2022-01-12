package br.com.felipelima.dsmovie.dto

import com.fasterxml.jackson.annotation.JsonProperty

class ScoreDTO {

    @JsonProperty("movie_id")
    Long movieId

    String email

    @JsonProperty("score")
    Double value

}
