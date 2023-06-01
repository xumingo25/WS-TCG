package com.hexagonal.tcg.domain.ports.in;

import com.hexagonal.tcg.domain.models.CartaPokemon;

import java.util.List;
import java.util.Optional;

public interface RetrieveCartaPokemonUseCase {
    Optional<CartaPokemon> getCartaPokemon(Long id);
    List<CartaPokemon> getAllCartas();
}
