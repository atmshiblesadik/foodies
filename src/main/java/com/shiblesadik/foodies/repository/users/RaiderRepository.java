package com.shiblesadik.foodies.repository.users;

import com.shiblesadik.foodies.models.users.Raider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RaiderRepository extends MongoRepository<Raider, String> {
    Optional<Raider> findById(String id);

    Raider findByPhone(String phone);

    Raider findByEmail(String email);

    Raider findByPhoneAndPassword(String phone, String password);
}
