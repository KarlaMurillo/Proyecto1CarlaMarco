package proyectoalgoritmos;

import Lista.ListaDoblementeEnlazada;

/**
 *
 * @author Marco
 */

public class ProyectoAlgoritmos {

    public static void main(String[] args) {
   
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        
        lde.insertarAlInicio("a");
        lde.inserAlFinal("b");
        lde.inserAlFinal("c");
        
        lde.eliminarElemento("c");
       lde.imprimirLista();
       
    }
       
}
