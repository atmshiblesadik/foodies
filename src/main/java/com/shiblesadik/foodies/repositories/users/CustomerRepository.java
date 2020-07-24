package com.shiblesadik.foodies.repositories.users;

import com.shiblesadik.foodies.models.users.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Optional<Customer> findById(String id);

    Customer findByPhone(String phone);

    List<Customer> findAllByAreaId(String area);

    Customer findByPhoneAndAndPassword(String phone, String password);

}