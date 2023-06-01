package com.hexagonal.tcg.application.usercases;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.in.UpdateCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;

import java.util.Optional;

public class UpdateCartaPokemonUseCaseImpl implements UpdateCartaPokemonUseCase {
    private final CartaPokemonRepositoryPort cartaPokemonRepositoryPort;

    public UpdateCartaPokemonUseCaseImpl(CartaPokemonRepositoryPort cartaPokemonRepositoryPort) {
        this.cartaPokemonRepositoryPort = cartaPokemonRepositoryPort;
    }

    @Override
    public Optional<CartaPokemon> updateCartaPokemon(Long id, CartaPokemon updateCarta) {
        return cartaPokemonRepositoryPort.update(updateCarta);
    }
}
