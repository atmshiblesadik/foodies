package com.shiblesadik.foodies.repositories.foods;

import com.shiblesadik.foodies.models.foods.Food;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends MongoRepository<Food, String> {
    Optional<Food> findById(String id);

    List<Food> findAllByNameIsLike(String name);

    List<Food> findAllByCategoryId(String id);

    List<Food> findAllByAreaId(String id);

    List<Food> findAllByRestaurantId(String id);

    List<Food> findAllByRestaurantIdAndCategoryId(String resId, String catId);

    List<Food> findAllByAreaIdAndCategoryId(String areaId, String catId);

    List<Food> findAllByRestaurantIdAndNameIsLike(String id, String name);

    List<Food> findAllByAreaIdAndNameIsLike(String id, String name);

    List<Food> findAllByCategoryIdAndNameIsLike(String id, String name);
}
