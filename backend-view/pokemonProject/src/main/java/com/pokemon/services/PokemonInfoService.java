package com.pokemon.services;

import com.pokemon.entity.PokemonInfo;

import java.util.List;

public interface PokemonInfoService {
    public List<PokemonInfo> getAllPokemonInfo();
    public PokemonInfo getPokemonInfoByName(String name);
    public PokemonInfo createPokemonInfo(PokemonInfo pokemonInfo);
    public PokemonInfo updatePokemonInfo(String name, PokemonInfo pokemonInfo);
    public void deletePokemonInfo(String name);
}
