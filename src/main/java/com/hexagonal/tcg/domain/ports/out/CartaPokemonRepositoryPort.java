package com.hexagonal.tcg.domain.ports.out;

import com.hexagonal.tcg.domain.models.CartaPokemon;

import java.util.Optional;
import java.util.List;

public interface CartaPokemonRepositoryPort {
    CartaPokemon save(CartaPokemon carta);

    Optional<CartaPokemon> findById(Long id);

    List<CartaPokemon> findAll();

    Optional<CartaPokemon> update(CartaPokemon carta);

    boolean deleteById(Long id);

}
