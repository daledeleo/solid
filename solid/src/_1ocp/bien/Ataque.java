/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;
/**
 *
 * @author Palacios
 */
public abstract class Ataque implements Manejador_Ataque{
    Pokemon pokemon;

    public Ataque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}



