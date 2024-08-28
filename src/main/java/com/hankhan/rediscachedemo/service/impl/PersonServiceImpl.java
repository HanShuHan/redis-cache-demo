/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.service.impl;


import com.hankhan.rediscachedemo.entity.Person;
import com.hankhan.rediscachedemo.repository.PersonRepository;
import com.hankhan.rediscachedemo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Todo: What does this class do...
 *
 * @author Shu-Han Han
 * @version 1.0
 * @since 20.0.1
 */
@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Cacheable(value = "person", key = "#id")
    @Override
    public Person getPersonById(final Long id) {
        return personRepository.findById(id)
                .orElseThrow();
    }

    @Cacheable(value = "allPersons")
    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}