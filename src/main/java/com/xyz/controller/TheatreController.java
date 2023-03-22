package com.xyz.controller;

import com.xyz.model.Screen;
import com.xyz.model.Theatre;
import com.xyz.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/addTheatre")
    public ResponseEntity<Theatre> addTheatre(@RequestParam String name, @RequestParam Integer cityId) {
        Theatre addedTheatre = theatreService.createTheatre(name, cityId);
        return new ResponseEntity<>(addedTheatre, HttpStatus.CREATED);
    }

    @PostMapping("/addScreen")
    public ResponseEntity<Screen> addScreen(@RequestParam Integer theatreId, @RequestParam String screenName) {
        return new ResponseEntity<>(theatreService.addScreen(theatreId, screenName), HttpStatus.CREATED);
    }

    // Similarly we can have other methods to update and delete

}
