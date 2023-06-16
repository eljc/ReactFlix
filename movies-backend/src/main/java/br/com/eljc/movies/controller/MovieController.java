package br.com.eljc.movies.controller;

import br.com.eljc.movies.document.Movies;
import br.com.eljc.movies.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {

    private MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Movies>> getMoview(){

        List<Movies> movies = service.findAllMovies();

       System.out.println("Lista de movies: "+movies.size());

       Movies movie = new Movies();
       movie.setPoster("teste");
       movie.setTitle("Filme de acao");
       movie.setImdbId("123456");
     //  repository.save(movie);

        return  new ResponseEntity<List<Movies>>(service.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/save")
    public ResponseEntity<List<Movies>> saveMoview(){

        List<String> genres = new ArrayList<>();
        genres.add("Action");
        genres.add("Comedy");
        Movies movie = new Movies();
        movie.setImdbId("123456");
        movie.setTitle("Filme de acao");
        movie.setReleaseDate("2023-06-13");
        movie.setTrailerLink("http://www.google.com");
        movie.setGenres(genres);
        movie.setPoster("http://www.google.com");

        List<String> backdrops = new ArrayList<>();
        backdrops.add("https://image.tmdb.org/t/p/original/2wPJIFrBhzzAP8oHDOlShMkERH6.jpg");
        backdrops.add("https://image.tmdb.org/t/p/original/fnfirCEDIkxZnQEtEMMSgllm0KZ.jpg");
        movie.setBackdrops(backdrops);

       // service.save(movie);

        return  new ResponseEntity<List<Movies>>(service.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId){
        System.out.println("buscar pelo imdb: "+imdbId);

        return new ResponseEntity<Optional<Movies>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
    }
}
