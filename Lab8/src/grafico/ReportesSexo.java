package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Estudiantes;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextArea;
import java.awt.Color;

public class ReportesSexo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea textAreaSexo;
	private JTextArea textAreaCarrera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportesSexo frame = new ReportesSexo();
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
	public ReportesSexo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 547);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busqueda por sexo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(336, 10, 285, 54);
		contentPane.add(lblNewLabel);
		
		textAreaSexo = new JTextArea();
		textAreaSexo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textAreaSexo.setBounds(109, 119, 331, 311);
		contentPane.add(textAreaSexo);
		
		textAreaCarrera = new JTextArea();
		textAreaCarrera.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textAreaCarrera.setBounds(439, 119, 331, 311);
		contentPane.add(textAreaCarrera);
	}
	
	
	
	void mostrarPorSexo(ArrayList<Estudiantes> estudiante, String sexo) {
		StringBuilder sb = new StringBuilder();
		StringBuilder bs = new StringBuilder();
		
     for(int i =0; i<estudiante.size();i++){ 
    	 
    	 Estudiantes alumno = estudiante.get(i);
	    	 if(alumno.sexo.equals(sexo) && alumno.indiceAcademico >= 2){
	    		 
	    		 textAreaSexo.setText(sb.append(alumno.nombre).append("\n").toString());
	    		 textAreaCarrera.setText(bs.append(alumno.carrera).append("\n").toString());
	    		 }
	    	 }
	     }
	

}
