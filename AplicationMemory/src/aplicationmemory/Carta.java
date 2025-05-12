

package aplicationmemory;

import java.util.*;
/**
 *
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

public class Carta {
    String nombre;
    String pareja;
    boolean descubierta;
    
    public Carta(String nombre, String pareja){
        this.pareja = pareja;
        this.nombre = nombre;
        this.descubierta = false;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getPareja(){
        return pareja;
    }
    public Boolean isDescubierta(){
        return descubierta;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPareja(String pareja){
        this.pareja = pareja;
    }
    public void setDescubierta(Boolean descubierta){
        this.descubierta = descubierta;
    }
    
    
    @Override
    public String toString(){
        return this.nombre;
    }
    /*@Override
    public boolean equals (Object carta){
        if(this == carta){
            return true;
        }
        return false;
    }*/
}
