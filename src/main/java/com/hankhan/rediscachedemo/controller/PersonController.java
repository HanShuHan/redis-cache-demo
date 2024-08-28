/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.controller;


import com.hankhan.rediscachedemo.entity.Person;
import com.hankhan.rediscachedemo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Todo: What does this class do...
 *
 * @author Shu-Han Han
 * @version 1.0
 * @since 20.0.1
 */
@RestController
@RequestMapping("person")
@AllArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("all")
    public ResponseEntity<List<Person>> getAllPersons() {
        return new ResponseEntity<>(personService.getAllPersons(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable final Long id) {
        return new ResponseEntity<>(personService.getPersonById(id), HttpStatus.OK);
    }

}