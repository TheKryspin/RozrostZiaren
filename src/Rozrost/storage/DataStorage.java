package Rozrost.storage;

import Rozrost.gui.KolorText;
import Rozrost.gui.OtoczenieText;
import Rozrost.gui.PeriodycznoscText;
import Rozrost.gui.PoleZiaren;

public class DataStorage {

	public static int X_frame = 650;
	public static int Y_frame = 550;
	
	public static int X_panel = 500;
	public static int Y_panel = 500;

	public static int Side_x = 150;
	public static int Side_y = 550;
	
	public static int WielkoscZiarna = 5;
	public static int Value = 1;
	
	public static PoleZiaren Panel;
	public static KolorText KolorField = null;
	public static PeriodycznoscText PeriodycznoscField = null;
	public static OtoczenieText OtoczenieField = null;
	
	public static double AnimationLength;
	public static int Iterations;
	
	public static int YesCounter = 0;
	public static int NoCounter = 0;
	
	public static int[][] Ziarna = new int[X_panel][Y_panel];
	public static int[][] Next = new int[X_panel][Y_panel];
	
	public static boolean PeriodicBC = false;
	public static int Otoczenie = 0;	
	
	
	
}
