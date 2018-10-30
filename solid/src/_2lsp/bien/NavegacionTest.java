/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2lsp.bien;

/**
 *
 * @author Administrador
 */
public class NavegacionTest {
    
    
    /*
     Si enviamos una moto acuatica y no está encendida, obtendremos una excepción.
    */
    public void navegacion(_2lsp.mal.VehiculoAcuatico... vehiculosAcuaticos) {
		for (_2lsp.mal.VehiculoAcuatico vehiculo : vehiculosAcuaticos) {
			vehiculo.navegar();
		}
	}
    
}