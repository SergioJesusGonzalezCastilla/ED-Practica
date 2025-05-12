//paquete de la aplicación
package aplicationmemory;

//se importa el paquete java.util
import java.util.*;

/**
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public class Pila<E> implements PilaInterface<E> { 
     
    //datos: 
    private int maxElem; // numero de elementos que caben en el array. 
    private E pila[]; 
    private int posCima = -1; // índice del elemento de la cima 
    private Random numAleatorio = new Random();
     
    //*Métodos:
 
    //Método constructor
        public Pila(int maxElem){ 
            this.maxElem = maxElem;
            pila =  (E[]) new Object[maxElem];
    }
      
    //devuelve número actual de elementos de la pila
    @Override 
    public int size() { 
        return (posCima + 1); 
    }

    //añade un elemento a la cima de la pila
    @Override 
    public void push(E elem) { 
    E a[]; 
     
        if (posCima == maxElem-1) {   //la pila está llena. Se escala al doble 
             a = (E[]) new Object[2*maxElem]; 
             for (int i = 0; i <= posCima; i++) 
                a[i] = (E) pila[i]; 
             pila = a; 
             maxElem = maxElem*2; 
        } 
        posCima++; 
        pila[posCima]= elem; 
    } 
    
    //Elimina y devuelve el elemento de la cima
    @Override 
    public E pop() throws EmptyStackException { 
        E cima; 
         
        if (isEmpty()) 
            throw new EmptyStackException(); 
        cima = pila[posCima]; 
        posCima--; 
        return cima; 
    }
    
    //Indica si esta vacia la pila
    @Override 
    public boolean isEmpty() { 
        return (posCima < 0); 
    } 
    
    //Mezcla elementos de la pila usando un algoritmo
    @Override
    public void shuffle() {
        if (posCima <= 0) return; // No hay nada que barajar
        
        // Algoritmo Fisher-Yates (Knuth Shuffle)
        for (int i = posCima; i > 0; i--) {
            int j = numAleatorio.nextInt(i + 1); // Índice aleatorio entre 0 e i
            
            // Intercambiar elementos
            E temp = pila[i];
            pila[i] = pila[j];
            pila[j] = temp;
            
        }
    }
}

