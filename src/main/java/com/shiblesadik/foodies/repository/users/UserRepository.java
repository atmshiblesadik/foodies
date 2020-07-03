package com.shiblesadik.foodies.repository.users;

import com.shiblesadik.foodies.models.users.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);

    User findByPhoneAndPassword(String phone, String password);
}
