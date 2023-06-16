package br.com.eljc.movies.services;

import br.com.eljc.movies.document.Movies;
import br.com.eljc.movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MoviesRepository repository;

    public List<Movies> findAllMovies(){

            return repository.findAll();

    }

    public void save(Movies movie){
        repository.save(movie);
    }


    public Optional<Movies> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }

}
