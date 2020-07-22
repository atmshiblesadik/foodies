package com.shiblesadik.foodies.repository.users;

import com.shiblesadik.foodies.models.users.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
