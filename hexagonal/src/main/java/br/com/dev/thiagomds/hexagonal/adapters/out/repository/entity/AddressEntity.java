package br.com.dev.thiagomds.hexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data
public class AddressEntity {
    private String street;
    private String city;
    private String state;
}
