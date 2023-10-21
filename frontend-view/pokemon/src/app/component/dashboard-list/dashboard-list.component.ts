import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { PokemonserviceService } from 'src/app/services/pokemonservice.service';

@Component({
  selector: 'app-dashboard-list',
  templateUrl: './dashboard-list.component.html',
  styleUrls: ['./dashboard-list.component.css']
})
export class DashboardListComponent implements OnInit {
  totalPokemons:number =0;
  
  pokemons:any[]=[];
  page:number=1;
  constructor(private pokemonService:PokemonserviceService,private route:Router,private activate:ActivatedRoute){}
  ngOnInit(): void {

    
    this.getPokemons();
        
      
    
  }

  getType(pokemon: any): string {
    return this.pokemonService.getType(pokemon);
  }
  getPokemons(){
    this.pokemons = [];
    console.log(this.pokemons)
    this.pokemonService.getPokenmon(10, this.page + 0).subscribe(
      (res:any)=>{
        console.log(res.count);
        this.totalPokemons=res.count;
        res.results.forEach((result:any)=>{
          this.pokemonService.getMorePokemon(result.name).subscribe((data:any)=>{
            this.pokemons.push(data);
            console.log(this.pokemons);
          });
        });
      });
  }
  pageChange(newPage: number) {
    this.page = newPage;
    this.getPokemons();
  }
  
}
