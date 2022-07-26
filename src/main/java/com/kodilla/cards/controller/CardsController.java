package com.kodilla.cards.controller;

import com.kodilla.cards.domain.CardsDto;
import com.kodilla.cards.mapper.CardsMapper;
import com.kodilla.cards.service.CardsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/v1/cards")
public class CardsController {

    @Autowired
    private CardsMapper cardsMapper;

    @Autowired
    private CardsService cardsService;

    @GetMapping("{id}")
    public ResponseEntity<CardsDto> getCardsById(@PathVariable Long id){
        return ResponseEntity.ok(cardsMapper.mapToCardsDto(cardsService.getCardById(id)));
    }

    @GetMapping("/cards/{id}")
    public CardsDto getCardsByIdSecond(@PathVariable Long id){
        return cardsMapper.mapToCardsDto(cardsService.getCardById(id));
    }
}
