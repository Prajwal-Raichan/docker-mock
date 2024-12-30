package com.merinCrudMock.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MOVIE_TB")
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    private String movieName;

    private String movieLanguage;

    private String movieGenre;

    private String movieImdbRating;


}
