package Interfaces;


import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



import Codigo.Tablero.GestorTablero;
import Codigo.luchadores.Utils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazNuevoLuchador extends GestorInterfaces {

	private JFrame frame;
	private JTextField FieldNombre;



	private String categoria=null;

	private GestorTablero gt;
	private JFrame interfazTablero;
	
	public InterfazNuevoLuchador(GestorTablero gt,JFrame interfazTablero) {
		initialize();
		this.gt=gt;
	
		this.interfazTablero=interfazTablero;
		

	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton Crear = new JButton("Crear Luchador");
		Crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				if(categoria==null||FieldNombre.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null, "Seleccione el tipo de luchador y nombre");
				}
				else
				{
					switch (categoria)
					{
					case "gladiador":
						
						gt.crearLuchador(Utils.GLADIADOR, FieldNombre.getText());
						break;
					case "arquero":
						gt.crearLuchador(Utils.ARQUERO, FieldNombre.getText());
						break;
					}
					new InterfazTablero(gt);
					
					frame.setVisible(false);
					interfazTablero.setVisible(false);
				
					
				

				}
			}
		});

		JLabel lblSeleccioneElTipo = new JLabel("Seleccione el tipo de luchador que desea crear:");
		lblSeleccioneElTipo.setBounds(79, 6, 318, 16);
		frame.getContentPane().add(lblSeleccioneElTipo);

		JLabel NombrePersonaje = new JLabel("Nombre de personaje:");
		NombrePersonaje.setBounds(6, 152, 141, 16);
		frame.getContentPane().add(NombrePersonaje);

		FieldNombre = new JTextField();
		FieldNombre.setBounds(6, 168, 130, 26);
		frame.getContentPane().add(FieldNombre);
		FieldNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(174, 34, 270, 200);
		frame.getContentPane().add(lblNewLabel);

		JButton btnArquero = new JButton("Arquero");
		btnArquero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				categoria="arquero";
				lblNewLabel.setIcon(setearImagen("arquero"));
				Crear.setText("Crear Arquero");




			}
		});
		btnArquero.setBounds(6, 61, 117, 29);
		frame.getContentPane().add(btnArquero);

		JButton btnGladiador = new JButton("Gladiador");
		btnGladiador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				categoria="gladiador";
				lblNewLabel.setIcon(setearImagen("gladiador"));
				Crear.setText("Crear Gladiador");

			}
		});
		btnGladiador.setBounds(6, 111, 117, 29);
		frame.getContentPane().add(btnGladiador);



		Crear.setBounds(0, 227, 147, 29);
		frame.getContentPane().add(Crear);

		JLabel lblArmas = new JLabel("Armas");
		lblArmas.setBounds(196, 232, 61, 16);
		frame.getContentPane().add(lblArmas);
		
	




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
