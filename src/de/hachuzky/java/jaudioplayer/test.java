package de.hachuzky.java.jaudioplayer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static Integer counter =0;
	/**
	 * Create the frame.
	 */
	private static JLabel label = new JLabel();
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		//JLabel label = new JLabel();
		label.setHorizontalAlignment(JTextField.CENTER);
		panel.add(label);
		
		JButton btnNewButton = new JButton("Privet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame anotherFrame = new JFrame();
				anotherFrame.setBounds(500,100,200,100);
				anotherFrame.setTitle("Hello World");
				anotherFrame.setResizable(false);
//				JPanel panel = new JPanel();
//				panel.setSize(200,100);
//				panel.setLocation(0, 0);
				//JLabel textField = new JLabel();
				label.setText((counter++).toString());
				//label.setHorizontalAlignment(JTextField.CENTER);
				//anotherFrame.add(textField);
				
//				anotherFrame.add(new JPanel());
				anotherFrame.setVisible(true);
			}
		});
		panel.add(btnNewButton);
	}

}
