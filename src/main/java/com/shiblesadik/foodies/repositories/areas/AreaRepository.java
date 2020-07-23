package com.shiblesadik.foodies.repositories.areas;

import com.shiblesadik.foodies.models.areas.Area;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AreaRepository extends MongoRepository<Area, String> {
    Optional<Area> findById(String id);

    List<Area> findByName(String name);

    List<Area> findAllByCity(String city);
}
