package com.hexagonal.tcg.application.usercases;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.in.RetrieveCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveCartaPokemonUseCaseImpl implements RetrieveCartaPokemonUseCase {

    private final CartaPokemonRepositoryPort cartaPokemonRepositoryPort;

    public RetrieveCartaPokemonUseCaseImpl(CartaPokemonRepositoryPort cartaPokemonRepositoryPort) {
        this.cartaPokemonRepositoryPort = cartaPokemonRepositoryPort;
    }

    @Override
    public Optional<CartaPokemon> getCartaPokemon(Long id) {
        return cartaPokemonRepositoryPort.findById(id);
    }

    @Override
    public List<CartaPokemon> getAllCartas() {
        return cartaPokemonRepositoryPort.findAll();
    }
}
