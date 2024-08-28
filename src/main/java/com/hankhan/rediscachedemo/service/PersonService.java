/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.service;


import com.hankhan.rediscachedemo.entity.Person;

import java.util.List;

/**
 * Todo: What does this class do...
 *
 * @author Shu-Han Han
 * @version 1.0
 * @since 20.0.1
 */
public interface PersonService {

    Person getPersonById(Long id);

    List<Person> getAllPersons();
}