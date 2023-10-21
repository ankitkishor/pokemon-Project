/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "collection")
public class Collection {



    private List<PokemonList> results;

    public Collection() {
    }

    public Collection(List<PokemonList> results) {
        this.results = results;
    }



    public List<PokemonList> getResults() {
        return results;
    }

    public void setResults(List<PokemonList> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "results=" + results +
                '}';
    }
}
