package Rozrost.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import Rozrost.storage.DataStorage;

public class Menu extends JMenuBar {

	public Menu()
	{
		this.setPreferredSize(new Dimension(600,30));
		
		this.setBackground(Color.LIGHT_GRAY);
		
		this.setForeground(Color.darkGray);
			
					this.add(this.getKolorMenu());
					
					this.add(this.getWielkoscMenu());
					
					this.add(this.getPeriodMenu());
	
					this.add(this.getOtoczenieMenu());
	}
	
	
	JMenu getKolorMenu(){
		JMenu KolorMenu = new JMenu("Kolor");
		
		KolorMenu.setForeground(Color.WHITE);
		
		KolorMenu.setFont(new Font ("Verdana", 0, 12));
		
		KolorMenu.getAccessibleContext().setAccessibleDescription("Mo¿esz u¿yæ klawisza 1 aby otworzyæ to menu");
		
		KolorMenu.setMnemonic(KeyEvent.VK_1);
		
			JMenuItem Green = new JMenuItem("Green");
				Green.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						DataStorage.Value = 1;
						
					}
				
					});
				
					Green.setFont(new Font ("Verdana", 0, 10));

					JMenuItem Blue = new JMenuItem("Blue");
					Blue.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							DataStorage.Value = 2;
							
						}
					
						});
					
						Blue.setFont(new Font ("Verdana", 0, 10));


						JMenuItem Red = new JMenuItem("Red");
						Red.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
								
								DataStorage.Value = 3;
								
							}
						
							});
						
							Red.setFont(new Font ("Verdana", 0, 10));

							JMenuItem Yellow = new JMenuItem("Yellow");
							Yellow.addActionListener(new ActionListener(){

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									DataStorage.Value = 4;
									
								}
							
								});
							
								Yellow.setFont(new Font ("Verdana", 0, 10));

								JMenuItem Orange = new JMenuItem("Orange");
								Orange.addActionListener(new ActionListener(){

									@Override
									public void actionPerformed(ActionEvent arg0) {
										
										DataStorage.Value = 5;
										
									}
								
									});
								
									Orange.setFont(new Font ("Verdana", 0, 10));

						
									KolorMenu.add(Green);
									KolorMenu.addSeparator();
									KolorMenu.add(Blue);
									KolorMenu.addSeparator();
									KolorMenu.add(Red);
									KolorMenu.addSeparator();
									KolorMenu.add(Yellow);
									KolorMenu.addSeparator();
									KolorMenu.add(Orange);
									KolorMenu.addSeparator();
				
				
				return KolorMenu;
	}
	
	JMenu getWielkoscMenu()
	{
		JMenu WielkoscMenu = new JMenu("Ziarno");
		
		WielkoscMenu.setForeground(Color.WHITE);
		
		WielkoscMenu.setFont(new Font ("Verdana", 0, 12));
		
			final JTextField WielkoscField = new JTextField();
				
			JLabel WielkoscLabel = new JLabel("Wielkosc ziarna");
			
			WielkoscLabel.setFont(new Font("Verdana", 0, 12));
			
			WielkoscMenu.add(WielkoscLabel);
			 		
			WielkoscMenu.add(WielkoscField);
					 
					
			WielkoscMenu.addSeparator();
				
					JButton Save = new JButton("Zapisz");
					
					Save.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							DataStorage.WielkoscZiarna = Integer.parseInt(WielkoscField.getText());
							
							
						}
						
						
					});
					WielkoscMenu.add(Save);
				
				return WielkoscMenu;
		
	}

	JMenu getPeriodMenu()
	{
		JMenu PeriodMenu = new JMenu("Periodycznosc");
		
		PeriodMenu.setForeground(Color.WHITE);
		
		PeriodMenu.setFont(new Font ("Verdana",0 , 12));
				
		 JCheckBoxMenuItem Yes = new JCheckBoxMenuItem("Tak");
		 JCheckBoxMenuItem No = new JCheckBoxMenuItem("No");
		
		Yes.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				DataStorage.PeriodicBC = true;
				
			}
			
			
			
			
		});
		
		No.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

			
				DataStorage.PeriodicBC = false;
					
				
			}
			
		});
			
			PeriodMenu.add(Yes);
			PeriodMenu.add(No);
		
		return PeriodMenu;
	}

	JMenu getOtoczenieMenu()
	{
		JMenu OtoczenieMenu = new JMenu("Otoczenie");
		
		OtoczenieMenu.setForeground(Color.WHITE);
		
		OtoczenieMenu.setFont(new Font ("Verdana",0 , 12));
				
			JMenuItem Moore = new JMenuItem("Moore");
			
			Moore.setFont(new Font ("Verdana",0 , 12));
			
			Moore.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 1;
				}
				
				
			});
			
			JMenuItem VonNeuman = new JMenuItem("VonNeuman");

			VonNeuman.setFont(new Font ("Verdana",0 , 12));
			
			VonNeuman.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 2;
				}
				
				
			});

			JMenuItem VonNeumanMoore = new JMenuItem("VonNeuman + Moore");

			VonNeumanMoore.setFont(new Font ("Verdana",0 , 12));
			
			VonNeumanMoore.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 3;
				}
				
				
			});

			JMenuItem PentTop = new JMenuItem("Pentagonalne gorne ");
			
			PentTop.setFont(new Font ("Verdana",0 , 12));
			
			
			PentTop.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 4;
				}
				
				
			});

			JMenuItem PentBottom = new JMenuItem("Pentagonalne dolne ");
			
			PentBottom.setFont(new Font ("Verdana",0 , 12));
			
			PentBottom.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 5;
				}
				
				
			});

			JMenuItem PentRight = new JMenuItem("Pentagonalne prawe ");
			
			PentRight.setFont(new Font ("Verdana",0 , 12));
			
			PentRight.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 6;
				}
				
				
			});

			JMenuItem PentLeft = new JMenuItem("Pentagonalne lewe ");
			
			PentLeft.setFont(new Font ("Verdana",0 , 12));
			
			PentLeft.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 7;
				}
				
				
			});

			JMenuItem HeksRight = new JMenuItem("Heksagonalne prawe ");
			
			HeksRight.setFont(new Font ("Verdana",0 , 12));
			
			HeksRight.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 8;
				}
				
				
			});

			JMenuItem HeksLeft = new JMenuItem("Heksagonalne lewe ");
			
			HeksLeft.setFont(new Font ("Verdana",0 , 12));
			
			HeksLeft.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				
					DataStorage.Otoczenie = 9;
				}
				
				
			});

			OtoczenieMenu.add(Moore);
			OtoczenieMenu.add(VonNeuman);
			OtoczenieMenu.add(VonNeumanMoore);
			OtoczenieMenu.add(PentTop);
			OtoczenieMenu.add(PentBottom);
			OtoczenieMenu.add(PentRight);
			OtoczenieMenu.add(PentLeft);
			OtoczenieMenu.add(HeksRight);
			OtoczenieMenu.add(HeksLeft);
		return OtoczenieMenu;
	}

}
