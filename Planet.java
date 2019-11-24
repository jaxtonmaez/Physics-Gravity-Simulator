

public class Planet extends Object
{
	public static double bigG = 6.67*Math.pow(10, -11);
	
	public Planet()
	{
		name = null;
		mass = 0;
		veloc = null;
		sp = sp;
		x = 0;
		y = 0;
	}
    public Planet(String name, double mass, double[] veloc, Space sp, double x, double y) //creates a planet with these parameters
	{
		this.name = name;
		this.mass = mass;
		this.veloc = veloc;
		this.sp = sp;
		this.x = x;
		this.y = y;
	}
	
	
	public double getMass(){return mass;}
	public double[] getVeloc(){return veloc;}
	public double getX(){return x;}
	public double getY(){return y;}
	
/*    
	public double Gravity(Object ob, Object ob2)
    {
		double g = -1;
		g = (bigG*(ob.getMass()*ob2.getMass()))/Math.pow(Space.Distance(ob, ob2),2);
    	return 0;
	}
    */
	
}
