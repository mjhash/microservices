package com.practice.moviecatalogueservice.modal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public ResponseEntity<List<CatalogItems>> getCatalog(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(new Rating("1234", 3), new Rating("4569", 2));
        Movie movie = restTemplate.getForObject("localhost:8083/movies/1234", Movie.class);
        return ResponseEntity
                .ok(Collections.singletonList(new CatalogItems("Transformer", "movie about alien robots", 3)));
    }
}
