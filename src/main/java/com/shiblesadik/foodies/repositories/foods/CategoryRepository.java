package com.shiblesadik.foodies.repositories.foods;

import com.shiblesadik.foodies.models.foods.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
