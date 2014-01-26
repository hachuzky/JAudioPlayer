package de.hachuzky.java.jaudioplayer;

import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainClass extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass frame = new MainClass();
					frame.setTitle("JAudioPlayer");
//					URL iconURL = getClass().getResource("D:\\Downloads\\Temp\\File-Types-Mp3-icon.png");
//					ImageIcon icon = new ImageIcon(iconURL);
//					frame.setIconImage(icon.getImage());
					frame.setIconImage(ImageIO.read(new File("Images/File-Types-Mp3-icon.png")));
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
	public MainClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
