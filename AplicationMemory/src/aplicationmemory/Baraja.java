//paquete de la aplicación
package aplicationmemory;

//se importa el paquete java.util
import java.util.*;

/**
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public class Baraja{
    
    //Datos:
    private Random rand = new Random(); //generar números aleatorios
    private Pila<Carta> cartas; //declaración de una pila
    
    //*Métodos:
    
    //Método constructor
    //inicializa las cartas con una capacidad máxima
    public Baraja(int maxElem){
        cartas = new Pila<>(maxElem);
    }
    
    //Método constructor
    //inicializa el mazo con pareja de cartas
    public void inicializarBarajas(String[] simbolos, int totalParejas) throws IllegalArgumentException{
        
        // Validación básica
        //verifica que se puedan crear las parejas
        if (totalParejas > simbolos.length) {
            throw new IllegalArgumentException("No hay suficientes símbolos para las parejas requeridas");
        }

        // Array para controlar símbolos usados
        boolean[] simbolosUsados = new boolean[simbolos.length];
        
        int parejasGeneradas = 0; //contador de parejas
        cartas = new Pila<>(totalParejas * 2); // 2 cartas por pareja

        //buble hasta crear parejas requeridas
        while (parejasGeneradas < totalParejas) {
            //posición aleatoria
            int posRandom = rand.nextInt(simbolos.length);
            //verifica si el simbolo no ha sido usado aún
            if (!simbolosUsados[posRandom]) {
                //Obtiene el simbolo en la posición aleatoria
                String simbolo = simbolos[posRandom];
                //Crear pareja de cartas
                cartas.push(new Carta(simbolo, simbolo + "1"));
                cartas.push(new Carta(simbolo, simbolo + "2"));
                //marca el simbolo como usado
                simbolosUsados[posRandom] = true;
                //incrementa número de parejas
                parejasGeneradas++;
            }
        }
    }
    
    //saca y devuelve la carta en la cima de la pila
    public Carta pop(){
        return cartas.pop();
    }
    //mezcla las cartas en la pila
    public void shuffle (){
        cartas.shuffle();
    }
}

