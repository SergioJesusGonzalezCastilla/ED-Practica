package aplicationmemory;

/**
 * ---------------------------------------------------------------------------- 
 * INTERFAZ Lista QUE ESPECIFICA LAS OPERACIONES DE LAS LISTAS DE ENTEROS.
 * @author Ana Belén Moreno
 */
public interface ListaInterface<E> {

/*-----------------------------------------------------------------------------
Especificación del TAD "listas de enteros": 
- El rango de los datos del TAD está formado por todas las secuencias de 0 o más
  elementos de tipo int en las que los elementos ocupan una posición siendo esta
  un entero (que es 0 para el primer elemento, 1 para el segundo, etc., hasta 
  longitud-1 que es la posición del último elemento de la secuencia o lista). 
- El comportamiento de las listas es tal que puede haber inserciones y 
  eliminaciones de elementos en cualquier posición de la lista.
------------------------------------------------------------------------------*/


    /**
     * Añadir un elemento elem al final de la lista.
     * @param elem, es el elemento a añadir.
     * @return true si ha habido inserción.
     */
    public boolean add(E elem);

    /**
     * Calcular el número de elementos de la lista.
     * @return la longitud de la lista.
     */
    public int size();

    /**
     * Eliminar o borrar todos los elementos de la lista.
     */
    public void clear();




 }