package com.hexagonal.tcg.infraestructure.repositories;

import com.hexagonal.tcg.infraestructure.entities.CartaPokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCartaPokemonRepository extends JpaRepository<CartaPokemonEntity, Long> {

}
