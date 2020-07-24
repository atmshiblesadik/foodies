package com.shiblesadik.foodies.repositories.areas;

import com.shiblesadik.foodies.models.areas.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends MongoRepository<City, String> {
    Optional<City> findById(String id);

    List<City> findAllByNameIsLike(String name);
}
