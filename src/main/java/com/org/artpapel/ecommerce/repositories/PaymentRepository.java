package com.org.artpapel.ecommerce.repositories;

import com.org.artpapel.ecommerce.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
