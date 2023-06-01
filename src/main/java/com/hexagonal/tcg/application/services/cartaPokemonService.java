package com.hexagonal.tcg.application.services;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.in.CreateCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.in.DeleteCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.in.RetrieveCartaPokemonUseCase;
import com.hexagonal.tcg.domain.ports.in.UpdateCartaPokemonUseCase;

import java.util.List;
import java.util.Optional;

public class cartaPokemonService implements CreateCartaPokemonUseCase, RetrieveCartaPokemonUseCase, UpdateCartaPokemonUseCase, DeleteCartaPokemonUseCase {

    private final CreateCartaPokemonUseCase createCartaPokemonUseCase;
    private final RetrieveCartaPokemonUseCase retrieveCartaPokemonUseCase;
    private final UpdateCartaPokemonUseCase updateCartaPokemonUseCase;
    private final DeleteCartaPokemonUseCase deleteCartaPokemonUseCase;

    public cartaPokemonService(CreateCartaPokemonUseCase createCartaPokemonUseCase, RetrieveCartaPokemonUseCase retrieveCartaPokemonUseCase, UpdateCartaPokemonUseCase updateCartaPokemonUseCase, DeleteCartaPokemonUseCase deleteCartaPokemonUseCase) {
        this.createCartaPokemonUseCase = createCartaPokemonUseCase;
        this.retrieveCartaPokemonUseCase = retrieveCartaPokemonUseCase;
        this.updateCartaPokemonUseCase = updateCartaPokemonUseCase;
        this.deleteCartaPokemonUseCase = deleteCartaPokemonUseCase;
    }


    @Override
    public CartaPokemon createCartaPokemon(CartaPokemon carta) {
        return createCartaPokemonUseCase.createCartaPokemon(carta);
    }

    @Override
    public boolean deleteCartaPokemon(Long id) {
        return deleteCartaPokemonUseCase.deleteCartaPokemon(id);
    }

    @Override
    public Optional<CartaPokemon> getCartaPokemon(Long id) {
        return retrieveCartaPokemonUseCase.getCartaPokemon(id);
    }

    @Override
    public List<CartaPokemon> getAllCartas() {
        return retrieveCartaPokemonUseCase.getAllCartas();
    }

    @Override
    public Optional<CartaPokemon> updateCartaPokemon(Long id, CartaPokemon updateCarta) {
        return updateCartaPokemonUseCase.updateCartaPokemon(id,updateCarta);
    }
}
