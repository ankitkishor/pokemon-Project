package com.pokemon.services;

import com.pokemon.entity.PokemonList;

import java.util.List;

public interface PokemonListService {
   public  List<PokemonList> getAllPokemon();

   public PokemonList getPokemonByName(String name);
   public PokemonList createPokemon(PokemonList pokemon);
   public PokemonList updatePokemon(String name, PokemonList pokemon);
   public void deletePokemon(String name);

}
