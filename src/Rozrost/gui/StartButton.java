package Rozrost.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import Rozrost.storage.DataStorage;
import Rozrost.thread.Symulacja;

public class StartButton extends JButton implements MouseListener {

	StartButton(){
		
		this.setPreferredSize(new Dimension(100,25));
		
			this.setForeground(Color.WHITE);
		
			this.setFont(new Font("Verdana", 0 , 12));
		
			this.setBackground(Color.BLACK);
		
			this.setText("Start");
			
			this.setHorizontalTextPosition(CENTER);
			
			this.addMouseListener(this);
			
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		Symulacja Symuluj = new Symulacja();
		
		DataStorage.Symuluj = Symuluj;
		
		Symuluj.start();
		
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
