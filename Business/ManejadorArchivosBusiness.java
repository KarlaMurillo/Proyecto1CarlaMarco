/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Data.ManejadorArchivoData;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Karla Murillo
 */
public class ManejadorArchivosBusiness {
    private ManejadorArchivoData archivoData;
     
    public ManejadorArchivosBusiness(){
        this.archivoData = new ManejadorArchivoData();
    }//fin constructor
    
    /* Leer archivo */
    public void leerArchivoBusiness()throws FileNotFoundException, IOException{
         this.archivoData.leerArchivo();
    }//fin leerArchiBusiness

}
