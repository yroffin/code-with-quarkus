package org.yroffin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.yroffin.model.entity.Fruit;

public interface FruitRepository extends CrudRepository<Fruit, Long> {
    List<Fruit> findByColor(String color);
}
