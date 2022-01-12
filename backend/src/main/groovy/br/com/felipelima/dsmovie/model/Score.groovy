package br.com.felipelima.dsmovie.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table
import java.time.LocalDateTime

@Entity
@ToString(includePackage = false, includeNames = true)
@EqualsAndHashCode
@Table(name = "tb_score")
class Score {

    @EmbeddedId
    ScorePK id = new ScorePK()

    @Column(nullable = false)
    Double value

    @JsonIgnore
    @CreationTimestamp
    @Column(nullable = false, columnDefinition = "datetime", updatable = false)
    LocalDateTime dataCadastro

    @JsonIgnore
    @UpdateTimestamp
    @Column(nullable = false, columnDefinition = "datetime")
    LocalDateTime dataAtualizacao
}
