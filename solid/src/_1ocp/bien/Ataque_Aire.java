/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author dannyleo
 */
public class Ataque_Aire extends Ataque{

    public Ataque_Aire(Pokemon pokemon) {
        super(pokemon);
    }

    @Override
    public void ManejadorAtaque() {
        super.pokemon.setPorcentajeVida(super.pokemon.getPorcentajeVida()*0.80);
    }
    
}
