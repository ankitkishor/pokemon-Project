/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.services;

import com.pokemon.entity.PokemonInfo;
import com.pokemon.repo.PokemonInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonInfoServiceImpl implements PokemonInfoService {


     private final PokemonInfoRepository pokemonInfoRepository;
    @Autowired
    public PokemonInfoServiceImpl(PokemonInfoRepository pokemonInfoRepository) {
        this.pokemonInfoRepository = pokemonInfoRepository;
    }


    @Override
    public List<PokemonInfo> getAllPokemonInfo() {
        return (List<PokemonInfo>) pokemonInfoRepository.findAll();
    }

    @Override
    public PokemonInfo getPokemonInfoByName(String name) {
        return pokemonInfoRepository.findById(name) .orElseThrow(() -> new IllegalCallerException("Pokemon with name " + name + " not found."));
    }

    @Override
    public PokemonInfo createPokemonInfo(PokemonInfo pokemonInfo) {
        return pokemonInfoRepository.save(pokemonInfo);
    }

    @Override
    public PokemonInfo updatePokemonInfo(String name, PokemonInfo pokemonInfo) {
        PokemonInfo result=getPokemonInfoByName(name);
        result.setName(pokemonInfo.getName());
        result.setHeight(pokemonInfo.getHeight());
        result.setWeight(pokemonInfo.getWeight());
        result.setAtk(pokemonInfo.getAtk());
        result.setDef(pokemonInfo.getDef());
        result.setHp(pokemonInfo.getHp());
        result.setSpd(pokemonInfo.getSpd());
        result.setTypes(pokemonInfo.getTypes());
        return pokemonInfoRepository.save(result);
    }

    @Override
    public void deletePokemonInfo(String name) {
        pokemonInfoRepository.deleteById(name);
    }
}
