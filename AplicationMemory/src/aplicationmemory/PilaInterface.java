//paquete de la aplicación
package aplicationmemory;

//se importa el paquete java.util
import java.util.*;

/**
 * ---------------------------------------------------------------------------- 
 * INTERFAZ Pila QUE ESPECIFICA LAS OPERACIONES DE LAS PILAS.
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public interface PilaInterface<E> {
    // Devuelve el número de elementos de la pila. 
    public int size(); 
     
    // Devuelve si la pila está vacía 
    // @return true si la pila está vacía, false en caso contrario. 
    public boolean isEmpty(); 
    
    // Inserta un elemento en la parte superior de la pila  
    // @param elem, el elemento que va a ser insertado. 
    public void push (E elem); 
     
    // Borra el elemento situado en la cima de la pila. 
    // @return: devuelve el elemento borrado 
    // @throws EmptyStackException si la pila está vacía. 
    public E pop() throws EmptyStackException; 
    
    //Hace que los numeros se ordenen aleatoriamente
    public void shuffle();
}

