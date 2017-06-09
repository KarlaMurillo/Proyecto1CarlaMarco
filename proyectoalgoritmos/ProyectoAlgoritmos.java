package proyectoalgoritmos;

<<<<<<< HEAD
import Data.ManejadorArchivoData;
import Domain.Pelicula;
import GUI.VentanaPrincipal;
import Lista.ListaDoblementeEnlazada;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author karla
=======
import Lista.ListaDoblementeEnlazada;

/**
 *
 * @author Marco
>>>>>>> 85f1eb3ce4eb094f421c0f4539c3ad00be448306
 */

public class ProyectoAlgoritmos {

<<<<<<< HEAD
    public static void main(String[] args) throws IOException {
=======
    public static void main(String[] args) {
>>>>>>> 85f1eb3ce4eb094f421c0f4539c3ad00be448306
   
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        
        lde.insertarAlInicio("a");
<<<<<<< HEAD
        lde.inserAlFinal("c");
        lde.inserAlFinal("e");
        
        lde.eliminarElemento("c");
        lde.imprimirLista();
        
        VentanaPrincipal v=new VentanaPrincipal();
       
//        File archivoCSV= new File("C:/Users/Karla Murillo/Documents/datos.csv");
//         
//        String lineas =new String();
//        
//        Scanner leer= new Scanner (archivoCSV);
//        leer.nextLine();
//        
//        while(leer.hasNext()){
//            lineas=leer.nextLine();
//            System.out.println(lineas);
//        }

//String csvFilename = "C:/Users/Karla Murillo/Documents/datos.csv";
//CsvReader csvReader = new CsvReader(new FileReader(csvFilename), ',');
//String[] nextLine;
//      while ((nextLine = csvReader.readNext()) != null) {
//         if (nextLine != null) {
//            //Verifying the read data here
//            System.out.println(Arrays.toString(nextLine));
//         }
////...
//csvReader.close();

ManejadorArchivoData m=new ManejadorArchivoData();
m.leerArchivo();
  }//main    
}//class
=======
        lde.inserAlFinal("b");
        lde.inserAlFinal("c");
        
        lde.eliminarElemento("c");
       lde.imprimirLista();
       
    }
       
}
>>>>>>> 85f1eb3ce4eb094f421c0f4539c3ad00be448306
