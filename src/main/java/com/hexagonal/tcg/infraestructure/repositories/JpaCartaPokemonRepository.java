package com.hexagonal.tcg.infraestructure.repositories;

import com.hexagonal.tcg.infraestructure.entities.CartaPokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaCartaPokemonRepository extends JpaRepository<CartaPokemonEntity, Long> {

}
