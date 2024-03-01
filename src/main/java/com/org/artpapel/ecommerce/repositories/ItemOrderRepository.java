package com.org.artpapel.ecommerce.repositories;

import com.org.artpapel.ecommerce.models.ItemOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemOrderRepository extends JpaRepository<ItemOrder, Long> {
}
