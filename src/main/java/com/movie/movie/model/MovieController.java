package com.movie.movie.model;

import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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








}
