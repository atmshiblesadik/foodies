package com.shiblesadik.foodies.repositories.users;

import com.shiblesadik.foodies.models.users.Raider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaiderRepository extends MongoRepository<Raider, String> {
}
