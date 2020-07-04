package com.shiblesadik.foodies.repository.foods;

import com.shiblesadik.foodies.models.foods.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findById(String id);

    Category findByName(String name);

    List<Category> findByNameLike(String name);
}
