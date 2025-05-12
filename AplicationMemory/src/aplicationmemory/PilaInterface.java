/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aplicationmemory;

import java.util.*;
/**
 *
 * @author alexa
 */
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

