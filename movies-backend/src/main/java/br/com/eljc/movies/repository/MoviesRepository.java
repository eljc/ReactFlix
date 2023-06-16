package br.com.eljc.movies.repository;

import br.com.eljc.movies.document.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MoviesRepository extends MongoRepository<Movies, ObjectId>{
    Optional<Movies> findMovieByImdbId(String imdbId);

}
