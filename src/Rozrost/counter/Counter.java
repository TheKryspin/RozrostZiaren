package Rozrost.counter;

import Rozrost.storage.DataStorage;

public class Counter {

	public static int green, blue, red, yellow, orange;
	
	public static int Moore (int x, int y){
		
		Counter.zeroAll();
		
		for(int i = (x-1); i <= (x+1) ; i++){
			for(int j = (y-1); j <= (y+1); j++)
			{
				if(i >= DataStorage.X_panel || j >= DataStorage.Y_panel || i < 0 || j <0 ) continue;
				else Counter.setCounter(DataStorage.Ziarna[i][j]);
				
				
			}
		}
		
		return Counter.returningValue();
		
	}
	
	public static int VonNeuman (int x, int y){
		
		
		Counter.zeroAll();
		
		for(int i = (x-1); i <= (x+1) ; i++){
			
				if(i >= DataStorage.X_panel || (y+1) >= DataStorage.Y_panel || i < 0 || (y+1) <0 ) continue;
				else Counter.setCounter(DataStorage.Ziarna[i][y]);
				
				
		}
		for(int j = (y-1); j <= (y+1); j++)
		{
			if(x+1 >= DataStorage.X_panel || j >= DataStorage.Y_panel || (x+1) < 0 || j <0 ) continue;
			else Counter.setCounter(DataStorage.Ziarna[x][j]);
			
			
		}
		
		return Counter.returningValue();
		
		
		
	}
	
	public static int VonNeumanMoore (int x, int y){
		Counter.zeroAll();
		
		if((x+2) < DataStorage.X_panel && y < DataStorage.Y_panel) Counter.setCounter(DataStorage.Ziarna[x+2][y]);
		
		if((x-2) > 0 && y < DataStorage.Y_panel) Counter.setCounter(DataStorage.Ziarna[x-2][y]);
		
		if(x < DataStorage.X_panel && (y-2) > 0) Counter.setCounter(DataStorage.Ziarna[x][y-2]);
	}	
	public static int PentTop (int x, int y){
		
		
		
		
		
	}
	public static int PentBottom (int x, int y){
		
		
		
		
		
	}
	public static int PentRight (int x, int y){
		
		
		
		
		
	}	
	public static int PentLeft (int x, int y){
		
		
		
		
		
	}	
	public static int HeksRight (int x, int y){
		
		
		
		
		
	}
	public static int HeksLeft (int x, int y){
		
		
		
		
		
	}	
	
	public static void zeroAll(){
		
		Counter.red =0;
		Counter.blue=0;
		Counter.green = 0;
		Counter.orange = 0;
		Counter.yellow = 0;
		
	}
	
	public static void setCounter(int val)
	{
		switch(val){
		
		case 1:
			Counter.green ++;
			break;
		
		case 2:
			Counter.blue ++;
			break;
		
		case 3:
			Counter.red ++;
			break;
		
		case 4:
			Counter.yellow ++;
			break;
		
		case 5:
			Counter.orange ++;
			break;
		
		default:
			break;
		
		}
		
		
		
	}
	
	public static int returningValue(){
		
		int g = Counter.green;
		int b = Counter.blue;
		int r = Counter.red;
		int o = Counter.orange;
		int y = Counter.yellow;
		
		if(g > b && g >r && g > o && g > y) return 1;
		else if(b > g && b > r && b > o && b > y) return 2;
		else if(r > g && r > b && r > 0 && r > y) return 3;
		else if( o > g && o > b && o > r && o > y ) return 4;
		else if( y > g && y > b && y > r && y > o ) return 5;
		else return 0;
		
	}
}
