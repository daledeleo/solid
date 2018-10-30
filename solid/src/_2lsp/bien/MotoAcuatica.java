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
public class MotoAcuatica  implements _2lsp.mal.VehiculoAcuatico{
    private boolean encendido;

    public MotoAcuatica() {
        this.encendido = false;
    }
    
    @Override
    public void navegar() {
        if(!estaEncendido())
            encender();
        else
            System.out.println("Navegando");
    }
    
    public boolean estaEncendido(){
        return encendido;
        
    }
    
    public void encender(){
        this.encendido = true;
    }
    
}
