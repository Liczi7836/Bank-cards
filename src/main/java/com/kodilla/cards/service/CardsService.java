package com.kodilla.cards.service;

import com.kodilla.cards.domain.Cards;
import com.kodilla.cards.repository.CardsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardsService {

    private CardsRepository cardsRepository;

    public Cards getCardById(Long id){
        return cardsRepository.findByCardId(id).orElse(null);
    }

}
