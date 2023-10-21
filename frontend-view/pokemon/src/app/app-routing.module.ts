import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardListComponent } from './component/dashboard-list/dashboard-list.component';
import { CardInfoComponent } from './component/card-info/card-info.component';
import { NavbarComponent } from './component/navbar/navbar.component';
import { CardComponent } from './component/card/card.component';
import { RegisterPokemonComponent } from './component/register-pokemon/register-pokemon.component';

const routes: Routes = [
  {
    path: '',
    component: DashboardListComponent 
  },
 
  {
    path: 'register',
    component: RegisterPokemonComponent 
  },
  {
    path: 'addedPokemon',
    component: CardComponent 
  },
  { 
    path: 'pokemon/:name', 
    component: CardInfoComponent 
  },
  { 
    path: '**', 
    component: DashboardListComponent 
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
