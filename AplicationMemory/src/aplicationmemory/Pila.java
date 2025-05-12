/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicationmemory;

import java.util.*;
/**
 *
 * @author alexa
 */
public class Pila<E> implements PilaInterface<E> { 
     
    //datos: 
    private int maxElem; // numero de elementos que caben en el array. 
    private E pila[]; 
    private int posCima = -1; // índice del elemento de la cima 
    private Random numAleatorio = new Random();
     
    //métodos: 
 
    /**---------------------------------------- 
     * Constructor que crea una pila vacía. 
     */ 
        public Pila(int maxElem){ 
            this.maxElem = maxElem;
            pila =  (E[]) new Object[maxElem];
    }
        
    @Override 
    public int size() { 
        return (posCima + 1); 
    }

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
    
    @Override 
    public E pop() throws EmptyStackException { 
        E cima; 
         
        if (isEmpty()) 
            throw new EmptyStackException(); 
        cima = pila[posCima]; 
        posCima--; 
        return cima; 
    }
    
    @Override 
    public boolean isEmpty() { 
        return (posCima < 0); 
    } 
    
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
