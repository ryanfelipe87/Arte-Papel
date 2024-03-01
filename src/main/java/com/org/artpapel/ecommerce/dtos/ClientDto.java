package com.org.artpapel.ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {

    private Long id;
    private String name;
    private String address;
    private String email;
    private String cellPhone;
    private Double balanceMoney;
}
