import { Component, OnInit } from '@angular/core';
import { UserserviceService } from 'src/app/services/userservice.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor(private userService:UserserviceService){}
  pokemons:any[]=[];
  ngOnInit(): void {
    this.showAllPokemon()
  }
  showAllPokemon(){
    
    this.userService.getAllPokemon().subscribe(
      (pokemonList:any) => {
        console.log('Pokémon retrieved successfully:', pokemonList);
        console.log("here")
        this.pokemons=pokemonList;
        console.log(this.pokemons);
      },
      (error:any) => {
        console.error('Error retrieving Pokémon:', error);
      }
    );

  }
  

}
