/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.ManejadorArchivosBusiness;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author karla
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
     //atributos
    private JDesktopPane desktopPane;
    private JMenu jMenu;
    private JMenuBar jMenuBar;
    private JMenuItem jMICargarLista, jMIBusquedaPeli, jMIListadoGeneral, jMIinsertarpeli;
    private JMenuItem jMICargarArchivo;
    private ManejadorArchivosBusiness instArchivoBusiness;
            
    public VentanaPrincipal(){    
        super("Proyecto Algoritmos");//llama a JFrame
        this.instArchivoBusiness = new ManejadorArchivosBusiness();
        init();
        
    }//fin constructor por defecto
    
     private void init(){
        this.jMenuBar = new JMenuBar();
        this.add(this.jMenuBar);
        
         this.jMenu= new JMenu("Menu");
        jMenuBar.add(this.jMenu);
        
        this.jMICargarArchivo = new JMenuItem("Abrir Archivo");
        this.jMICargarArchivo.addActionListener(this);
        this.jMenu.add(jMICargarArchivo);
        
        this.jMICargarLista = new JMenuItem("Cargar Lista");
        this.jMICargarLista.addActionListener(this);
        this.jMenu.add(jMICargarLista);
        
        this.jMIBusquedaPeli = new JMenuItem("Busqueda de peliculas");
        this.jMIBusquedaPeli.addActionListener(this);
        this.jMenu.add(jMIBusquedaPeli);
        
        this.jMIListadoGeneral = new JMenuItem("Listado general");
        this.jMIListadoGeneral.addActionListener(this);
        this.jMenu.add(jMIListadoGeneral);
        
        this.jMIinsertarpeli = new JMenuItem("Insertar pelicula");
        this.jMIinsertarpeli.addActionListener(this);
        this.jMenu.add(jMIinsertarpeli);
        
        
        this.setJMenuBar(jMenuBar);
        
        this.setSize(800, 600);//tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);//se centre en la pantalla
 
    }//fin 
     private String abrirArchivo(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            return chooser.getSelectedFile().getPath();
        }
        
        return "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.jMICargarArchivo){
            String path = this.abrirArchivo();
            if(! path.equals("")){
                        
               // String resultado = this.instArchivoBusiness.leerArchivoBusiness();
            }
        }else if(e.getSource()==this.jMICargarLista){

        } else if(e.getSource()==this.jMIBusquedaPeli){
           VentanaBusquePeli vBP= new VentanaBusquePeli();
            this.add(vBP);
            vBP.setVisible(true);
        } else if(e.getSource()==this.jMIListadoGeneral){

        } else if(e.getSource()==this.jMIinsertarpeli){
            VentanaInsertarPeli vIP=new VentanaInsertarPeli();
            this.add(vIP);
            vIP.setVisible(true);
        }
    }  //actionPerformed
}//class
