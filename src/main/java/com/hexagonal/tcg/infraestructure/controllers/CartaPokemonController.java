package com.hexagonal.tcg.infraestructure.controllers;

import com.hexagonal.tcg.application.services.CartaPokemonService;
import com.hexagonal.tcg.domain.models.CartaPokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{cartaId}")
    public ResponseEntity<CartaPokemon> getCartaByCodigo(@PathVariable long cartaId){
        return cartaPokemonService.getCartaPokemon(cartaId).map(
                cartaPokemon -> new ResponseEntity<>(cartaPokemon, HttpStatus.OK)
        ).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<CartaPokemon>> getAllCartas(){
        List<CartaPokemon> cartas = cartaPokemonService.getAllCartas();
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping("/{cartaId}")
    public ResponseEntity<CartaPokemon> updateCard(@PathVariable Long cartaId, @RequestBody CartaPokemon updateCarta){
        return cartaPokemonService.updateCartaPokemon(cartaId,updateCarta)
                .map(cartaPokemon -> new ResponseEntity<>(cartaPokemon, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{cartaId}")
    public ResponseEntity<CartaPokemon> deleteCardById(@PathVariable Long cartaId){
         if(cartaPokemonService.deleteCartaPokemon(cartaId)){
             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
         }else{
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }
    }


}
