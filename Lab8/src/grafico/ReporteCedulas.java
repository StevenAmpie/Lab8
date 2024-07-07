package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Becas;
import logica.Cedulas;
import logica.Estudiantes;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;

public class ReporteCedulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea estudiantesCedula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteCedulas frame = new ReporteCedulas();
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
	public ReporteCedulas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 552);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estudiantes por cédula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(141, 10, 530, 126);
		contentPane.add(lblNewLabel);
		
		estudiantesCedula = new JTextArea();
		estudiantesCedula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		estudiantesCedula.setBounds(108, 127, 590, 320);
		contentPane.add(estudiantesCedula);
		
		
		
		
	}
	
	void mostrarCedulas(Cedulas cedula) {
        System.out.println("Estudiantes por cedula obtenidos: " + cedula.obtenerEstudiantesPorCedula().size());
        System.out.println("Estudiantes por cedula obtenidos: " + cedula.obtenerEstudiantesPorCedula());
        
        StringBuilder sb = new StringBuilder();
       

        for (String cedulas : cedula.obtenerEstudiantesPorCedula()) {
            sb.append("\t"+cedulas).append("\n");
        }
       
        estudiantesCedula.setText(sb.toString());
    }
	
	
	
	
	
	
	
	
}

