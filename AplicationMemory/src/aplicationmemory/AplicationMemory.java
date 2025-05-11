
package aplicationmemory;
import java.util.*;
/**
 *
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */
public class AplicationMemory {
    private static final String[] SIMBOLOS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static Jugador jugador1 = new Jugador("Jugador 1");
    private static Jugador jugador2 = new Jugador("Jugador 2");
    private static Jugador[] jugadores = {jugador1, jugador2};
    private static Carta[] cartasTurno = new Carta[2];

    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        // Dentro del main, localizamos todas las llamadas necesarias
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduzca el numero de filas (entre 3 y 5):");
        int filas = escaner.nextInt();
        System.out.print("Introduzca el numero par de columnas (entre 4 y 8):");
        int columnas = escaner.nextInt();
        
        int cartasTotales = (filas * columnas)/2;
    
        Baraja baraja = new Baraja(cartasTotales);
        baraja.inicializarBarajas(SIMBOLOS, cartasTotales);
        baraja.shuffle();
        
        Tablero partida = new Tablero(filas, columnas);
        partida.inicializarTablero(baraja);
        
        int jugadorActual = 0;
        int cartasSeleccionadas = 0;
        boolean finJuego = false;
        
        while(!partida.todoDescubierto() && !finJuego){  
            Jugador actual = jugadores[jugadorActual];
            System.out.println(actual.getNombre() + ", escoja una posicion:");
            System.out.print("Numero de fila (entre 0 y " + (filas-1) + "):" );
            int filaElegida = escaner.nextInt();
            escaner.nextLine(); // Consumir el \n pendiente

            System.out.print("Numero de columna (entre 0 y " + (columnas -1) + "):");
            int columnaElegida = escaner.nextInt();
            escaner.nextLine(); // Consumir el \n pendiente

            System.out.println("Mostrando tablero de juego:");
            partida.seleccionarCarta(filaElegida, columnaElegida, cartasTurno, cartasSeleccionadas, jugadores, jugadorActual);

            cartasSeleccionadas = cartasSeleccionadas + 1;
            if(cartasSeleccionadas == 2){
                if(!cartasTurno[0].getNombre().equals(cartasTurno[1].getNombre())){
                    System.out.println("¿Siguiente turno? (S/N):");
                    String fin = escaner.nextLine();
                    if(fin.equals("N")){
                        finJuego = true;
                    }else{
                        jugadorActual = (jugadorActual + 1) % 2;

                    }                
                }
            cartasSeleccionadas = 0;
            }
        }
        
        System.out.println("!Fin del juego!");
        System.out.println("El " + jugadores[0].getNombre() + " ha descubierto las cartas:");
        System.out.println(jugadores[0].getCartasGanadas().toString());
        System.out.println("El " + jugadores[1].getNombre() + " ha descubierto las cartas:");
        System.out.println(jugadores[1].getCartasGanadas().toString());
        if(jugadores[0].size()< jugadores[1].size()){
            System.out.println("!Ha ganado el jugador 2!");
        }else if(jugadores[1].size()< jugadores[0].size()){
            System.out.println("!Ha ganado el jugador 1!");
        }else{
            System.out.println("!Ha sido un empate!");
        }  
    }
}
    
