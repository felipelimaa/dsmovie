package br.com.felipelima.dsmovie.controller

import br.com.felipelima.dsmovie.dto.MovieDTO
import br.com.felipelima.dsmovie.dto.ScoreDTO
import br.com.felipelima.dsmovie.service.ScoreService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/scores")
class ScoreController {

    @Autowired
    ScoreService scoreService

    @PutMapping
    MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO){
        MovieDTO movieDTO = scoreService.saveScore(scoreDTO)

        return movieDTO
    }
}
