package Rozrost.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


import Rozrost.storage.DataStorage;

public class PoleZiaren extends JPanel implements MouseListener {

	
	public PoleZiaren()
	{

		this.setSize(DataStorage.X_panel, DataStorage.Y_panel);

		this.addMouseListener(this);
		
	
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		
		for(int x = 0; x < DataStorage.X_panel; x ++){
			for(int y = 0; y < DataStorage.Y_panel; y++)
			{
				
				g.setColor(this.checkColor(DataStorage.Ziarna[x][y]));
				
				g.drawLine(x, y, x, y);
				
			}
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		int x = arg0.getX();
		int y = arg0.getY();

		for(int i = -(DataStorage.WielkoscZiarna/2) ; i < DataStorage.WielkoscZiarna/2; i ++){
		for(int j = -(DataStorage.WielkoscZiarna/2); j < DataStorage.WielkoscZiarna/2; j++){

			if((i+x) > (DataStorage.X_panel-1) || (i+x) < 0 || (y+j) < 0 || (y+j) > (DataStorage.Y_panel-1) ){ continue;}
			else { DataStorage.Ziarna[x+i][y+j] = DataStorage.Value; }
			
			this.repaint();
		}	
		
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

			
	
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
	
	public Color checkColor(int var)
	{
		if(var == 0 )
		{

			return Color.WHITE;
			
		}else if(var == 1)
		{

			return Color.GREEN;
		
		}else if(var == 2)
		{


			return Color.BLUE;
			
		}else if(var == 3)
		{
			


			return Color.RED;
			
		}else if(var == 4)
		{
			
			return Color.YELLOW;
		}
		else
		{
			
			return Color.ORANGE;
			
		}
		
		
	}
	
	
}
