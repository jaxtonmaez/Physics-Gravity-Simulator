
import java.security.SecureRandom;

public class Space
{
	private int[][] space;
	private int height;
	private int width;
	public int time = 0;    //plan for a loop in the driver, where every time all values are calculated time++. 
	
	public static double bigG = 6.67*Math.pow(10, -11);
	
	
	public Space()
	{
		space = null;
	}

	public Space(int height, int width)  //creates a field
	{
		space = new int [width][height];
		this.width = width;
		this.height = height;
	}
	
	public static double Distance(Object ob, Object ob2) //returns distance between two objects
	{
		double distance  = -1;
		distance = Math.sqrt(Math.pow((ob.getX() - ob2.getX()),2)+Math.pow((ob.getY() - ob2.getY()),2));
		return distance;
	}
	

	public double[] Move(Object ob, Object ob2)  //move for one object at a time. Use ob.Move() and ob2.Move().
	{
		double r = Space.Distance(ob, ob2);
		double b = Object.Gravity(ob, ob2);
		
		double accelA = (bigG*ob2.getMass())/r;
		double accelB = (bigG*ob.getMass())/r;
		
		//double finalVelocXa = obVeloc[0] + accelA * time;
		//double finalVelocYa = ob.getVeloc() ;
		
		
		for(int i = 0; i <1; i++)
		{
		
		}
		
		
		
		
		
		return null;
	}

}
