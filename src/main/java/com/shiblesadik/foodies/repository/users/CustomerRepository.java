package com.shiblesadik.foodies.repository.users;

import com.shiblesadik.foodies.models.users.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Optional<Customer> findById(String id);

    Customer findByPhoneAndPassword(String phone, String password);
}
