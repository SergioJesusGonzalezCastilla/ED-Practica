
package aplicationmemory;

import java.util.*;

/**
 *
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

public class Tablero {
    private int numColumnas;
    private int numFilas;
    private Carta[][] tablero;
    
    public Tablero(int numFilas, int numColumnas){
        this.numColumnas = numColumnas;
        this.numFilas = numFilas;
        this.tablero = new Carta[numFilas][numColumnas];
    }
    
    public void inicializarTablero (Baraja baraja){
        for(int i = 0; i<numFilas; i++){
            for (int j=0; j<numColumnas; j++){
                tablero[i][j] = baraja.pop();
            }
        }
    }
    
    
    public Carta getCarta(int fila, int columna) throws IllegalArgumentException {
        if (fila >= 0 && fila < numFilas && columna >= 0 && columna < numColumnas) {
            return tablero[fila][columna];
        }
        throw new IllegalArgumentException("Posición fuera de los límites del tablero");
    }
    
    public void seleccionarCarta(int fila, int columna, Carta[] cartasSeleccionadas,int numCartas, Jugador[] jugadores, int jugadorActual ){
        Carta carta = tablero[fila][columna];
        carta.setDescubierta(true);
        cartasSeleccionadas[numCartas] = carta;
        mostrarTablero();
        if (numCartas == 1){
            Carta carta1 = cartasSeleccionadas[0];
            Carta carta2 = cartasSeleccionadas[1];


            if (carta1.getNombre().equals(carta2.getNombre())){
                System.out.println("¡Enhorabuena, has acertado!");
                jugadores[jugadorActual].anadirCartas(carta1);
            }else{
                carta1.setDescubierta(false); // Voltea las cartas
                carta2.setDescubierta(false);
                
            }
            cartasSeleccionadas = new Carta[2];
        }
    }   
   
    
    public void mostrarTablero (){
        for(int i = 0; i < numFilas; i++){
            for(int j = 0; j < numColumnas; j++){
                Carta carta = tablero[i][j];
                System.out.print(carta.isDescubierta() ? "[ " + carta.getNombre() + " ]" : "[ ? ]");
            }
            System.out.println();
        }
    }
    
    
    public boolean todoDescubierto() {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (!tablero[i][j].isDescubierta()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    

}
