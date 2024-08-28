/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.config;


import com.hankhan.rediscachedemo.constant.ProfileConstants;
import com.hankhan.rediscachedemo.entity.Person;
import com.hankhan.rediscachedemo.repository.PersonRepository;
import com.hankhan.rediscachedemo.util.LoggingUtils;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Todo: What does this class do...
 *
 * @author Shu-Han Han
 * @version 1.0
 * @since 20.0.1
 */
@Profile(ProfileConstants.DEV)
@AllArgsConstructor
@Component
public class DataSeeder implements CommandLineRunner {

    private final Class<?> clazz = DataSeeder.class;
    private final String className = clazz.getSimpleName();
    private final Logger logger = LoggerFactory.getLogger(clazz);

    private final PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("{} -> {}(): ", className, LoggingUtils.getCurrentMethodName());

        this.seedPersonsIfEmpty();
    }

    public void seedPersonsIfEmpty() {
        logger.info("{} -> {}(): ", className, LoggingUtils.getCurrentMethodName());

        if (personRepository.count() == 0L) {
            Person p1 = new Person("Hank", "Han", 36);
            Person p2 = new Person("Avigail", "Lee", 36);
            final List<Person> persons = Arrays.asList(p1, p2);

            personRepository.saveAllAndFlush(persons);
        }
    }

}