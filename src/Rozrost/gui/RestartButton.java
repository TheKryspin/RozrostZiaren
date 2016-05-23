package Rozrost.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import Rozrost.storage.DataStorage;

public class RestartButton extends JButton implements MouseListener{

	public RestartButton()
	{
			
			this.setPreferredSize(new Dimension(100,25));
			
			this.setForeground(Color.WHITE);

			this.setFont(new Font("Verdana", 0 , 12));

			this.setBackground(Color.BLACK);

			this.setText("Czysc");
			
			this.setHorizontalTextPosition(CENTER);
			
			this.addMouseListener(this);
			
			
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		for (int i = 0 ; i < DataStorage.X_panel; i ++){
			for( int j = 0; j < DataStorage.Y_panel; j ++){
				
				DataStorage.Ziarna[i][j] = 0 ;
			}
			
		}
		
		DataStorage.Panel.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
