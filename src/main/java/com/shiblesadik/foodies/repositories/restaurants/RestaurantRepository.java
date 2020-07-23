package com.shiblesadik.foodies.repositories.restaurants;

import com.shiblesadik.foodies.models.restaurants.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
