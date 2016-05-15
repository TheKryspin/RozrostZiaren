package Rozrost.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Rozrost.storage.DataStorage;

public class GuiBuilder {

	private Ramka MainFrame;
	
	private PoleZiaren Pole;
	
	public GuiBuilder()
	{
		MainFrame = new Ramka();
		
		Pole = new PoleZiaren();
	}
	
	public void buildGui()
	{
		for(int i[]: DataStorage.Ziarna){
			for(int y: i){
				y = 0;
			}
		}
		
		
		MainFrame.add(Pole, BorderLayout.CENTER);
		
		MainFrame.setVisible(true);
		
		
	}
	
}
