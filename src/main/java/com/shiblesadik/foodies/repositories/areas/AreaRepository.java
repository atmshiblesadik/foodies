package com.shiblesadik.foodies.repository.areas;

import com.shiblesadik.foodies.models.areas.Area;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends MongoRepository<Area, Integer> {
}
