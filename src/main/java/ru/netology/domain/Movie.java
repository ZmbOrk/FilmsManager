package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data

    public class Movie {
        private int id;
        private String posterUrl;
        private String nameMovie;
        private String filmGenre;
    }
