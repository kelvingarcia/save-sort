package com.kelvin.savesort.repository;

import com.kelvin.savesort.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
