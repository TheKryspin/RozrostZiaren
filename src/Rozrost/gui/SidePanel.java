package Rozrost.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;

import Rozrost.storage.DataStorage;

public class SidePanel extends JPanel {

	KolorText KolorField;
	PeriodycznoscText PeriodycznoscField;
	OtoczenieText OtoczenieField;
	
	StartButton Start;
	StopButton Stop;
	RestartButton Czysc;
	
	public SidePanel()
	{
		
		this.setPreferredSize(new Dimension(DataStorage.Side_x, DataStorage.Side_y));
	
		this.setBackground(Color.BLUE);
		
			GridLayout lay = new GridLayout(15,1);
			
			this.setLayout(lay);
		
				KolorField = new KolorText();
				PeriodycznoscField = new PeriodycznoscText();
				OtoczenieField = new OtoczenieText();
				
				Start = new StartButton();
				Stop = new StopButton();
				Czysc = new RestartButton();
				
					DataStorage.KolorField = KolorField;		
					DataStorage.PeriodycznoscField = PeriodycznoscField;
					DataStorage.OtoczenieField = OtoczenieField;
		
				Label KolorLabel = new Label("Wybrano kolor");
				Label PeriodycznoscLabel = new Label("Wybrano periodycznosc");
				Label OtoczenieLabel = new Label("Wybrano otoczenie");
		
		this.add(KolorLabel);
		this.add(KolorField);
		
		this.add(PeriodycznoscLabel);
		this.add(PeriodycznoscField);
	
		this.add(OtoczenieLabel);
		this.add(OtoczenieField);

		this.add(new Component(){});
		
		this.add(Start);
	
		this.add(new Component(){});
		
		this.add(Stop);
		
		this.add(new Component(){});
		
		this.add(Czysc);
	}
	
}
