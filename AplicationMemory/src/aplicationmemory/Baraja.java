
package aplicationmemory;

import java.util.*;
import java.util.EmptyStackException; 

/**
 *
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */


public class Baraja{
    private Random rand = new Random();
    private Pila<Carta> cartas;
    
    public Baraja(int maxElem){
        cartas = new Pila<>(maxElem);
    }
    
public void inicializarBarajas(String[] simbolos, int totalParejas) throws IllegalArgumentException{
        // Validación básica
        if (totalParejas > simbolos.length) {
            throw new IllegalArgumentException("No hay suficientes símbolos para las parejas requeridas");
        }

        // Array para controlar símbolos usados
        boolean[] simbolosUsados = new boolean[simbolos.length];
        int parejasGeneradas = 0;
        cartas = new Pila<>(totalParejas * 2); // 2 cartas por pareja

        while (parejasGeneradas < totalParejas) {
            int posRandom = rand.nextInt(simbolos.length);
            
            if (!simbolosUsados[posRandom]) {
                String simbolo = simbolos[posRandom];
                // Crear pareja
                cartas.push(new Carta(simbolo, simbolo + "1"));
                cartas.push(new Carta(simbolo, simbolo + "2"));
                
                simbolosUsados[posRandom] = true;
                parejasGeneradas++;
            }
        }
    }
    public Carta pop(){
        return cartas.pop();
    }
    
    public void shuffle (){
        cartas.shuffle();
    }
}
