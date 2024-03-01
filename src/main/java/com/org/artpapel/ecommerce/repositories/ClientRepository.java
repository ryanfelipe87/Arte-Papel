package com.org.artpapel.ecommerce.repositories;

import com.org.artpapel.ecommerce.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
