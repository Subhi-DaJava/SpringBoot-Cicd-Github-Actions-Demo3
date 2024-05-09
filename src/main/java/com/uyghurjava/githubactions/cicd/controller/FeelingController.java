package com.uyghurjava.githubactions.cicd.controller;

import com.uyghurjava.githubactions.cicd.model.Feeling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/feeling", produces = "application/json")
public class FeelingController {

    @GetMapping
    public List<Object> fetch() {
        return List.of(
                new Feeling(1, "Happy", 1),
                new Feeling(2, "Sad", 0),
                new Feeling(3, "Angry", 0),
                new Feeling(4, "Excited", 1),
                new Feeling(5, "Tired", 0));
    }
}
