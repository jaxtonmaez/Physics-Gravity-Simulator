
import java.security.SecureRandom;

public class Space
{
	private static int[][] space;
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
    
    public static double[] Gravity(Object ob, Object ob2)
    {
       
        double iComp1 = (bigG*ob.getMass()*ob2.getMass()*(ob2.getX()-ob.getX()))/Math.pow(Math.pow(ob2.getX()-ob.getX(),2) + Math.pow(ob2.getY()-ob.getY(),2),1.5);
        double jComp1 = (bigG*ob.getMass()*ob2.getMass()*(ob2.getY()-ob.getY()))/Math.pow(Math.pow(ob2.getX()-ob.getX(),2) + Math.pow(ob2.getY()-ob.getY(),2),1.5);
        double iComp2 = (bigG*ob.getMass()*ob2.getMass()*(ob.getX()-ob2.getX()))/Math.pow(Math.pow(ob.getX()-ob2.getX(),2) + Math.pow(ob.getY()-ob2.getY(),2),1.5);
        double jComp2 = (bigG*ob.getMass()*ob2.getMass()*(ob.getY()-ob2.getY()))/Math.pow(Math.pow(ob.getX()-ob2.getX(),2) + Math.pow(ob.getY()-ob2.getY(),2),1.5);
        double[] gravity = {iComp1,jComp1,iComp2,jComp2}; //return array with index 1,2 be ob1, and index 3,4 be ob2 gravity.
        
        return gravity;
    }
    
    public static double[] Move(Object ob, Object ob2)
    {
        double[] gravity = Gravity(ob,ob2);
        double[] veloc1 = ob.getVeloc();
        double iComp1 = veloc1[0] + gravity[0]/2*ob.getMass();
        double jComp1 = veloc1[1] + gravity[1]/2*ob.getMass();
        double iComp2 = veloc1[0] + gravity[2]/2*ob2.getMass();
        double jComp2 = veloc1[1] + gravity[3]/2*ob2.getMass();
        double[] move = {iComp1,jComp1,iComp2,jComp2};
        
        return move;    
    }
	
/*
	public static double[] Move1(Object ob, Object ob2)  //move for object1
	{	
		double accel1 = ob.Gravity(ob, ob2)/ob.getMass();
		//double finalVelocXa = obVeloc[0] + accelA * time;
		//double finalVelocYa = ob.getVeloc() ;
		double[] deltaX1 = {0,0};      //assume time passed is always 1s;
        
	   for(int i=0; i<=1; i++)
        {   
        double[] veloc1 = ob.getVeloc();
        deltaX1[i] = veloc1[i] + .5*accel1;  
        }
		
    return deltaX1;
	}
    public static double[] Move2(Object ob, Object ob2)     //Move method for object 2
	{	
		double accel2 = ob.Gravity(ob, ob2)/ob2.getMass();
		
		//double finalVelocXa = obVeloc[0] + accelA * time;
		//double finalVelocYa = ob.getVeloc() ;
        //assume time passed is always 1s;
       double[] deltaX2 = {0,0};
        
	   for(int i=0; i<=1; i++)
        {   
        double[] veloc2 = ob2.getVeloc(); 
        deltaX2[i] = veloc2[i] + .5*accel2;
        }
		
    return deltaX2;
	}
    */
    

}
