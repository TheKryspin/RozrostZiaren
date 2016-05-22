package Rozrost.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Rozrost.storage.DataStorage;

public class SidePanel extends JPanel {


	public SidePanel()
	{

		this.setPreferredSize(new Dimension(DataStorage.Side_x, DataStorage.Side_y));
		
		
		
	}
	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.blue);
		
		g.fillRect(0, 0, 150, 650);
		
		
	}
}
