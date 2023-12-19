package grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiVentana extends JFrame implements ActionListener  {
	
	private JLabel lblTexto1;
	private JTextField txtNumero1,txtNumero2;
	private JButton btnUno,btnDos , btnBorrar,btnRaizCuadrada;
	
	public MiVentana(String titulo) {
		this.setSize(500, 850);
		this.setTitle(titulo);
		
		inicializarComponentes();
		
		//Quitamos el BorderLayout
		setLayout(null);
				
		//Establecer la posicion de los controles
		lblTexto1.setBounds(10, 20, 175, 30);
		txtNumero1.setBounds(180,20 , 100 , 30);
		txtNumero2.setBounds(285,20,100,30);
		btnUno.setBounds(10 ,90 ,50 ,25);
		btnDos.setBounds(75,90,50,25);
		btnBorrar.setBounds(10,130,75,30);
		btnRaizCuadrada.setBounds(90,130,75,30);
		
		//Asignar manejadores de eventos:
		btnUno.addActionListener(new EscuchadorBotonesNumericos());
		btnDos.addActionListener(new EscuchadorBotonesNumericos());
		btnBorrar.addActionListener(new EscuchadorBotonBorrar());
		txtNumero1.addMouseListener(new EscuchadorMouse());
		txtNumero2.addMouseListener(new EscuchadorMouse());
		this.addWindowListener(new WindowAdapter() {
			
		});
		
		//Asociar un manejador de evento click al botón raizCuadrada.
		//Como no tengo clase interna creada, utilizaremos una clase anónima
		//Esta clase implementará la interfaz ActionListener-->
		btnRaizCuadrada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String texto = txtNumero1.getText();
				if(texto.length()>0) {
				int numero = Integer.parseInt(texto);
				double raiz = Math.sqrt(numero);
				txtNumero2.setText(Double.toString(raiz));
				}
				else {
				//	JOptionPane.showMessageDialog(getParent(),"Debe introducir un valor");
				    JOptionPane.showMessageDialog(getContentPane(), "Debe intro numero", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		
		//Añadimos los controles al Panel
		add(lblTexto1);
		add(txtNumero1);
		add(btnUno);
		add(btnDos);
		add(btnBorrar);
		add(txtNumero2);
		getContentPane().add(btnRaizCuadrada);
		//Cerrar la aplicación cuando el usuario pulsa el botón cerrar
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Hacemos visible la ventan
		this.setVisible(true);
	}

	
	
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		lblTexto1 = new JLabel("Introduzca un número: ");
		txtNumero1 = new JTextField(20);
		btnUno = new JButton("1");
		btnBorrar = new JButton("Borrar");
		btnDos = new JButton("2");
		txtNumero2 = new JTextField(20);
		btnRaizCuadrada = new JButton("Raiz");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Añadir el texto del botón a la caja de texto
		txtNumero1.setText("1");
	}
	
	
	class EscuchadorBotonesNumericos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		//	JButton btnSource = (JButton)e.getSource();
			txtNumero1.setText(txtNumero1.getText() + e.getActionCommand());
			
		}
		
	}
	
	class EscuchadorBotonBorrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txtNumero1.setText("");
		}
		
	}
	
	class EscuchadorMouse extends MouseAdapter{
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
			JTextField source = (JTextField)e.getSource();
			source.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			JTextField source = (JTextField)e.getSource();
			source.setBackground(Color.WHITE);
		}
		
	}
	
	class EscuchadorVentana extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			int opcion = JOptionPane.showConfirmDialog(getParent(), "Buena Suerte!!!");
			
			
			switch(opcion) {
			case 0:
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				break;
			case 1:				
			case 2:
			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
				break;
			}
		}
		
	}

}
