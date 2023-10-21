import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  constructor(private http:HttpClient) { }
  addPokemon(newPokemon: any) {
    const url = 'http://localhost:8085/api/v1/pokemonInfo/create'; 
   return this.http.post(url, newPokemon).subscribe(
      (response) => {
        console.log('Pokémon added successfully:', response);
      },
      (error) => {
        console.error('Error adding Pokémon:', error);
      }
    );
  }
  getAllPokemon(): Observable<any>{
    const url = `http://localhost:8085/api/v1/pokemonInfo/all`; 
    return this.http.get(url);
  }

  getPokemonByName(name: string) {
    const url = `http://localhost:8085/api/v1/pokemonInfo/byName/${name}`; 
   return this.http.get(url).subscribe(
      (pokemon) => {
        console.log('Pokémon retrieved successfully:', pokemon);
      },
      (error) => {
        console.error('Error retrieving Pokémon:', error);
      }
    );
  }
}
