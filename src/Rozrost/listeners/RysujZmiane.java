package Rozrost.listeners;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Rozrost.gui.PoleZiaren;
import Rozrost.storage.DataStorage;

public class RysujZmiane implements MouseListener {

	
	
	public RysujZmiane(PoleZiaren Draw)
	{
		
	}
	
	
	public Color checkColor(int var)
	{
		if(var == 0 )
		{

			System.out.println("Bialy");
	
			return Color.WHITE;
			
		}else if(var == 1)
		{

			System.out.println("Zielony");
			
			return Color.GREEN;
		
		}else if(var == 2)
		{


			System.out.println("Niebieski");

			return Color.BLUE;
			
		}else if(var == 3)
		{
			

			System.out.println("Czerwone");

			return Color.RED;
			
		}else
		{
			
			return Color.YELLOW;
		}
		
		
		
	}
	
		public void changeColor(int val, int x, int y)
		{
			System.out.println("X = "+ x);
			System.out.println("Y = " + y);
			
				
			}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			int x = arg0.getX();
			int y = arg0.getY();

				DataStorage.Ziarna[x][y] += 1;
				
				this.changeColor(DataStorage.Ziarna[x][y], x, y);
		
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

}
