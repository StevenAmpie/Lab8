package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import logica.Becas;
import logica.Estudiantes;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Reportes extends JFrame {
	private JTextArea textAreaBecados;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reportes frame = new Reportes();
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
	public Reportes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reportes");
		lblNewLabel.setBounds(334, 0, 149, 46);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estudiantes Becados:");
		lblNewLabel_1.setBounds(313, 56, 195, 35);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel_1);
		
		textAreaBecados = new JTextArea();
		textAreaBecados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textAreaBecados.setEditable(false);
		textAreaBecados.setBounds(70, 101, 745, 298);
		contentPane.add(textAreaBecados);
		
		JComboBox comboBoxCarrerasBecas = new JComboBox();
		comboBoxCarrerasBecas.setModel(new DefaultComboBoxModel(new String[] {"Ingeniería Civil", "Ingeniería Eléctrica", "Ingeniería Industrial", "Ingeniería en Sistemas", "Ingeniería Mecánica", "Ingeniería Marítima"}));
		comboBoxCarrerasBecas.setSelectedIndex(-1);
		comboBoxCarrerasBecas.setBounds(637, 60, 178, 35);
		contentPane.add(comboBoxCarrerasBecas);

		
	}
	void mostrarBecados(Becas becas) {
        System.out.println("Estudiantes becados obtenidos: " + becas.obtenerEstudiantesBecados().size());

        StringBuilder sb = new StringBuilder();
       

        for (String nombre : becas.obtenerEstudiantesBecados()) {
            sb.append("\t"+nombre).append("\n");
        }

        textAreaBecados.setText(sb.toString());
    }
}
