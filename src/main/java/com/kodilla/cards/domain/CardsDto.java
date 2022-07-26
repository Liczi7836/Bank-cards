package com.kodilla.cards.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
public class CardsDto {

    private Long cardId;
    private String cardType;
    private double amount;
    private Long customerId;

    public CardsDto(Long cardId, String cardType, double amount, Long customerId) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.amount = amount;
        this.customerId = customerId;
    }
}
