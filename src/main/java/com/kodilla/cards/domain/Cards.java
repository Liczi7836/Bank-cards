package com.kodilla.cards.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cards")
@NoArgsConstructor
public class Cards {

    @Id
    private Long cardId;
    private String cardType;
    private double amount;
    private Long customerId;

    public Cards(Long cardId, String cardType, double amount, Long customerId) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.amount = amount;
        this.customerId = customerId;
    }
}
