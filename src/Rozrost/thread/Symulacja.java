package Rozrost.thread;

import Rozrost.counter.Counter;
import Rozrost.storage.DataStorage;

public class Symulacja extends Thread {

	int red,green,blue, yellow, orange;
	@Override
	public void run()
	{
		for(int i = 0; i < DataStorage.Iterations; i++){
			
			
			for(int x = 0; x < DataStorage.X_panel ; x++){
				for(int y = 0 ; y < DataStorage.Y_panel; y++){
					
				DataStorage.Next[x][y] = this.getValue(DataStorage.Otoczenie, x, y);	
					
				}
			}
			
			this.copyAll();
			
			
			try {
				Thread.sleep((long) (DataStorage.AnimationLength*10));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			DataStorage.Panel.repaint();
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
	
	int value = 0;
	
	switch (Condition)
	{
	
	case 1:
		
		value = Moore(x, y);
		break;
		
	case 2:
	
		value = VonNeuman(x, y);
		break;
		
	case 3:
		
		value = VonNeumanMoore(x, y);
		break;
		
	case 4:
	
		value = PentTop(x, y);
		break;
		
	case 5:
		
		value = PentBottom(x, y);
		break;
		
	case 6:
		
		value = PentRight(x, y);
		break;
		
	case 7:
		
		value = PentLeft(x, y);
		break;
		
	case 8:
		
		value = HeksRight(x, y);
		break;
		
	case 9:
		value = HeksLeft(x, y);
		break;
	}
		
	return value;
	
}

public int Moore (int x, int y){
	
	
	zeroAll();
	
	for(int i = (x-1); i <= (x+1) ; i++){
		for(int j = (y-1); j <= (y+1); j++)
		{
			if(i >= DataStorage.X_panel || j >= DataStorage.Y_panel || i < 0 || j <0 ) continue;
			else setCounter(DataStorage.Ziarna[i][j]); 
			
			
		}
	}
	
	return returningValue();
	
}

public int VonNeuman (int x, int y){
	
	
	zeroAll();
	
	for(int i = (x-1); i <= (x+1) ; i++){
		
			if(i >= DataStorage.X_panel || (y+1) >= DataStorage.Y_panel || i < 0 || (y+1) <0 ) continue;
			else setCounter(DataStorage.Ziarna[i][y]);
			
			
	}
	for(int j = (y-1); j <= (y+1); j++)
	{
		if(x+1 >= DataStorage.X_panel || j >= DataStorage.Y_panel || (x+1) < 0 || j <0 ) continue;
		else setCounter(DataStorage.Ziarna[x][j]);
		
		
	}
	
	return returningValue();
	
	
	
}

public int VonNeumanMoore (int x, int y){
	zeroAll();
	
	if((x+2) < DataStorage.X_panel) setCounter(DataStorage.Ziarna[x+2][y]);
	
	if((x-2) > 0 ) setCounter(DataStorage.Ziarna[x-2][y]);
	
	if( (y-2) > 0) setCounter(DataStorage.Ziarna[x][y-2]);
	
	if( (y+2) < DataStorage.Y_panel) setCounter(DataStorage.Ziarna[x][y+2]);
	
	for(int i = (x-1); i <= (x+1) ; i++){
		
		if(i >= DataStorage.X_panel || (y+1) >= DataStorage.Y_panel || i < 0 || (y+1) <0 ) continue;
		else Counter.setCounter(DataStorage.Ziarna[i][y]);
		
		
	}
	for(int j = (y-1); j <= (y+1); j++)
	{
		if(x+1 >= DataStorage.X_panel || j >= DataStorage.Y_panel || (x+1) < 0 || j <0 ) continue;
		else Counter.setCounter(DataStorage.Ziarna[x][j]);
	
	
	}
	
	return returningValue();
	
}	
public int PentTop (int x, int y){
	
	zeroAll();
	
	for(int j = (y-1); j <= (y+1); j++)
	{
		if(j >= DataStorage.Y_panel || j <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[x][j]);		
		}
			
	}
	for(int j = (y-1); j <= (y+1); j++)
	{
		if((x-1) < 0 || j >= DataStorage.Y_panel || j <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[x-1][j]);		
		}
			
	}
	
	return returningValue();
}
public int PentBottom (int x, int y){
zeroAll();
	
	for(int j = (y-1); j <= (y+1); j++)
	{
		if(j >= DataStorage.Y_panel || j <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[x][j]);		
		}
			
	}
	for(int j = (y-1); j <= (y+1); j++)
	{
		if( (x+1) >= DataStorage.X_panel || j >= DataStorage.Y_panel || j <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[x+1][j]);		
		}
			
	}
	
	return returningValue();
}
public int PentRight (int x, int y){
zeroAll();
	
	for(int i = (x-1); i <= (x+1); i++)
	{
		if(i >= DataStorage.X_panel || i <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[i][y]);		
		}
			
	}
	for(int i = (x-1); i <= (x+1); i++)
	{
		if( (y+1) >= DataStorage.X_panel || i >= DataStorage.X_panel || i <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[i][y+1]);		
		}
			
	}
	
	return returningValue();
	
}	
public int PentLeft (int x, int y){
zeroAll();
	
	for(int i = (x-1); i <= (x+1); i++)
	{
		if(i >= DataStorage.X_panel || i <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[i][y]);		
		}
			
	}
	for(int i = (x-1); i <= (x+1); i++)
	{
		if( (y-1) < 0 || i >= DataStorage.X_panel || i <0 ) continue;
		else{ 
			setCounter(DataStorage.Ziarna[i][y-1]);		
		}
			
	}
	
	return returningValue();
	
}	
public int HeksRight (int x, int y){
	
	zeroAll();
	
	
	return returningValue();
}
public int HeksLeft (int x, int y){
	zeroAll();
	
	
	
	return returningValue();
}	

public void zeroAll(){
	
	red =0;
	blue=0;
	green = 0;
	orange = 0;
	yellow = 0;
	
}

public void setCounter(int val)
{
	switch(val){
	
	case 1:
		green ++;
		break;
	
	case 2:
		blue ++;
		break;
	
	case 3:
		red ++;
		break;
	
	case 4:
		yellow ++;
		break;
	
	case 5:
		orange ++;
		break;
	default:
		break;
	
	}
	
	
	
}

public int returningValue(){
	
	int g = green;
	int b = blue;
	int r = red;
	int o = orange;
	int y = yellow;
	
	if(g > b && g >r && g > o && g > y) return 1;
	else if(b > g && b > r && b > o && b > y) return 2;
	else if(r > g && r > b && r > 0 && r > y) return 3;
	else if( o > g && o > b && o > r && o > y ) return 4;
	else if( y > g && y > b && y > r && y > o ) return 5;
	else return 0;
	
}
}
