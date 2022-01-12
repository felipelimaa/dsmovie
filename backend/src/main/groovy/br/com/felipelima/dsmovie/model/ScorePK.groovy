package br.com.felipelima.dsmovie.model

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Embeddable
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
@ToString(includePackage = false, includeNames = true)
@EqualsAndHashCode
class ScorePK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "movie_id")
    Movie movie

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user
}
