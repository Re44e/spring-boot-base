package com.studies.poc.repositories;

import com.studies.poc.entities.OrderItem;
import com.studies.poc.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
