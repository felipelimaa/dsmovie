package br.com.felipelima.dsmovie.repository

import br.com.felipelima.dsmovie.model.Score
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ScoreRepository extends JpaRepository<Score, Long> {

}