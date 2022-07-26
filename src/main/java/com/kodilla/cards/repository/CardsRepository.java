package com.kodilla.cards.repository;

import com.kodilla.cards.domain.Cards;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CardsRepository extends CrudRepository<Cards, Long> {

    Optional<Cards> findByCardId(Long id);
}
