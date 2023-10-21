import { Injectable } from '@angular/core';
import{ HttpClient }from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PokemonserviceService {

  constructor(private http:HttpClient) { }

  getPokenmon(limit: number, offset: number){
    return this.http.get(`https://pokeapi.co/api/v2/pokemon?limit=${limit}&offset=${offset}`);
  }
  getMorePokemon(name:string){
    return this.http.get(`https://pokeapi.co/api/v2/pokemon/${name}`);
  }
  getType(pokemon: any): string {
    return pokemon && pokemon.types.length > 0 ? pokemon.types[0].type.name : '';
  }
}
