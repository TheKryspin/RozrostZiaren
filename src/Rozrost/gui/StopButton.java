package Rozrost.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import Rozrost.storage.DataStorage;

public class StopButton extends JButton implements MouseListener {

	public StopButton(){
		
	this.setPreferredSize(new Dimension(100,25));
	
	this.setForeground(Color.WHITE);

	this.setFont(new Font("Verdana", 0 , 12));

	this.setBackground(Color.BLACK);

	this.setText("Stop");
	
	this.setHorizontalTextPosition(CENTER);
	
	this.addMouseListener(this);
	
	}

	@SuppressWarnings("deprecation")
	@Override
	public void mouseClicked(MouseEvent arg0) {
		try{
		DataStorage.Symuluj.stop(new Throwable());
		}
		catch(Exception a){
			
		}
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
