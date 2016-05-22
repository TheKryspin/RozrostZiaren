package Rozrost.gui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import Rozrost.storage.DataStorage;

public class OtoczenieText extends JTextField {

	OtoczenieText(){
		this.setPreferredSize(new Dimension(75,30));
		
		this.setFont(new Font("Verdana", 0, 12));
		
		this.setEditable(false);
	
		this.setHorizontalAlignment(CENTER);
	
		
	}

	public void setOtoczenie(){
	
		if(DataStorage.Otoczenie == 0){
			
			this.setText("");
			
		}else if(DataStorage.Otoczenie == 1){
			
			this.setText("Moore");
		}else if(DataStorage.Otoczenie == 2){
			
			this.setText("Von Neuman");
			
		}else if(DataStorage.Otoczenie == 3){
			
			this.setText("VonNeuman + Moore");
			
		}else if(DataStorage.Otoczenie == 4){
			
			this.setText("Pent. Gorne");
			
		}else if(DataStorage.Otoczenie == 5){
			
			this.setText("Pent. Dolne");
			
		}else if(DataStorage.Otoczenie == 6){
			
			this.setText("Pent. Prawe");
			
		}else if(DataStorage.Otoczenie == 7){
			
			this.setText("Pent. Lewe");
			
			
		}else if(DataStorage.Otoczenie == 8){
			
			this.setText("Heks. Prawe");
			
			
		}else if(DataStorage.Otoczenie == 9){
			
			this.setText("Heks. Lewe");
			
		}	
	
	
	}
}
