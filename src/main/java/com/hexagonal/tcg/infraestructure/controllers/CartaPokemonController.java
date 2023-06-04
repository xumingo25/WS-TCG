package com.hexagonal.tcg.infraestructure.controllers;

import com.hexagonal.tcg.application.services.CartaPokemonService;
import com.hexagonal.tcg.domain.models.CartaPokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cards")
public class CartaPokemonController {

    private final CartaPokemonService cartaPokemonService;


    public CartaPokemonController(CartaPokemonService cartaPokemonService) {
        this.cartaPokemonService = cartaPokemonService;
    }

    @PostMapping
    public ResponseEntity<CartaPokemon> createCartaPokemon(@RequestBody CartaPokemon carta){
        CartaPokemon createdCartaPokemon = cartaPokemonService.createCartaPokemon(carta);
        return new ResponseEntity<>(createdCartaPokemon, HttpStatus.CREATED);
    }
}
