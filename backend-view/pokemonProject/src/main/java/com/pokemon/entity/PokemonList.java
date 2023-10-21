/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pokemonList")
public class PokemonList {

    @Id

    private String name;


    private String url;

    public PokemonList() {
    }

    public PokemonList(Long id, String name, String url) {
        this.name = name;
        this.url = url;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PokemonList{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
