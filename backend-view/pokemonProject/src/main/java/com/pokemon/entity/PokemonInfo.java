/*
 * Author : Ankit Kishor
 * Date: 20-10-2023
 * Created with :Intellij IDEA Community Edition
 */


package com.pokemon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pokemonInfo")
public class PokemonInfo {



    @Id

    private String name;

    private String types;

    private Integer height;

    private Integer weight;

    private Integer hp;

    private Integer atk;

    private Integer def;

    private Integer spd;

    private Integer exp;

    public PokemonInfo() {
    }


    public PokemonInfo(String name, String types, Integer height, Integer weight, Integer hp, Integer atk, Integer def, Integer spd, Integer exp) {
        this.name = name;
        this.types = types;
        this.height = height;
        this.weight = weight;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Integer getSpd() {
        return spd;
    }

    public void setSpd(Integer spd) {
        this.spd = spd;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "PokemonInfo{" +
                "name='" + name + '\'' +
                ", types='" + types + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", spd=" + spd +
                ", exp=" + exp +
                '}';
    }
}
