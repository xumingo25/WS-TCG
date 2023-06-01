package com.hexagonal.tcg.application.usercases;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.in.CreateCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;

public class CreateCartaPokemonUseCaseImpl implements CreateCartaPokemonUseCase {

    private final CartaPokemonRepositoryPort taskRepositoryPort;

    public CreateCartaPokemonUseCaseImpl(CartaPokemonRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public CartaPokemon createCartaPokemon(CartaPokemon carta) {
        return taskRepositoryPort.save(carta);
    }
}
