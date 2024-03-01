package com.org.artpapel.ecommerce.models;

import com.org.artpapel.ecommerce.enums.StatusType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double valuePayment;

    @Enumerated(EnumType.STRING)
    private StatusType status;
    private LocalDateTime datePayment;

    @OneToOne
    @JoinColumn(name = "id_order")
    private Order order;
}
