package com.hexagonal.tcg.infraestructure.repositories;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;
import com.hexagonal.tcg.infraestructure.entities.CartaPokemonEntity;

import java.util.List;
import java.util.Optional;

public class JpaCartaPokemonRepositoryAdapter implements CartaPokemonRepositoryPort {

    private final JpaCartaPokemonRepository jpaCartaPokemonRepository;

    public JpaCartaPokemonRepositoryAdapter(JpaCartaPokemonRepository jpaCartaPokemonRepository) {
        this.jpaCartaPokemonRepository = jpaCartaPokemonRepository;
    }


    @Override
    public CartaPokemon save(CartaPokemon carta) {
        CartaPokemonEntity cartaPokemonEntity = CartaPokemonEntity.fromDomainModeol(carta);
        CartaPokemonEntity savedCartaPokemonEntity = jpaCartaPokemonRepository.save(cartaPokemonEntity);
        return savedCartaPokemonEntity.toDomainModel();
    }

    @Override
    public Optional<CartaPokemon> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CartaPokemon> findAll() {
        return null;
    }

    @Override
    public Optional<CartaPokemon> update(CartaPokemon carta) {
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
