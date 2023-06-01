package com.hexagonal.tcg.domain.ports.in;

import com.hexagonal.tcg.domain.models.CartaPokemon;

import java.util.Optional;

public interface UpdateCartaPokemonUseCase {
    Optional<CartaPokemon> updateCartaPokemon(Long id, CartaPokemon updateCarta);

}
