package Rozrost.gui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import Rozrost.storage.DataStorage;

public class KolorText extends JTextField {

	public KolorText(){
		
		this.setPreferredSize(new Dimension(75,30));
		
			this.setFont(new Font("Verdana", 0, 12));
			
			this.setEditable(false);
		
			this.setHorizontalAlignment(CENTER);
		
	}
	
	public void setColor(){
		
		if(DataStorage.Value == 0){
			
			this.setText("Nie wybrano");
			
		}else if(DataStorage.Value == 1){
			
			this.setText("Green");
			
		}else if(DataStorage.Value == 2){
			
			this.setText("Blue");
			
		}else if(DataStorage.Value == 3){
			
			this.setText("Red");
			
		}else if(DataStorage.Value == 4){
			
			this.setText("Yellow");
			
		}else if(DataStorage.Value == 5)
		{
			this.setText("Orange");
		}
		
	}
	
}
