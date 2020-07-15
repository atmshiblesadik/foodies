package com.shiblesadik.foodies.repository.restaurants;

import com.shiblesadik.foodies.models.restaurants.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    Restaurant findRestaurantById(String id);

    Optional<Restaurant> findById(String id);

    List<Restaurant> findByNameLike(String id);

    List<Restaurant> findAllByItemsIsLike(String item);
}
