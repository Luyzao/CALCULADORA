package exmplo11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class Exemplo1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private float val1,val2;
	private int resultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo1 frame = new Exemplo1();
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
	public Exemplo1() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 441);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResult = new JLabel("");
		lblResult.setForeground(Color.BLACK);
		lblResult.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblResult.setHorizontalAlignment(SwingConstants.TRAILING);
		lblResult.setVerticalAlignment(SwingConstants.BOTTOM);
		lblResult.setBackground(Color.YELLOW);
		lblResult.setBounds(50, 22, 311, 64);
		contentPane.add(lblResult);
		
		
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBackground(SystemColor.activeCaption);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultado = '-';
				val1 = Integer.parseInt( lblResult.getText());
				
				lblResult.setText("");
		
				
			}
		});
		btnMenos.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMenos.setBounds(20, 334, 81, 57);
		contentPane.add(btnMenos);
		
		JButton btnN0 = new JButton("0");
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"0"
						+ "");
				
			}
		});
		btnN0.setBackground(SystemColor.activeCaption);
		btnN0.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN0.setBounds(111, 334, 81, 57);
		contentPane.add(btnN0);
		
		JButton btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultado = '+';
				val1 = Integer.parseInt( lblResult.getText());
				
				lblResult.setText("");
				
			}
		});
		btnMais.setBackground(SystemColor.activeCaption);
		btnMais.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnMais.setBounds(196, 334, 81, 57);
		contentPane.add(btnMais);
		
		JButton btnN1 = new JButton("1");
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				lblResult.setText(lblResult.getText()+"1");
				
			}
		});
		btnN1.setBackground(SystemColor.activeCaption);
		btnN1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN1.setBounds(20, 266, 81, 57);
		contentPane.add(btnN1);
		
		JButton btnN2 = new JButton("2");
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
		
				lblResult.setText(lblResult.getText()+"2");
				
			}
		});
		btnN2.setBackground(SystemColor.activeCaption);
		btnN2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN2.setBounds(111, 266, 81, 57);
		contentPane.add(btnN2);
		
		JButton btnN3 = new JButton("3");
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"3");
				
			}
		});
		btnN3.setBackground(SystemColor.activeCaption);
		btnN3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN3.setBounds(196, 266, 81, 57);
		contentPane.add(btnN3);
		
		JButton btnN4 = new JButton("4");
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"4");
				
			}
		});
		btnN4.setBackground(SystemColor.activeCaption);
		btnN4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN4.setBounds(20, 198, 81, 57);
		contentPane.add(btnN4);
		
		JButton btnN5 = new JButton("5");
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblResult.setText(lblResult.getText()+"5");
					
			}
		});
		btnN5.setBackground(SystemColor.activeCaption);
		btnN5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN5.setBounds(111, 198, 81, 57);
		contentPane.add(btnN5);
		
		JButton btnN6 = new JButton("6");
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"6");
				
			}
		});
		btnN6.setBackground(SystemColor.activeCaption);
		btnN6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN6.setBounds(196, 198, 81, 57);
		contentPane.add(btnN6);
		
		JButton btnEgual = new JButton("=");
		btnEgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch (resultado) {
				case '+': {
					
				
					val2 = Float.parseFloat(lblResult.getText());
					lblResult.setText(String.valueOf(val1 + val2));
					
					break;}
				
				case '-' :{
						
					val2 = Float.parseFloat(lblResult.getText());
					lblResult.setText(String.valueOf(val1 - val2));
						
					break;}
				
				case 'x':{
					
					val2 = Float.parseFloat(lblResult.getText());
					lblResult.setText(String.valueOf(val1 * val2));
					
					break;}
				
				case '%' :{
					
					val2 =Float.parseFloat(lblResult.getText());
					lblResult.setText(String.valueOf(val1 / val2));
					
					break;}
						
					
					
				}
				
				}
				
				
		
			}
		);
		btnEgual.setBackground(SystemColor.activeCaption);
		btnEgual.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnEgual.setBounds(287, 207, 111, 184);
		contentPane.add(btnEgual);
		
		textField = new JTextField();
		textField.setBounds(15, 22, 383, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnN8 = new JButton("8");
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"8");
				
			}
		});
		btnN8.setBackground(SystemColor.activeCaption);
		btnN8.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN8.setBounds(111, 130, 81, 57);
		contentPane.add(btnN8);
		
		JButton btnN7 = new JButton("7");
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"7");
				
			}
		});
		btnN7.setBackground(SystemColor.activeCaption);
		btnN7.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN7.setBounds(20, 130, 81, 57);
		contentPane.add(btnN7);
		
		JButton btnN9 = new JButton("9");
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblResult.setText(lblResult.getText()+"9");
				
			}
		});
		btnN9.setBackground(SystemColor.activeCaption);
		btnN9.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnN9.setBounds(196, 130, 81, 57);
		contentPane.add(btnN9);
		
		JButton btnVezes = new JButton("X");
		btnVezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultado = 'x';
				val1 = Integer.parseInt( lblResult.getText());
				
				lblResult.setText("");
			}
		});
		btnVezes.setBackground(SystemColor.activeCaption);
		btnVezes.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnVezes.setBounds(287, 153, 111, 48);
		contentPane.add(btnVezes);
		
		JButton btnDividir = new JButton("%");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resultado = '%';
				val1 = Integer.parseInt( lblResult.getText());
				
				lblResult.setText("");
				
			}
		});
		btnDividir.setBackground(SystemColor.activeCaption);
		btnDividir.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnDividir.setBounds(287, 97, 111, 48);
		contentPane.add(btnDividir);
		
		JTextPane txtpnCalculadora = new JTextPane();
		txtpnCalculadora.setBackground(new Color(135, 206, 235));
		txtpnCalculadora.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtpnCalculadora.setText("CALCULADORA");
		txtpnCalculadora.setBounds(152, 0, 109, 20);
		contentPane.add(txtpnCalculadora);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblResult.setText("");
				
			}
		});
		btnC.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnC.setBackground(SystemColor.activeCaption);
		btnC.setBounds(25, 96, 50, 30);
		contentPane.add(btnC);
		
		
	}
}
