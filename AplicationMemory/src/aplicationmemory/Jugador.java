
package aplicationmemory;

import java.util.*;

/**
 *
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

public class Jugador<E>{
    private String nombre;
    private Lista<Carta> cartasGanadas;
    
    public Jugador(String nombre){
        this.nombre = nombre;
        cartasGanadas = new Lista<Carta>();
    }
    
    public String getNombre(){
        return nombre;
    }
    public Lista<Carta> getCartasGanadas(){
        return cartasGanadas;
    }
    
    public void anadirCartas (Carta carta){
        cartasGanadas.add(carta);
    }
    
    public int size(){
        return cartasGanadas.size();
    }
    
}
