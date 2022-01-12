package br.com.felipelima.dsmovie.service

import br.com.felipelima.dsmovie.dto.MovieDTO
import br.com.felipelima.dsmovie.dto.ScoreDTO
import br.com.felipelima.dsmovie.model.Movie
import br.com.felipelima.dsmovie.model.Score
import br.com.felipelima.dsmovie.model.User
import br.com.felipelima.dsmovie.repository.MovieRepository
import br.com.felipelima.dsmovie.repository.ScoreRepository
import br.com.felipelima.dsmovie.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.time.LocalDateTime

@Service
class ScoreService {

    @Autowired
    ScoreRepository scoreRepository

    @Autowired
    MovieRepository movieRepository

    @Autowired
    UserRepository userRepository

    @Transactional
    MovieDTO saveScore(ScoreDTO scoreDTO) {
        User user = userRepository.findByEmail(scoreDTO.email)

        if(user == null) {
            user = new User()
            user.email = scoreDTO.email
            userRepository.saveAndFlush(user)
        }

        Movie movie = movieRepository.findById(scoreDTO.movieId).get()

        Score score = new Score()
        score.id.movie = movie
        score.id.user = user
        score.value = scoreDTO.value

        scoreRepository.saveAndFlush(score)

        double sum = 0.0
        for(Score s : movie.scores) {
            sum = sum + s.value
        }

        double avg = sum / movie.scores.size()

        movie.score = avg
        movie.count = movie.scores.size()

        movieRepository.saveAndFlush(movie)

        return new MovieDTO(movie)

    }
}
