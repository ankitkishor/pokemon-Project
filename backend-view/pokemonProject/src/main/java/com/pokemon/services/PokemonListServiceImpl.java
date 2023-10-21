/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.services;

import com.pokemon.entity.PokemonList;
import com.pokemon.repo.PokemonListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonListServiceImpl implements PokemonListService {

    private final PokemonListRepository pokemonListRepository;

    @Autowired
    public PokemonListServiceImpl(PokemonListRepository pokemonListRepository) {
        this.pokemonListRepository = pokemonListRepository;
    }
    @Override
    public List<PokemonList> getAllPokemon() {
        return (List<PokemonList>) pokemonListRepository.findAll();
    }

    @Override
    public PokemonList getPokemonByName(String name) {
        return pokemonListRepository.findById(name) .orElseThrow(() -> new IllegalCallerException("Pokemon with name " + name + " not found."));
    }

    @Override
    public PokemonList createPokemon(PokemonList pokemon) {
        return pokemonListRepository.save(pokemon);
    }

    @Override
    public PokemonList updatePokemon(String name, PokemonList pokemon) {
        PokemonList result=getPokemonByName(name);
        result.setName(pokemon.getName());
        result.setUrl(pokemon.getUrl());
        return pokemonListRepository.save(result);


    }

    @Override
    public void deletePokemon(String name) {
        pokemonListRepository.deleteById(name);
    }
}
