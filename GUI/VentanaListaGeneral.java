/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.ListaGenero;
import Lista.Nodo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karla Murillo
 */
public class VentanaListaGeneral extends JFrame {

    private JTable jTable;
    private DefaultTableModel dtmModeloPrueba;

    public VentanaListaGeneral() {
        super();
        this.setVisible(true);
        this.setSize(800, 653);
    }

//    public void generarTabla(ListaGenero[] listaListas, int tam) {
//        int tamañoLista = tam;
//        Nodo nodo;
//        String[][] peliculas = new String[tamañoLista][6];
//        int cont = 0, contalista;
//        
//        for (int j = 0; j < listaListas.length; j++) {
//            contalista = 0;
//            nodo = listaListas[j].getHead();
//            for (int i = cont; i < tamañoLista; i++) {
//
//                peliculas[i][0] = nodo.getPelicula().getName();
//                peliculas[i][1] = nodo.getPelicula().getCode();
//                peliculas[i][2] = nodo.getPelicula().getTotal();
//                peliculas[i][3] = nodo.getPelicula().getSubtitled();
//                peliculas[i][4] = nodo.getPelicula().getPremier();
//                peliculas[i][5] = nodo.getPelicula().getGenred().getGenred();
//                cont++;
//                contalista++;
//                if (nodo.getNext() != listaListas[j].getHead()) {
//                    nodo = nodo.getNext();
//                    System.out.println(nodo.getPelicula().toString());
//                } else {
//                    break;
//                }
//            }
//        }// for j 
//        String[] nombreColumnas = {"Nombre \t", "Codigo", "cantidad", "subtitulos", "premier", "genero"};
//        this.dtmModeloPrueba = new DefaultTableModel(peliculas, nombreColumnas);
//        this.jTable = new JTable(this.dtmModeloPrueba);
//
//        JScrollPane scrollPane = new JScrollPane(this.jTable);
//        this.getContentPane().add(scrollPane);
//
//    }//generar tabla
}
