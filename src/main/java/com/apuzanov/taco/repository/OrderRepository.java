package com.apuzanov.taco.repository;

import com.apuzanov.taco.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
