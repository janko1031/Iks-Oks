package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

public class GuiX extends JFrame implements ActionListener {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiX frame = new GuiX();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private int k = 0;
	String letter = "";
	private boolean win = false;
	int w1 = 0;
	int w2 = 0;

	private JTextField txtUnesi;
	private JTextField txtW1;
	private JTextField txtW2;

	final JButton btn1 = new JButton("");
	final JButton btn2 = new JButton("");
	final JButton btn3 = new JButton("");
	final JButton btn4 = new JButton("");
	final JButton btn5 = new JButton("");
	final JButton btn6 = new JButton("");
	final JButton btn7 = new JButton("");
	final JButton btn8 = new JButton("");
	final JButton btn9 = new JButton("");

	final JLabel label = new JLabel("");
	final JLabel label_1 = new JLabel("");
	final JLabel label_2 = new JLabel("");

	final JButton btnIgra = new JButton("Igraj ponovo");
	final JSeparator separator = new JSeparator();
	final JButton btnUnesi = new JButton("Unesi");
	final JButton btnKraj = new JButton("Kraj igre");

	JMenuItem mntmIgrajPonovo = new JMenuItem("Igraj Ponovo");
	JMenu mnFile = new JMenu("Igra");
	JMenuItem mntmPrikaziSveRezultate = new JMenuItem("Prikazi sve rezultate");

	final JPanel panel = new JPanel();
	JScrollPane scrollPane = new JScrollPane();
	final JTextPane textPane = new JTextPane();

	public GuiX() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 594);

		contentPane = new JPanel();
		contentPane.setSize(new Dimension(200, 200));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(null);
		btn1.setEnabled(false);

		btn1.setBounds(5, 5, 140, 121);
		btn1.setHideActionText(true);
		btn1.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn1);
		btn3.setEnabled(false);

		btn3.setBounds(285, 5, 140, 121);
		btn3.setFont(new Font("Arial", Font.PLAIN, 60));
		btn3.setPreferredSize(new Dimension(100, 100));
		contentPane.add(btn3);
		btn4.setEnabled(false);

		btn4.setBounds(5, 126, 140, 121);
		btn4.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn4);
		btn5.setEnabled(false);

		btn5.setBounds(145, 126, 140, 121);
		btn5.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn5);
		btn6.setEnabled(false);

		btn6.setBounds(285, 126, 140, 121);
		btn6.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn6);
		btn7.setEnabled(false);

		btn7.setBounds(5, 247, 140, 121);
		btn7.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn7);
		btn8.setEnabled(false);

		btn8.setBounds(145, 247, 140, 121);
		btn8.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn8);
		btn9.setEnabled(false);

		btn9.setBounds(285, 247, 140, 121);
		btn9.setFont(new Font("Arial", Font.PLAIN, 60));
		contentPane.add(btn9);

		final JLabel lblUnesi = new JLabel("Unesite ime prvog igraca");
		lblUnesi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUnesi.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnesi.setBounds(112, 367, 191, 24);
		contentPane.add(lblUnesi);

		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(0, 386, 134, 24);
		contentPane.add(label);

		label_1.setForeground(Color.BLUE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(285, 386, 143, 24);
		contentPane.add(label_1);

		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(112, 504, 191, 24);
		contentPane.add(label_2);

		txtUnesi = new JTextField();
		txtUnesi.setBounds(146, 390, 129, 20);
		contentPane.add(txtUnesi);
		txtUnesi.setColumns(10);

		btnUnesi.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (label.getText().equals("")) {
					if (txtUnesi.getText().equals("")) {

						JOptionPane.showMessageDialog(null,
								"Morate uneti ime takmicara!");
					} else {
						label.setText(txtUnesi.getText());
						txtUnesi.setText("");
						lblUnesi.setText("Unesite ime drugog igraca ");
						txtW1.setText("0");
					}
				} else {

					if (txtUnesi.getText().equals("")) {

						JOptionPane.showMessageDialog(null,
								"Morate uneti ime takmicara!");
					} else {
						label_1.setText(txtUnesi.getText());
						txtUnesi.setText("");
						txtUnesi.setEnabled(false);
						btnUnesi.setEnabled(false);
						lblUnesi.setVisible(false);
						txtW2.setText("0");
						textPane.setText("Rezultati takmicara: " + '\n'
								+ label.getText() + '\t' + label_1.getText()
								+ '\n'
								+ "_______________________________________"
								+ '\n');

						btnUnesi.setEnabled(false);
						btnIgra.setEnabled(false);
						btnKraj.setEnabled(false);
						mntmIgrajPonovo.setEnabled(false);

						btn1.setEnabled(true);
						btn2.setEnabled(true);
						btn3.setEnabled(true);
						btn4.setEnabled(true);
						btn5.setEnabled(true);
						btn6.setEnabled(true);
						btn7.setEnabled(true);
						btn8.setEnabled(true);
						btn9.setEnabled(true);

						btnIgra.setEnabled(false);
						btnKraj.setEnabled(false);
					}
				}

			}
		});
		btnUnesi.setBounds(159, 421, 99, 23);
		contentPane.add(btnUnesi);

		final JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblX.setBounds(10, 461, 40, 44);
		contentPane.add(lblX);

		final JLabel lblO = new JLabel("O");
		lblO.setForeground(Color.BLUE);
		lblO.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblO.setBounds(372, 461, 40, 44);
		contentPane.add(lblO);

		txtW1 = new JTextField();
		txtW1.setEditable(false);
		txtW1.setBounds(62, 471, 40, 20);
		contentPane.add(txtW1);
		txtW1.setColumns(10);

		txtW2 = new JTextField();
		txtW2.setEditable(false);
		txtW2.setColumns(10);
		txtW2.setBounds(322, 471, 40, 20);
		contentPane.add(txtW2);
		btnKraj.setEnabled(false);

		btnKraj.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String winner = "";
				if (w1 > w2) {
					winner = "Pobednik je " + label.getText();
					JOptionPane.showMessageDialog(null, winner);

				} else if (w1 < w2) {
					winner = "Pobednik je " + label_1.getText();
					JOptionPane.showMessageDialog(null, winner);
				} else {
					JOptionPane.showMessageDialog(null, "Nema pobednika");
					winner = "Nema pobednika";
				}

				String sw1 = Integer.toString(w1);
				String sw2 = Integer.toString(w2);

				String st1 = textPane.getText() + '\n'
						+ "_______________________________________" + '\n';
				String st2 = st1 + sw1 + '\t' + sw2 + '\t' + "Ukupno poena"
						+ '\n' + winner;
				textPane.setText(st2);
				label_2.setText("");
				mntmPrikaziSveRezultate.setEnabled(true);
				mntmIgrajPonovo.setEnabled(false);
				btnIgra.setEnabled(false);

			}
		});
		btnKraj.setBounds(159, 484, 99, 23);
		contentPane.add(btnKraj);
		btnIgra.setEnabled(false);
		btnIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k = 0;
				label_2.setText("");
				btn1.setEnabled(true);
				btn1.setText("");
				btn2.setEnabled(true);
				btn2.setText("");
				btn3.setEnabled(true);
				btn3.setText("");
				btn4.setEnabled(true);
				btn4.setText("");
				btn5.setEnabled(true);
				btn5.setText("");
				btn6.setEnabled(true);
				btn6.setText("");
				btn7.setEnabled(true);
				btn7.setText("");
				btn8.setEnabled(true);
				btn8.setText("");
				btn9.setEnabled(true);
				btn9.setText("");
				btnIgra.setEnabled(false);
				btnKraj.setEnabled(false);

			}
		});
		btnIgra.setBounds(159, 455, 99, 23);

		contentPane.add(btnIgra);
		panel.setBounds(5, 367, 423, 161);

		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		scrollPane.setFocusable(false);
		scrollPane.setVisible(false);

		scrollPane.setEnabled(false);
		panel.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(textPane);
		textPane.setVisible(false);
		textPane.setEditable(false);
		btn2.setEnabled(false);

		btn2.setPreferredSize(new Dimension(100, 100));
		btn2.setFont(new Font("Arial", Font.PLAIN, 60));
		btn2.setBounds(145, 5, 140, 121);
		contentPane.add(btn2);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuBar.add(mnFile);

		JMenuItem menuIgra = new JMenuItem("Nova igra");
		menuIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k = 0;
				w1 = 0;
				w2 = 0;
				txtUnesi.setEnabled(true);
				lblUnesi.setText("Unesite ime prvog igraca");
				lblUnesi.setVisible(true);
				btnUnesi.setEnabled(true);
				label.setText("");
				label_1.setText("");
				label_2.setText("");
				btn1.setEnabled(true);
				btn1.setText("");
				btn2.setEnabled(true);
				btn2.setText("");
				btn3.setEnabled(true);
				btn3.setText("");
				btn4.setEnabled(true);
				btn4.setText("");
				btn5.setEnabled(true);
				btn5.setText("");
				btn6.setEnabled(true);
				btn6.setText("");
				btn7.setEnabled(true);
				btn7.setText("");
				btn8.setEnabled(true);
				btn8.setText("");
				btn9.setEnabled(true);
				btn9.setText("");
				txtW1.setText("");
				txtW2.setText("");
				textPane.setVisible(false);

				txtUnesi.setVisible(true);
				btnUnesi.setVisible(true);
				btnIgra.setVisible(true);
				btnKraj.setVisible(true);
				lblX.setVisible(true);
				lblO.setVisible(true);
				label.setVisible(true);
				label_1.setVisible(true);
				txtW1.setVisible(true);
				txtW2.setVisible(true);
				btnUnesi.setEnabled(true);

				scrollPane.setEnabled(false);
				scrollPane.setFocusable(false);
				scrollPane.setVisible(false);

				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnKraj.setEnabled(false);
				mntmPrikaziSveRezultate.setEnabled(false);
				mntmIgrajPonovo.setEnabled(false);
			}
		});
		mnFile.add(menuIgra);

		JMenuItem mneuIzlaz = new JMenuItem("Izlaz");
		mneuIzlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});

		mntmPrikaziSveRezultate.setEnabled(false);
		mntmPrikaziSveRezultate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setVisible(true);
				txtUnesi.setVisible(false);
				btnUnesi.setVisible(false);
				btnIgra.setVisible(false);
				btnKraj.setVisible(false);
				lblX.setVisible(false);
				lblO.setVisible(false);
				label.setVisible(false);
				label_1.setVisible(false);
				txtW1.setVisible(false);
				txtW2.setVisible(false);
				scrollPane.setEnabled(true);
				scrollPane.setFocusable(true);
				scrollPane.setVisible(true);
			}
		});
		mntmIgrajPonovo.setEnabled(false);

		mntmIgrajPonovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k = 0;

				label_2.setText("");
				btn1.setEnabled(true);
				btn1.setText("");
				btn2.setEnabled(true);
				btn2.setText("");
				btn3.setEnabled(true);
				btn3.setText("");
				btn4.setEnabled(true);
				btn4.setText("");
				btn5.setEnabled(true);
				btn5.setText("");
				btn6.setEnabled(true);
				btn6.setText("");
				btn7.setEnabled(true);
				btn7.setText("");
				btn8.setEnabled(true);
				btn8.setText("");
				btn9.setEnabled(true);
				btn9.setText("");

			}
		});
		mnFile.add(mntmIgrajPonovo);
		mnFile.add(mntmPrikaziSveRezultate);

		mnFile.add(separator);
		mnFile.add(mneuIzlaz);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent a) {

		k++;
		if (k == 1 || k == 3 || k == 5 || k == 7 || k == 9) {

			letter = "X";

		} else if (k == 2 || k == 4 || k == 6 || k == 8 || k == 10) {

			letter = "O";
		}

		if (a.getSource() == btn1) {
			btn1.setText(letter);

			btn1.setEnabled(false);

		} else if (a.getSource() == btn2) {

			btn2.setText(letter);

			btn2.setEnabled(false);

		} else if (a.getSource() == btn3) {

			btn3.setText(letter);

			btn3.setEnabled(false);

		} else if (a.getSource() == btn4) {

			btn4.setText(letter);

			btn4.setEnabled(false);

		} else if (a.getSource() == btn5) {

			btn5.setText(letter);

			btn5.setEnabled(false);

		} else if (a.getSource() == btn6) {

			btn6.setText(letter);

			btn6.setEnabled(false);

		} else if (a.getSource() == btn7) {

			btn7.setText(letter);

			btn7.setEnabled(false);

		} else if (a.getSource() == btn8) {

			btn8.setText(letter);

			btn8.setEnabled(false);

		} else if (a.getSource() == btn9) {

			btn9.setText(letter);

			btn9.setEnabled(false);

		}

		if (btn1.getText() == btn2.getText()
				&& btn2.getText() == btn3.getText() && btn1.getText() != "") {

			win = true;
			
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		}

		else if (btn4.getText() == btn5.getText()
				&& btn5.getText() == btn6.getText() && btn4.getText() != "") {

			win = true;

			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		}

		else if (btn7.getText() == btn8.getText()
				&& btn8.getText() == btn9.getText() && btn7.getText() != "") {

			win = true;

			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);

		}

		else if (btn1.getText() == btn4.getText()
				&& btn4.getText() == btn7.getText() && btn1.getText() != "") {

			win = true;

			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn5.setEnabled(false);
			btn6.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		}

		else if (btn2.getText() == btn5.getText()
				&& btn5.getText() == btn8.getText() && btn2.getText() != "") {

			win = true;

			btn1.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn9.setEnabled(false);

		}

		else if (btn3.getText() == btn6.getText()
				&& btn6.getText() == btn9.getText() && btn3.getText() != "") {

			win = true;

			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn4.setEnabled(false);
			btn5.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);

		}

		else if (btn1.getText() == btn5.getText()
				&& btn5.getText() == btn9.getText() && btn1.getText() != "") {

			win = true;

			btn2.setEnabled(false);
			btn3.setEnabled(false);
			btn4.setEnabled(false);
			btn6.setEnabled(false);
			btn7.setEnabled(false);
			btn8.setEnabled(false);

		}

		else if (btn3.getText() == btn5.getText()
				&& btn5.getText() == btn7.getText() && btn3.getText() != "") {

			win = true;

			btn3.setEnabled(false);
			btn2.setEnabled(false);
			btn4.setEnabled(false);
			btn6.setEnabled(false);
			btn8.setEnabled(false);
			btn9.setEnabled(false);

		}

		else {

			win = false;

		}

		if (win == true) {
			if (letter.equals("X")) {

				w1++;
				String sw1 = Integer.toString(w1);
				txtW1.setText(sw1);
				label_2.setText("Pobednik je " + label.getText());
				String st1 = textPane.getText();
				String st2 = st1 + "1" + '\t' + "0" + '\n';
				textPane.setText(st2);

				btnIgra.setEnabled(true);
				btnKraj.setEnabled(true);
				mntmIgrajPonovo.setEnabled(true);

			} else {

				w2++;
				String sw2 = Integer.toString(w2);
				txtW2.setText(sw2);
				label_2.setText("Pobednik je  " + label_1.getText());
				String st3 = textPane.getText();
				String st4 = st3 + "0" + '\t' + "1" + '\n';
				textPane.setText(st4);

				btnIgra.setEnabled(true);
				btnKraj.setEnabled(true);
				mntmIgrajPonovo.setEnabled(true);
			}

		} else if (k == 9 && win == false) {

			label_2.setText("Nema pobednika");
			String st5 = textPane.getText();
			String st6 = st5 + "0" + '\t' + "0" + '\n';
			textPane.setText(st6);

			btnIgra.setEnabled(true);
			btnKraj.setEnabled(true);
			mntmIgrajPonovo.setEnabled(true);
		}
	}
}
