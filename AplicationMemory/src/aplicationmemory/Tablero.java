//paquete de la aplicación
package aplicationmemory;

/**
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public class Tablero {
    //Datos:
    private int numColumnas;
    private int numFilas; //dimensiones del tablero
    private Carta[][] tablero; //matriz que contiene las cartas
    
    //*Métodos:
    
    //Método constructor
    //crea el tablero (esta vacío)
    public Tablero(int numFilas, int numColumnas){
        this.numColumnas = numColumnas;
        this.numFilas = numFilas;
        this.tablero = new Carta[numFilas][numColumnas];
    }
    
    //Llena el tablero con cartas de la baraja
    public void inicializarTablero (Baraja baraja){
        for(int i = 0; i<numFilas; i++){
            for (int j=0; j<numColumnas; j++){
                tablero[i][j] = baraja.pop();
            }
        }
    }
    
    //Devuelve la carta en la posición especificada
    public Carta getCarta(int fila, int columna) throws IllegalArgumentException {
        if (fila >= 0 && fila < numFilas && columna >= 0 && columna < numColumnas) {
            return tablero[fila][columna];
        }
        throw new IllegalArgumentException("Posición fuera de los límites del tablero");
    }
    
    //1. Obtiene la carta seleccionada
    //2. La marca como descubierta
    //3. La añade al array de cartas seleccionadas
    //4. Si es la segunda carta seleccionada:
    //- Compara si forman pareja
    //- Si coinciden, las asigna al jugador
    //- Si no, las vuelve a ocultar
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
   
    //muestra el tablero, las ocultasse representan con "?"
    public void mostrarTablero (){
        for(int i = 0; i < numFilas; i++){
            for(int j = 0; j < numColumnas; j++){
                Carta carta = tablero[i][j];
                System.out.print(carta.isDescubierta() ? "[ " + carta.getNombre() + " ]" : "[ ? ]");
            }
            System.out.println();
        }
    }
    
    //verifica si el juego ha terminado
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
