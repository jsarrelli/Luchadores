package Interfaces;



import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Codigo.Tablero.GestorTablero;


import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class InterfazNuevoObstaculo extends GestorInterfaces {

	private JFrame frame;
	private GestorTablero gt;
	private JFrame interfazTablero;
	private String tipo=null;
	public InterfazNuevoObstaculo(GestorTablero gt,JFrame interfazTablero) {
		initialize();
		this.gt=gt;
		this.interfazTablero=interfazTablero;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
	
		
		JLabel lblTildeQueObstaculos = new JLabel("Tilde que obstaculos desea crear");
		lblTildeQueObstaculos.setBounds(99, 6, 239, 16);
		frame.getContentPane().add(lblTildeQueObstaculos);
		
		
		JButton Crear = new JButton("Crear");
		Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tipo==null)
				{
					JOptionPane.showMessageDialog(null, "Seleccione el tipo de obstaculo");
				}
				else
				{
					gt.agregarObstaculo(tipo);
					new InterfazTablero(gt);
					
					
					frame.setVisible(false);
					interfazTablero.dispose();
				}
			}
		});
		Crear.setBounds(175, 243, 117, 29);
		frame.getContentPane().add(Crear);
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(174, 34, 270, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Arbol = new JButton("Arbol");
		Arbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo="arbol";
				Crear.setText("Crear Arbol");
				lblNewLabel.setIcon(setearImagen("arbol"));
			}
		});
		Arbol.setBounds(6, 196, 117, 29);
		frame.getContentPane().add(Arbol);
		
		JButton Montana = new JButton("Montaña");
		Montana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				tipo="montana";
				Crear.setText("Crear Montaña");
				lblNewLabel.setIcon(setearImagen("montana"));
			}
		});
		Montana.setBounds(6, 127, 117, 29);
		frame.getContentPane().add(Montana);
		
		JButton Roca = new JButton("Roca");
		Roca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tipo="roca";
				Crear.setText("Crear Roca");
				lblNewLabel.setIcon(setearImagen("roca"));
			}
		});
		Roca.setBounds(6, 55, 117, 29);
		frame.getContentPane().add(Roca);
		
		

		
		
		
		frame.setVisible(true);
	}
	
	
	public ImageIcon setearImagen(String Categoria)

	{
		ImageIcon imagen = new ImageIcon("resources/"+Categoria+".png");
		Image img=imagen.getImage();
		Image newimg = img.getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH);
		imagen=new ImageIcon(newimg);


		return imagen;
	}
}
