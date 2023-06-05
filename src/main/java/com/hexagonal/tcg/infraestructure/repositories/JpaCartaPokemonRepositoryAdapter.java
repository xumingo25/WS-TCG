package com.hexagonal.tcg.infraestructure.repositories;

import com.hexagonal.tcg.domain.models.CartaPokemon;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;
import com.hexagonal.tcg.infraestructure.entities.Carta;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaCartaPokemonRepositoryAdapter implements CartaPokemonRepositoryPort {

    private final JpaCartaPokemonRepository jpaCartaPokemonRepository;

    public JpaCartaPokemonRepositoryAdapter(JpaCartaPokemonRepository jpaCartaPokemonRepository) {
        this.jpaCartaPokemonRepository = jpaCartaPokemonRepository;
    }


    @Override
    public CartaPokemon save(CartaPokemon carta) {
        Carta cartaPokemonEntity = Carta.fromDomainModel(carta);
        Carta savedCartaPokemonEntity = jpaCartaPokemonRepository.save(cartaPokemonEntity);
        return savedCartaPokemonEntity.toDomainModel();
    }

    @Override
    public Optional<CartaPokemon> findById(Long id) {
        return jpaCartaPokemonRepository.findById(id).map(Carta::toDomainModel);
    }

    @Override
    public List<CartaPokemon> findAll() {
        return jpaCartaPokemonRepository
                .findAll().stream()
                .map(Carta::toDomainModel).collect(Collectors.toList());
    }

    @Override
    public Optional<CartaPokemon> update(CartaPokemon carta) {
        if(jpaCartaPokemonRepository.existsById(carta.getId())){
            Carta cartaPokemonEntity = Carta.fromDomainModel(carta);
            Carta updateCartaPokemonEntity = jpaCartaPokemonRepository.save(cartaPokemonEntity);
            return Optional.of(updateCartaPokemonEntity.toDomainModel());
        }

        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaCartaPokemonRepository.existsById(id)){
            jpaCartaPokemonRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
