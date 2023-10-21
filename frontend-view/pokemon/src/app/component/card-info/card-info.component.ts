import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PokemonserviceService } from 'src/app/services/pokemonservice.service';

@Component({
  selector: 'app-card-info',
  templateUrl: './card-info.component.html',
  styleUrls: ['./card-info.component.css']
})
export class CardInfoComponent implements OnInit {
  @Input() pokemon: any = {}
  constructor(private pokemonService:PokemonserviceService,private route: ActivatedRoute){}
  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const name = params.get('name');
      if (name) {
        this.pokemonService.getMorePokemon(name).subscribe(data => {
          this.pokemon = data;
        });
      }
    });


  }
getType(pokemon: any): string {
    return this.pokemonService.getType(pokemon);
  }


}
