package Rozrost.gui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import Rozrost.storage.DataStorage;

public class PeriodycznoscText extends JTextField {

	PeriodycznoscText(){
	
		this.setPreferredSize(new Dimension(75,30));
		
		this.setFont(new Font("Verdana", 0, 12));
		
		this.setEditable(false);
	
		this.setHorizontalAlignment(CENTER);
	
		
	}
	
	public void setPeriodycznosc(){
		
		if(DataStorage.PeriodicBC){this.setText("Tak");}
		else{this.setText("Nie");}
	}
}
