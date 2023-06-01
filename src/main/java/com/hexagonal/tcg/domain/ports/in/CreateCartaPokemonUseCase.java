package com.hexagonal.tcg.domain.ports.in;

import com.hexagonal.tcg.domain.models.CartaPokemon;

public interface CreateCartaPokemonUseCase {

    CartaPokemon createCartaPokemon(CartaPokemon carta);
}
