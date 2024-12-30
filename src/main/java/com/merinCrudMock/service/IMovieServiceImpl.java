package com.merinCrudMock.service;

import com.merinCrudMock.entity.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IMovieServiceImpl implements IMovieService{

    private List<Movie> bangaloreMoviesList = new ArrayList<>();

    @PostConstruct
    public void init() {
        bangaloreMoviesList.add(new Movie(1, "Pushpa-2", "Telugu", "Action", "7.5"));
        bangaloreMoviesList.add(new Movie(2, "Gravity", "English", "Science", "8.0"));
        bangaloreMoviesList.add(new Movie(2, "Demon Slayer", "Japanese", "Horror", "6.5"));
        bangaloreMoviesList.add(new Movie(3, "Smile", "English", "Horror", "7.0"));
        bangaloreMoviesList.add(new Movie(4, "KGF-2", "Kannada", "Action", "8.5"));
    }

    @Override
    public List<Movie> getAllMovies() {
        return bangaloreMoviesList;
    }
}
