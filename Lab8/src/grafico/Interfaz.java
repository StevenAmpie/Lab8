package grafico;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


//importar clases del paquete
import logica.Estudiantes;
import logica.Becas;
import logica.Cedulas;

//Importar elementos de diseño 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCedula;
	private Estudiantes estudiante;
	private JComboBox comboBoxCarreras;
	private JComboBox comboBoxSexo;
	
	
	 private ArrayList<Estudiantes> estudiantes;
	 private JTextField textIndice;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		 estudiantes = new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setForeground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		comboBoxSexo.setSelectedIndex(-1);
		comboBoxSexo.setBounds(141, 371, 153, 21);
		contentPane.add(comboBoxSexo);
		 
		JLabel lblNewLabel = new JLabel("Información de estudiantes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(277, 10, 405, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(21, 97, 95, 22);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNombre.setBounds(141, 102, 153, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Indice:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(21, 239, 95, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cédula:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(21, 166, 95, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		textCedula = new JTextField();
		textCedula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCedula.setColumns(10);
		textCedula.setBounds(141, 167, 153, 19);
		contentPane.add(textCedula);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Carrera:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(21, 308, 95, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		JButton btnGuardar = new JButton("Guardar Datos");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(498, 91, 184, 34);
		contentPane.add(btnGuardar);
		
		JButton btnReportes = new JButton("Mostrar Reportes");
		btnReportes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReportes.setBounds(498, 233, 184, 34);
		contentPane.add(btnReportes);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(21, 368, 75, 20);
		contentPane.add(lblNewLabel_2);
		
		textIndice = new JTextField();
		textIndice.setBounds(141, 240, 96, 19);
		contentPane.add(textIndice);
		textIndice.setColumns(10);
		
		JButton btnMostrarCedulas = new JButton("Mostrar por Cedula");
		btnMostrarCedulas.setHorizontalAlignment(SwingConstants.LEFT);
		btnMostrarCedulas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMostrarCedulas.setBounds(486, 162, 201, 31);
		contentPane.add(btnMostrarCedulas);
		
		JButton btnSexo = new JButton("Mostrar por sexo");
		btnSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSexo.setBounds(498, 312, 184, 34);
		contentPane.add(btnSexo);
		
		comboBoxCarreras = new JComboBox();
		comboBoxCarreras.setModel(new DefaultComboBoxModel(new String[] {"Ingeniería Civil", "Ingeniería Eléctrica", "Ingeniería Industrial", "Ingeniería en Sistemas", "Ingeniería Mecánica", "Ingeniería Marítima"}));
		comboBoxCarreras.setBounds(141, 312, 153, 21);
		comboBoxCarreras.setSelectedIndex(-1);
		contentPane.add(comboBoxCarreras);
		
		
		
		// Agregar ActionListener para el botón "Guardar Datos"
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para guardar la información
                guardarDatos();
            }
        });
        btnReportes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cierra la ventana actual
                dispose();
                // Crear una instancia de la clase Becas
                Becas becas = new Becas();

                // Agregar todos los estudiantes del formulario a la instancia de Becas
                for (Estudiantes estudiante : estudiantes) {
                    becas.agregarEstudiante(estudiante);
                }
                // Abre la ventana de reportes
                Reportes reportes = new Reportes();
                reportes.setVisible(true);
                reportes.mostrarBecados(becas);
            }
        });
        
        
        btnMostrarCedulas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cierra la ventana actual
                dispose();
                // Crear una instancia de la clase Cedula
                Cedulas cedula = new Cedulas();

                // Agregar todos los estudiantes del formulario a la instancia de Cedula
                for (Estudiantes estudiante : estudiantes) {
                    cedula.agregarEstudiante(estudiante);
                }
                // Abre la ventana de reportesCedulas
                ReporteCedulas reportes = new ReporteCedulas();
                reportes.setVisible(true);
                reportes.mostrarCedulas(cedula);
            }
        });
        
        
        
	}
	 private void guardarDatos() {
		 
		
		
		 try {
		        // Obtener los datos ingresados por el usuario
		        String nombre = textNombre.getText();
		        String cedula = textCedula.getText();
		        String sexo = (String) comboBoxSexo.getSelectedItem();
		        double indice = Double.parseDouble(textIndice.getText());
		        
		        String carrera = (String) comboBoxCarreras.getSelectedItem();

		       if(indice>1 && indice <=3) {
		    	   Estudiantes estudiante = new Estudiantes(nombre, cedula, carrera, indice, sexo);
			        // Impresión en consola
			        System.out.println("Información del estudiante guardada: " + estudiante.toString());
			        estudiantes.add(estudiante);
		           
			        // Mostrar un mensaje de confirmación al usuario final 
			        JOptionPane.showMessageDialog(this, "Información guardada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

			      
			        textNombre.setText("");
			        textCedula.setText("");
			        comboBoxSexo.setSelectedIndex(-1); 
			        textIndice.setText("");
			        comboBoxCarreras.setSelectedIndex(-1); 
		       }
		       else if(indice<1 || indice >3){
		    	   JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos para el indice.", "Error", JOptionPane.ERROR_MESSAGE);
		    	   textIndice.setText("");
		       }
		        
		    } catch (NumberFormatException e) {
		    	
		    	
		        JOptionPane.showMessageDialog(this, "Por favor, ingrese datos válidos", "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}
}
