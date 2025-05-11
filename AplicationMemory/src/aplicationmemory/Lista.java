/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicationmemory;

/**
 *
 * @author alexa
 */
public class Lista<E> implements ListaInterface<E>{
    
    //Datos:
    private int maxElementos = 5; // contiene el número de celdas del array, es 
                                  // el máximo número de elementos que caben en
                                  // el array.
    private Object[] lista; // array para guardar lo elementos de la lista.
    private int longitud; // contiene el número de elementos actual de la lista
    
    public Lista() {
        lista = new Object[maxElementos]; // Se instancia el array.
        longitud = 0; // Se inicializa longitud.
        // Se inicializan los elem del array a 0:
    }
    
    @Override
    public int size() {
        return longitud;
    }
      
    @Override
    public boolean add(E elem) {
        
        boolean resultado = false;
        
        if (longitud == maxElementos) {  // Array lleno.
            //Se redimensiona el array, en este caso duplicando su tamaño.
            maxElementos = maxElementos * 2;
            Object[] v = new Object[maxElementos];
            for (int i = 0; i < longitud; i++) {
                v[i] = lista[i];
            }
            lista = v;
        }
        
        lista[longitud] = elem;
        longitud++;
        resultado = true;
        return resultado;
    } 
    
    @Override
    public String toString(){
        String cadena = "";
        
        for (int i = 0; i < longitud; i++){
            cadena = cadena + lista[i] + " ";
        }
        return cadena;
        }
    
    @Override
    public void clear(){
        longitud = 0;
    }
}
   
    
