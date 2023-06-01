package com.hexagonal.tcg.application.usercases;

import com.hexagonal.tcg.domain.ports.in.DeleteCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;

public class DeleteCartaPokemonUseCaseImpl implements DeleteCartaPokemonUseCase {

    private final CartaPokemonRepositoryPort cartaPokemonRepositoryPort;

    public DeleteCartaPokemonUseCaseImpl(CartaPokemonRepositoryPort cartaPokemonRepositoryPort) {
        this.cartaPokemonRepositoryPort = cartaPokemonRepositoryPort;
    }

    @Override
    public boolean deleteCartaPokemon(Long id) {
        return cartaPokemonRepositoryPort.deleteById(id);
    }
}
