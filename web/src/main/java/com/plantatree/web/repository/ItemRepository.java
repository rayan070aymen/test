package com.plantatree.web.repository;

import com.plantatree.web.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
