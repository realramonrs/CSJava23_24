package appGrafica;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
	
	JButton btnPulsar;
	JTextField txtNombre;
	JLabel lblNombre;
	
	//Constructor
	
	public MiVentana(String titulo) {
		
		setTitle(titulo);
		setSize(300,450);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		inicializaControles();
		
		
		
		setVisible(true);
	}
	
     public MiVentana(String titulo,int ancho,int alto,boolean layout) {
		setTitle(titulo);
		setSize(ancho,alto);
		
        inicializaControles();
        
        //Añadirlos a la ventana: Layout
        //Por defecto BorderLayout
        if(layout) {
        setLayout(new FlowLayout());
        add(lblNombre);
        add(txtNombre);
        add(btnPulsar);
        }
        else {
        	setLayout(null);
        	lblNombre.setBounds(10, 10, 150, 25);
        	txtNombre.setBounds(170, 10, 200, 25);
        	btnPulsar.setBounds(380,10,100,40);
        	add(lblNombre);
            add(txtNombre);
            add(btnPulsar);
            
            
        }
       
        	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
     
     private void inicializaControles() {
    	 
    	 btnPulsar = new JButton("Pulsame");
    	 txtNombre = new JTextField(10);
    	 lblNombre = new JLabel("Introduzca el nombre");
    	 
    	 
     }

}
