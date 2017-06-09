package Data;

import Domain.Pelicula;
import com.csvreader.CsvReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Karla Murillo
 */
public class ManejadorArchivoData {
     private String path;

    public ManejadorArchivoData() {
        this.path="datos.csv";
    }
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivoCSV= new File(this.path);
        ArrayList<Pelicula> pelicula=new ArrayList<Pelicula>();
        if(archivoCSV.exists()){
        CsvReader peliculasImpor=new CsvReader(this.path);
        peliculasImpor.readHeaders();

        while(
            peliculasImpor.readRecord()){
            String code=peliculasImpor.get(0);
            String title=peliculasImpor.get(1);
            String gender=peliculasImpor.get(2);
            String total=peliculasImpor.get(3);
            String subtitled=peliculasImpor.get(4);
            String premier=peliculasImpor.get(5);

            pelicula.add(new Pelicula(code,title,gender,total,subtitled,premier));
        }

        peliculasImpor.close();

        for(Pelicula peli : pelicula){
           System.out.println(peli.getCode()+", "+peli.getTitle()+", \t"+peli.getGender()+", "+peli.getTotal()+", "+peli.getSubtitled()+", "+peli.getPremier());
        }
        }
    }//metodo leer
}//class
