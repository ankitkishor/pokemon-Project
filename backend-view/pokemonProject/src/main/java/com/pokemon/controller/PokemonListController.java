/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.controller;

import com.pokemon.entity.PokemonList;
import com.pokemon.services.PokemonListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/pokemonList")
public class PokemonListController {

    private final PokemonListService pokemonListService;

    @Autowired
    public PokemonListController(PokemonListService pokemonListService) {
        this.pokemonListService = pokemonListService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PokemonList>> getAllPokemon() {
        List<PokemonList> pokemonList = pokemonListService.getAllPokemon();
        return new ResponseEntity<>(pokemonList, HttpStatus.OK);
    }

    @GetMapping("/byName/{name}")
    public ResponseEntity<PokemonList> getPokemonByName(@PathVariable String name) {
        PokemonList pokemon = pokemonListService.getPokemonByName(name);
        return new ResponseEntity<>(pokemon, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<PokemonList> createPokemon(@RequestBody PokemonList pokemon) {
        PokemonList createdPokemon = pokemonListService.createPokemon(pokemon);
        return new ResponseEntity<>(createdPokemon, HttpStatus.CREATED);
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<PokemonList> updatePokemon(@PathVariable String name, @RequestBody PokemonList pokemon) {
        PokemonList updatedPokemon = pokemonListService.updatePokemon(name, pokemon);
        return new ResponseEntity<>(updatedPokemon, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<?> deletePokemon(@PathVariable String name) {
        pokemonListService.deletePokemon(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

