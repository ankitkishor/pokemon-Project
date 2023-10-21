package com.pokemon.repo;

import com.pokemon.entity.PokemonInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonInfoRepository extends MongoRepository<PokemonInfo, String> {
//    @Query("SELECT p FROM PokemonInfo p WHERE p.name = :name")
//    Optional<PokemonInfo> findByName(@Param("name") String name);
//
//    @Modifying
//    @Query("DELETE FROM PokemonInfo p WHERE p.name = :name")
//    void deleteByName(@Param("name") String name);
}
