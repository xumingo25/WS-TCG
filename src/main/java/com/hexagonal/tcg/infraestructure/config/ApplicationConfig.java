package com.hexagonal.tcg.infraestructure.config;

import com.hexagonal.tcg.application.services.CartaPokemonService;
import com.hexagonal.tcg.application.usercases.CreateCartaPokemonUseCaseImpl;
import com.hexagonal.tcg.application.usercases.DeleteCartaPokemonUseCaseImpl;
import com.hexagonal.tcg.application.usercases.RetrieveCartaPokemonUseCaseImpl;
import com.hexagonal.tcg.application.usercases.UpdateCartaPokemonUseCaseImpl;
import com.hexagonal.tcg.domain.ports.out.CartaPokemonRepositoryPort;
import com.hexagonal.tcg.infraestructure.repositories.JpaCartaPokemonRepository;
import com.hexagonal.tcg.infraestructure.repositories.JpaCartaPokemonRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public CartaPokemonService cartaPokemonService(CartaPokemonRepositoryPort cartaPokemonRepositoryPort) {
        return new CartaPokemonService(
                new CreateCartaPokemonUseCaseImpl(cartaPokemonRepositoryPort),
                new RetrieveCartaPokemonUseCaseImpl(cartaPokemonRepositoryPort),
                new UpdateCartaPokemonUseCaseImpl(cartaPokemonRepositoryPort),
                new DeleteCartaPokemonUseCaseImpl(cartaPokemonRepositoryPort)
        );
    }

    @Bean
    public CartaPokemonRepositoryPort cartaPokemonRepositoryPort(JpaCartaPokemonRepositoryAdapter jpaCartaPokemonRepositoryAdapter){
        return jpaCartaPokemonRepositoryAdapter;
    }



}
