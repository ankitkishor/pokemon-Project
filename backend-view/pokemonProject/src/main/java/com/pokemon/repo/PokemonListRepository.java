package com.pokemon.repo;

import com.pokemon.entity.PokemonList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonListRepository extends MongoRepository<PokemonList, String> {
}
