package com.kodilla.cards.mapper;

import com.kodilla.cards.domain.Cards;
import com.kodilla.cards.domain.CardsDto;
import org.springframework.stereotype.Service;

@Service
public class CardsMapper {

    public Cards mapToCards(CardsDto cardsDto){
        return new Cards(cardsDto.getCardId(),cardsDto.getCardType(), cardsDto.getAmount(), cardsDto.getCustomerId());
    }

    public CardsDto mapToCardsDto(Cards cards){
        return new CardsDto(cards.getCardId(), cards.getCardType(), cards.getAmount(), cards.getCustomerId());
    }
}
