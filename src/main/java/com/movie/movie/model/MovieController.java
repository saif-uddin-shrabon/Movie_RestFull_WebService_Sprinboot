package com.movie.movie.model;

import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.movie.movie.model.DB.movie;

@RestController
public class MovieController {



    @GetMapping("/ListOfMovie")
    public List<Bean> getMovielist(){

        return  movie;
    }

    @PostMapping("/updateMovie")
    public ResponseEntity<Bean> creatMovie(@RequestBody Bean bean){

        movie.add(bean);

        return new ResponseEntity<Bean>(bean,HttpStatus.CREATED);
    }


    @PutMapping("/updateMovie/{imdbId}")
    public ResponseEntity<Bean> updateMovie(@PathVariable String imdbId, @RequestBody Bean updatedMovie) {

        Bean existingMovie = null;
        for (Bean movieItem : movie) {
            if (movieItem.getImdbId().equals(imdbId)) {
                existingMovie = movieItem;
                break;
            }
        }

        if (existingMovie != null) {

            existingMovie.setTitle(updatedMovie.getTitle());
            existingMovie.setDescription(updatedMovie.getDescription());
            existingMovie.setRating(updatedMovie.getRating());
            existingMovie.setGenre(updatedMovie.getGenre());
            existingMovie.setYear(updatedMovie.getYear());

            return new ResponseEntity<>(existingMovie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteMovie/{imdbId}")
    public ResponseEntity<String> deleteMovie(@PathVariable String imdbId) {

        Iterator<Bean> iterator = movie.iterator();
        while (iterator.hasNext()) {
            Bean movieItem = iterator.next();
            if (movieItem.getImdbId().equals(imdbId)) {
                iterator.remove();
                return new ResponseEntity<>("Movie with IMDb ID " + imdbId + " deleted successfully", HttpStatus.OK);
            }
        }


        return new ResponseEntity<>("Movie with IMDb ID " + imdbId + " not found", HttpStatus.NOT_FOUND);
    }


}
