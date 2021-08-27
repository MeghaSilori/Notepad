import java.awt.Font;

import  javax.swing.*;
public class About extends JFrame {
	JButton b1;
	About(){
		setBounds(400,200,600,400);
		setLayout(null);
		
		JLabel l = new JLabel("<html><h1>NOTEPAD</h1><p>Notepad is a simple text editor and a basic text-editing program which enables computer users to create documents.<p></html>");
		l.setBounds(100, 140, 300, 150);
		l.setFont(new Font("SAN SERIF", Font.PLAIN, 12));
		add(l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new About().setVisible(true);
	}

}
