package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import logica.Estudiantes;
import java.awt.Color;

public class ReportesCarreras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea textAreaIndustrial;
	JTextArea textAreaCivil;
	JTextArea textAreaSistemas;
	JTextArea textAreaElectrica;
	JTextArea textAreaMecanica;
	JTextArea textAreaMaritima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportesCarreras frame = new ReportesCarreras();
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
	public ReportesCarreras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 823);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelBecadosPorCarrrera = new JLabel("Estudiantes becados por carrera");
		labelBecadosPorCarrrera.setFont(new Font("Tahoma", Font.PLAIN, 35));
		labelBecadosPorCarrrera.setBounds(178, 0, 507, 65);
		contentPane.add(labelBecadosPorCarrrera);
		
		textAreaIndustrial = new JTextArea();
		textAreaIndustrial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaIndustrial.setEditable(false);
		textAreaIndustrial.setBounds(10, 482, 189, 319);
		contentPane.add(textAreaIndustrial);
		
		
		textAreaSistemas = new JTextArea();
		textAreaSistemas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaSistemas.setEditable(false);
		textAreaSistemas.setBounds(10, 115, 189, 330);
		contentPane.add(textAreaSistemas);
		
		textAreaCivil = new JTextArea();
		textAreaCivil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaCivil.setEditable(false);
		textAreaCivil.setBounds(303, 115, 197, 330);
		contentPane.add(textAreaCivil);
		
		textAreaMaritima = new JTextArea();
		textAreaMaritima.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaMaritima.setEditable(false);
		textAreaMaritima.setBounds(640, 115, 209, 330);
		contentPane.add(textAreaMaritima);
		
		textAreaElectrica = new JTextArea();
		textAreaElectrica.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaElectrica.setEditable(false);
		textAreaElectrica.setBounds(303, 482, 197, 330);
		contentPane.add(textAreaElectrica);
		
		JLabel labelSistemas = new JLabel("Ingenieria en sistemas");
		labelSistemas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelSistemas.setBounds(29, 86, 161, 19);
		contentPane.add(labelSistemas);
		
		JLabel labelCivil = new JLabel("Ingenieria civil");
		labelCivil.setHorizontalAlignment(SwingConstants.CENTER);
		labelCivil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelCivil.setBounds(303, 86, 197, 19);
		contentPane.add(labelCivil);
		
		JLabel labelMaritima = new JLabel("Ingenieria maritima");
		labelMaritima.setHorizontalAlignment(SwingConstants.CENTER);
		labelMaritima.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMaritima.setBounds(666, 80, 155, 30);
		contentPane.add(labelMaritima);
		
		textAreaMecanica = new JTextArea();
		textAreaMecanica.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textAreaMecanica.setEditable(false);
		textAreaMecanica.setBounds(640, 482, 209, 319);
		contentPane.add(textAreaMecanica);
		
		JLabel labelIndustrial = new JLabel("Ingenieria Industrial");
		labelIndustrial.setHorizontalAlignment(SwingConstants.CENTER);
		labelIndustrial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelIndustrial.setBounds(10, 455, 180, 13);
		contentPane.add(labelIndustrial);
		
		JLabel labelElectrica = new JLabel(" Ingenieria electrica");
		labelElectrica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelElectrica.setHorizontalAlignment(SwingConstants.CENTER);
		labelElectrica.setBounds(303, 448, 197, 26);
		contentPane.add(labelElectrica);
		
		JLabel labelMecanica = new JLabel("Ingenieria mecanica");
		labelMecanica.setHorizontalAlignment(SwingConstants.CENTER);
		labelMecanica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelMecanica.setBounds(650, 455, 199, 17);
		contentPane.add(labelMecanica);
	}
	
	void mostrarCarrera(ArrayList<Estudiantes> estudiante) {
		StringBuilder civil = new StringBuilder();
		StringBuilder electrica = new StringBuilder();
		StringBuilder industrial = new StringBuilder();
		StringBuilder sistema = new StringBuilder();
		StringBuilder mecanica = new StringBuilder();
		StringBuilder maritima = new StringBuilder();
		
     for(int i =0; i<estudiante.size();i++){ 
    	 
    	 Estudiantes alumno = estudiante.get(i);
    	 if(alumno.indiceAcademico>=2) {
		    	 if(alumno.carrera.equals("Ingeniería Civil")){
		    		 
		    		 textAreaCivil.setText(civil.append(alumno.nombre).append("\n").toString());}
					 
		    	 else if(alumno.carrera.equals("Ingeniería Eléctrica")) {
		    		
		    		 textAreaElectrica.setText(electrica.append(alumno.nombre).append("\n").toString());}
		    	else if(alumno.carrera.equals("Ingeniería Industrial")) {
			    		
			    		 textAreaIndustrial.setText(industrial.append(alumno.nombre).append("\n").toString());}
		    	 else if(alumno.carrera.equals("Ingeniería en Sistemas")) {
		    		 
		    		 textAreaSistemas.setText(sistema.append(alumno.nombre).append("\n").toString());
		    		 }
		    	 else if(alumno.carrera.equals("Ingeniería Mecánica")) {
		    		 
		    		 
		    		 textAreaMecanica.setText(mecanica.append(alumno.nombre).append("\n").toString());
		    		 }
		    	 else if(alumno.carrera.equals("Ingeniería Marítima")) {
		    		 
		    		
		    		 textAreaMaritima.setText(maritima.append(alumno.nombre).append("\n").toString());
		    		 }
		    	 }
	    	 }
     }
	
}
          
    

	

