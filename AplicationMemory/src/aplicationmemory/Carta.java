//paquete de la aplicación
package aplicationmemory;

/**
 * @author Sergio Jesus González
 * @author Alejandro Serrejón
 */

//Declaración de la clase
public class Carta {
    
    //Datos:    
    String nombre;
    String pareja;
    boolean descubierta;
    
    //*Métodos:
    
    //Método constructor
    public Carta(String nombre, String pareja){
        this.pareja = pareja;
        this.nombre = nombre;
        this.descubierta = false;
    }
    
    //*Métodos getters:
    public String getNombre(){
        return nombre;
    }
    
    public String getPareja(){
        return pareja;
    }
    
    public Boolean isDescubierta(){
        return descubierta;
    }

    //*Métodos setters:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPareja(String pareja){
        this.pareja = pareja;
    }
    
    public void setDescubierta(Boolean descubierta){
        this.descubierta = descubierta;
    }
    
   //Se sobreescribe el método toString()
    @Override
    public String toString(){
        return this.nombre;
    }
}

