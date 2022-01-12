package br.com.felipelima.dsmovie.controller

import br.com.felipelima.dsmovie.dto.MovieDTO
import br.com.felipelima.dsmovie.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class MovieController {

    @Autowired
    MovieService movieService

    @GetMapping
    Page<MovieDTO> findAll(Pageable pageable){
        return movieService.findAll(pageable)
    }

    @GetMapping("/{id}")
    MovieDTO findById(@PathVariable Long id){
        return movieService.findById(id)
    }

}
