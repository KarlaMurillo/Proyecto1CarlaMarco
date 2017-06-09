/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Karla Murillo
 */
public class VentanaBusquePeli extends JInternalFrame implements ActionListener {
    
     private JLabel lblNombre;
    private JTextField jtfNombre;
    private JButton btnAgregar;

    public VentanaBusquePeli() {
        super("Busqueda de película");
        this.pack();
        this.setLayout(new FlowLayout());
        this.setClosable(true);
        this.setVisible(true);
        init();
        
    }
    
    public void init(){
    
    this.lblNombre=new JLabel("Digite el nombre de la pelicula: ");
    this.add(lblNombre);
    this.jtfNombre=new JTextField(35);
    this.add(jtfNombre);
    
    this.btnAgregar=new JButton("Buscar");
    this.btnAgregar.addActionListener(this);
    this.add(btnAgregar);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
