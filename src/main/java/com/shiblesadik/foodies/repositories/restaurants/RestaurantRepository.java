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

    Restaurant findByPhone(String phone);

    Restaurant findByEmail(String email);

    Restaurant findByPhoneAndPassword(String phone, String password);

    Restaurant findByEmailAndPassword(String email, String password);

    Restaurant findByPhoneAndEmail(String phone, String email);

//    List<Restaurant> findRestaurantByComplaintsIdsExists(String complaintId);
}
