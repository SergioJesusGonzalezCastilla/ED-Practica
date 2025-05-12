//paquete de la aplicación
package aplicationmemory;

/**
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public class Jugador{
    
    //Datos:
    private final String nombre; //nombre
    private final Lista<Carta> cartasGanadas; //cartas que ha ganado
    
    //*Métodos:
    
    //Método constructor
    public Jugador(String nombre){
        this.nombre = nombre;
        cartasGanadas = new Lista<Carta>();
    }
    
    //*Métodos getters:
    public String getNombre(){
        return nombre;
    }
    
    public Lista<Carta> getCartasGanadas(){
        return cartasGanadas;
    }
    
    //Añade una carta a la lista de cartas   
    public void anadirCartas (Carta carta){
        cartasGanadas.add(carta);
    }
    
    //devuelve número de cartas ganadas
    public int size(){
        return cartasGanadas.size();
    }
    
}

