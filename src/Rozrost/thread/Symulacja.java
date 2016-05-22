package Rozrost.thread;

import Rozrost.storage.DataStorage;

public class Symulacja extends Thread {

	
	@Override
	public void run()
	{
		for(int i = 0; i < DataStorage.Iterations; i++){
			
			
			
			
			
			
			
			
			
			
			DataStorage.Panel.repaint();
			
			
			try {
				Thread.sleep((long) (DataStorage.AnimationLength*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.copyAll();
		}
		
	}

public void copyAll(){
	
	for(int i = 0; i < DataStorage.X_panel; i++){
		for(int j = 0; j < DataStorage.Y_panel; j++){
			
			
			DataStorage.Ziarna[i][j] = DataStorage.Next[i][j];
			
			
		}
		
		
	}

	
}

public int getValue(int Condition, int x, int y){
	
	int value;
	
	switch (Condition)
	{
	
	Condition 1:
		
	Condition 2:
	
	Condition 3:
		
	Condition 4:
	
	Condition 5:
		
	Condition 6:
		
	Condition 7:
		
	Condition 8:
		
	Condition 9:
		
	}
		
	
	
	
	return value;
	
}

}
