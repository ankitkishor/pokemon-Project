import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserserviceService } from 'src/app/services/userservice.service';

@Component({
  selector: 'app-register-pokemon',
  templateUrl: './register-pokemon.component.html',
  styleUrls: ['./register-pokemon.component.css']
})
export class RegisterPokemonComponent {
  pokemonForm: FormGroup;

  constructor(private fb: FormBuilder,private userService:UserserviceService) {
    this.pokemonForm = this.fb.group({
      name: ['', Validators.required],
      types: ['', Validators.required],
      height: ['', Validators.required],
      weight: ['', Validators.required],
      hp: ['', Validators.required],
      atk: ['', Validators.required],
      def: ['', Validators.required],
      spd: ['', Validators.required],
      exp: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.pokemonForm.valid) {
      const formData = this.pokemonForm.value;
      console.log(formData);
      this.userService.addPokemon(formData);
    }
  }
}
