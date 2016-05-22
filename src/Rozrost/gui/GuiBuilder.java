package Rozrost.gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import Rozrost.storage.DataStorage;

public class GuiBuilder {

	private Ramka MainFrame;
	
	private PoleZiaren Pole;
	
	private SidePanel Side;
	
	private Menu Menu_top;
	
	public GuiBuilder()
	{
		MainFrame = new Ramka();
		
		Pole = new PoleZiaren();
		
		Side = new SidePanel();
	
		Menu_top = new Menu();
	}
	
	
	public void buildGui()
	{
		for(int i[]: DataStorage.Ziarna){
			for(int y: i){
				y = 0;
			}
		}
		
		
		
		MainFrame.add(Pole, BorderLayout.CENTER);
		MainFrame.add(Side,BorderLayout.EAST);
		MainFrame.add(Menu_top, BorderLayout.NORTH);
		MainFrame.setVisible(true);
		
		
	}
	
}
