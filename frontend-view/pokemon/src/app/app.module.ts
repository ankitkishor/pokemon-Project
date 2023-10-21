import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { NgxPaginationModule } from 'ngx-pagination';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardListComponent } from './component/dashboard-list/dashboard-list.component';
import { CardInfoComponent } from './component/card-info/card-info.component';
import { CardComponent } from './component/card/card.component';
import { ReactiveFormsModule } from '@angular/forms';
import { NavbarComponent } from './component/navbar/navbar.component';
import { RegisterPokemonComponent } from './component/register-pokemon/register-pokemon.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardListComponent,
    CardInfoComponent,
    CardComponent,
    NavbarComponent,
    RegisterPokemonComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgxPaginationModule,
    ReactiveFormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
