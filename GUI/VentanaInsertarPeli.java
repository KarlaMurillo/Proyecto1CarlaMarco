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
public class VentanaInsertarPeli extends JInternalFrame implements ActionListener{
    
    private JButton jbtnAceptar;
    private JLabel jlbCode,jlbTitle;
    private JLabel jlbGender,jlbTotal;
    private JLabel jlbSubtitled,jlbPremier;
    private JTextField jtfCode,jtfTitle;
    private JTextField jtfGender,jtfTotal;
    private JTextField jtfSubtitled,jtfPremier;
 
    public VentanaInsertarPeli(){
        
      super("Insertar Pelicula");
        this.setSize(400, 100);
        this.setResizable(false);
        this.setClosable(true);
        this.setLayout(new FlowLayout());
        this.dispose();
        init();
        
    }//fin contructor por defecto
    
    private void init(){
        //JLABEL y JTEXTFIELD
        this.jlbTitle = new JLabel("Code: ");
        this.jtfTitle = new JTextField(10);
        this.add(this.jlbTitle);
        this.add(this.jtfTitle);
        
        this.jlbCode = new JLabel("Title: ");
        this.jtfCode = new JTextField(20);
        this.add(this.jlbCode);
        this.add(this.jtfCode);
        
        this.jlbGender = new JLabel("Gender: ");
        this.jtfGender = new JTextField(10);
        this.add(this.jlbGender);
        this.add(this.jtfGender);
        
        this.jlbTotal = new JLabel("Total: ");
        this.jtfTotal = new JTextField(10);
        this.add(this.jlbTotal);
        this.add(this.jtfTotal);
        
        this.jlbSubtitled = new JLabel("Subtitled: ");
        this.jtfSubtitled = new JTextField(10);
        this.add(this.jlbSubtitled);
        this.add(this.jtfSubtitled);
        
        this.jlbPremier = new JLabel("Premier: ");
        this.jtfPremier = new JTextField(10);
        this.add(this.jlbPremier);
        this.add(this.jtfPremier);


        //JBUTTON
        this.jbtnAceptar = new JButton("Registar Articulo");
        this.jbtnAceptar.addActionListener(this);
        this.add(this.jbtnAceptar);
        
    }//fin init

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//fin class
