/*
 * Project name: redis-cache-demo
 * Date: August 28, 2024
 */

package com.hankhan.rediscachedemo.repository;


import com.hankhan.rediscachedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}