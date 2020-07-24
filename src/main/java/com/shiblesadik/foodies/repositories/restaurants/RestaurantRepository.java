package com.shiblesadik.foodies.repositories.restaurants;

import com.shiblesadik.foodies.models.restaurants.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    Optional<Restaurant> findById(String id);

    List<Restaurant> findAllByNameIsLike(String name);

    List<Restaurant> findAllByAreaId(String areaId);

//    List<Restaurant> findRestaurantByComplaintsIdsExists(String complaintId);
}
