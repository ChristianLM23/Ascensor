package Hoja4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JTextField Pplanta3;
	private JTextField Pplanta2;
	private JTextField Pplanta1;
	private JTextField Pplanta0;
	private JTextField Aplanta3;
	private JTextField Aplanta2;
	private JTextField Aplanta1;
	private JTextField Aplanta0;
	private JTextField llamar;
	private JComboBox comboBox;
	private JButton btnExit;
	Color c1 = new Color(25, 57, 15, 115);
	Color c2 = new Color(105, 57, 15, 115);
	int randomp = (int) (Math.random() * 4);
	int randoma = (int) (Math.random() * 4);
	int comprobador=50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
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
	public Ascensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPersona = new JLabel("Persona");
		lblPersona.setBounds(42, 45, 65, 14);
		contentPane.add(lblPersona);

		JLabel lblAscensor = new JLabel("Ascensor");
		lblAscensor.setBounds(150, 45, 46, 14);
		contentPane.add(lblAscensor);

		Pplanta3 = new JTextField();
		Pplanta3.setEditable(false);
		Pplanta3.setBounds(21, 70, 86, 20);
		contentPane.add(Pplanta3);
		Pplanta3.setColumns(10);

		Pplanta2 = new JTextField();
		Pplanta2.setEditable(false);
		Pplanta2.setColumns(10);
		Pplanta2.setBounds(21, 115, 86, 20);
		contentPane.add(Pplanta2);

		Pplanta1 = new JTextField();
		Pplanta1.setEditable(false);
		Pplanta1.setColumns(10);
		Pplanta1.setBounds(21, 160, 86, 20);
		contentPane.add(Pplanta1);

		Pplanta0 = new JTextField();
		Pplanta0.setEditable(false);
		Pplanta0.setColumns(10);
		Pplanta0.setBounds(21, 202, 86, 20);
		contentPane.add(Pplanta0);

		Aplanta3 = new JTextField();
		Aplanta3.setEditable(false);
		Aplanta3.setColumns(10);
		Aplanta3.setBounds(130, 70, 86, 20);
		contentPane.add(Aplanta3);

		Aplanta2 = new JTextField();
		Aplanta2.setEditable(false);
		Aplanta2.setColumns(10);
		Aplanta2.setBounds(130, 115, 86, 20);
		contentPane.add(Aplanta2);

		Aplanta1 = new JTextField();
		Aplanta1.setEditable(false);
		Aplanta1.setColumns(10);
		Aplanta1.setBounds(130, 160, 86, 20);
		contentPane.add(Aplanta1);

		Aplanta0 = new JTextField();
		Aplanta0.setEditable(false);
		Aplanta0.setColumns(10);
		Aplanta0.setBounds(130, 202, 86, 20);
		contentPane.add(Aplanta0);

		JButton btnLlamar = new JButton("LLAMAR");
		btnLlamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				llamar.setText("");
				switch (randomp) {
				case 0:
					Aplanta1.setBackground(null);
					Aplanta2.setBackground(null);
					Aplanta3.setBackground(null);
					llamar.setText("BAJA");
					Aplanta0.setBackground(c2);
					break;

				case 1:

					Aplanta0.setBackground(null);
					Aplanta2.setBackground(null);
					Aplanta3.setBackground(null);
					Aplanta1.setBackground(c2);
					break;

				case 2:

					Aplanta1.setBackground(null);
					Aplanta0.setBackground(null);
					Aplanta3.setBackground(null);
					Aplanta2.setBackground(c2);
					break;

				case 3:

					Aplanta1.setBackground(null);
					Aplanta2.setBackground(null);
					Aplanta0.setBackground(null);
					llamar.setText("SUBE");
					Aplanta3.setBackground(c2);
					break;
				}
				randomp=comprobador;
			}
		});
		btnLlamar.setBounds(225, 11, 89, 23);
		contentPane.add(btnLlamar);

		llamar = new JTextField();
		llamar.setEditable(false);
		llamar.setBounds(338, 12, 86, 20);
		contentPane.add(llamar);
		llamar.setColumns(10);

		JButton btnMover = new JButton("MOVER");
		btnMover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = (String) comboBox.getSelectedItem();
				int piso = Integer.parseInt(numero);
				
				if (randomp!=comprobador){
					llamar.setText("<- LLAMA");
				}
				else{
					switch (piso) {
					case 0:
						Aplanta1.setBackground(null);
						Pplanta1.setBackground(null);
						Aplanta2.setBackground(null);
						Pplanta2.setBackground(null);
						Aplanta3.setBackground(null);
						Pplanta3.setBackground(null);
						Aplanta0.setBackground(c2);
						Pplanta0.setBackground(c1);
						break;

					case 1:
						Aplanta0.setBackground(null);
						Pplanta0.setBackground(null);
						Aplanta2.setBackground(null);
						Pplanta2.setBackground(null);
						Aplanta3.setBackground(null);
						Pplanta3.setBackground(null);
						Aplanta1.setBackground(c2);
						Pplanta1.setBackground(c1);
						break;

					case 2:
						Aplanta1.setBackground(null);
						Pplanta1.setBackground(null);
						Aplanta0.setBackground(null);
						Pplanta0.setBackground(null);
						Aplanta3.setBackground(null);
						Pplanta3.setBackground(null);
						Aplanta2.setBackground(c2);
						Pplanta2.setBackground(c1);
						break;

					case 3:
						Aplanta1.setBackground(null);
						Pplanta1.setBackground(null);
						Aplanta2.setBackground(null);
						Pplanta2.setBackground(null);
						Aplanta0.setBackground(null);
						Pplanta0.setBackground(null);
						Aplanta3.setBackground(c2);
						Pplanta3.setBackground(c1);
						break;
					}
					
				}
			}
		});
		btnMover.setBounds(260, 85, 89, 23);
		contentPane.add(btnMover);

		comboBox = new JComboBox();
		comboBox.setBounds(359, 86, 46, 20);
		contentPane.add(comboBox);

		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 228, 89, 23);
		contentPane.add(btnExit);

		

		switch (randomp) {
		case 0:

			Pplanta0.setBackground(c1);
			break;

		case 1:

			Pplanta1.setBackground(c1);
			break;

		case 2:

			Pplanta2.setBackground(c1);
			break;

		case 3:

			Pplanta3.setBackground(c1);
			break;
		}

		switch (randoma) {
		case 0:
			if (randomp == randoma) {
				Aplanta1.setBackground(c2);
				llamar.setText("PLANTA 1");
			} else {
				Aplanta0.setBackground(c2);
				llamar.setText("PLANTA 0");
			}
			break;

		case 1:
			if (randomp == randoma) {
				Aplanta2.setBackground(c2);
				llamar.setText("PLANTA 2");
			} else {
				Aplanta1.setBackground(c2);
				llamar.setText("PLANTA 1");
			}
			break;

		case 2:
			if (randomp == randoma) {
				Aplanta3.setBackground(c2);
				llamar.setText("PLANTA 3");
			} else {
				Aplanta2.setBackground(c2);
				llamar.setText("PLANTA 2");
			}
			break;

		case 3:
			if (randomp == randoma) {
				Aplanta2.setBackground(c2);
				llamar.setText("PLANTA 2");
			} else {
				Aplanta3.setBackground(c2);
				llamar.setText("PLANTA 3");
			}
			break;
		}
		
		init_combo();
	}

	private void init_combo() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++){
			comboBox.addItem(String.valueOf(i));
		}
	}
}
