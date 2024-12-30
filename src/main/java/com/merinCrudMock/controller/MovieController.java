package com.merinCrudMock.controller;

import com.merinCrudMock.entity.Movie;
import com.merinCrudMock.service.IMovieService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {


    @Autowired
    private IMovieService movieService;


    @GetMapping("/fetchAllMovies")
    public ResponseEntity<List<Movie>> getAllMovies() {

        List<Movie> movieList = new ArrayList<>();
        movieList = movieService.getAllMovies();
        return new ResponseEntity<>(movieList, HttpStatus.OK);

    }

}
