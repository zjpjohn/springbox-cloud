package io.springbox.catalog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springbox.catalog.domain.Genre;
import io.springbox.catalog.repositories.GenreRepository;

@RestController
public class GenreController {

    @Autowired
    GenreRepository genreRepository;

    @RequestMapping(value = "/genres", method = RequestMethod.GET)
    public Iterable<Genre> genres() {
        return genreRepository.findAll();
    }

    @RequestMapping(value = "/genres/{mlId}", method = RequestMethod.GET)
    public Genre genre(@PathVariable Long id) {
        return genreRepository.findOne(id);
    }


}
