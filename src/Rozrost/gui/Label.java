package Rozrost.gui;

import java.awt.Font;

import javax.swing.JLabel;

public class Label extends JLabel {

	Label(String nazwa){
		
		this.setFont(new Font("Verdana", 0, 12));
		
		this.setHorizontalAlignment(CENTER);
		
		this.setText(nazwa);
	}
	
}
