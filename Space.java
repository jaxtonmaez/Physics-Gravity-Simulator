/*
* Jaxton Maez
* CS 1410-02
* 12/3/19
*/

public class Space
{
	@SuppressWarnings("unused")
	private static double[][] space;
	private int height;
	private int width;
	
	public static double bigG = 6.67*Math.pow(10, -11);

	
	public Space()
	{
		space = null;
	}

	public Space(int height, int width)  //creates a field
	{
		space = new double [width][height];
		this.width = width;
		this.height = height;
	}
	public int getHeight() {return height;}
	public int getWidth() {return width;}
	
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
    
    public static double[] Move(Object ob, Object ob2)  //return deltaX and deltaY for 1&2, return the delta array
    {
        double[] gravity = Gravity(ob,ob2);
        double iComp1 = ob.getvelocX() + gravity[0]/2*ob.getMass();
        double jComp1 = ob.getvelocY() + gravity[1]/2*ob.getMass();
        double iComp2 = ob2.getvelocX() + gravity[2]/2*ob2.getMass();
        double jComp2 = ob2.getvelocY() + gravity[3]/2*ob2.getMass();
        double[] move= {iComp1,jComp1,iComp2,jComp2};
        
        ob.setX(move[0]);
        ob.setY(move[1]);
        ob2.setX(move[2]);
        ob2.setY(move[3]);
        
        return move;    
    }
    public static double[] deltaVeloc(Object ob, Object ob2)
    {
    	double[] gravity = Gravity(ob,ob2);
        double iComp1 = ob.getvelocX()+gravity[0];
        double jComp1 = ob.getvelocY()+gravity[1];
        double iComp2 = ob2.getvelocX()+gravity[2];
        double jComp2 = ob2.getvelocY()+gravity[3];
        double[] velocity = {iComp1,jComp1,iComp2,jComp2};
    	
    	ob.setvelocX(velocity[0]);
    	ob.setvelocY(velocity[1]);
    	ob2.setvelocX(velocity[2]);
    	ob2.setvelocY(velocity[3]);
        
    	return velocity;
    }
	
    

}
