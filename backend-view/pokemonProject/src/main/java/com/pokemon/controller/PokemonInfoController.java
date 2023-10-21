/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.controller;

import com.pokemon.entity.PokemonInfo;
import com.pokemon.services.PokemonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/pokemonInfo")
public class PokemonInfoController {

    private final PokemonInfoService pokemonInfoService;

    @Autowired
    public PokemonInfoController(PokemonInfoService pokemonInfoService) {
        this.pokemonInfoService = pokemonInfoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PokemonInfo>> getAllPokemonInfo() {
        List<PokemonInfo> pokemonInfoList = pokemonInfoService.getAllPokemonInfo();
        return new ResponseEntity<>(pokemonInfoList, HttpStatus.OK);
    }

    @GetMapping("/byName/{name}")
    public ResponseEntity<PokemonInfo> getPokemonInfoByName(@PathVariable String name) {
        PokemonInfo pokemonInfo = pokemonInfoService.getPokemonInfoByName(name);
        return new ResponseEntity<>(pokemonInfo, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<PokemonInfo> createPokemonInfo(@RequestBody PokemonInfo pokemonInfo) {
        PokemonInfo createdPokemonInfo = pokemonInfoService.createPokemonInfo(pokemonInfo);
        return new ResponseEntity<>(createdPokemonInfo, HttpStatus.CREATED);
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<PokemonInfo> updatePokemonInfo(@PathVariable String name, @RequestBody PokemonInfo pokemonInfo) {
        PokemonInfo updatedPokemonInfo = pokemonInfoService.updatePokemonInfo(name, pokemonInfo);
        return new ResponseEntity<>(updatedPokemonInfo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<?> deletePokemonInfo(@PathVariable String name) {
        pokemonInfoService.deletePokemonInfo(name);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

