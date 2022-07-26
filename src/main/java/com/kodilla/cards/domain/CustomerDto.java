package com.kodilla.cards.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDto {

    private Long customerId;
    private String firstName;
    private String lastName;

    public CustomerDto(Long customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
