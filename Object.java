/*
* Jaxton Maez
* CS 1410-02
* 12/3/19
*/

public abstract class Object
{
    	
	public static double bigG = 6.67*Math.pow(10, -11);

	protected String name;
	protected double mass;   
	protected Space sp;     //Region where object is located
	protected double x;     //position of object in region
	protected double y;
	protected double velocX;
	protected double velocY;
	
	public abstract double getMass();
	public abstract double getvelocX();
	public abstract double getvelocY();
	public abstract double getX();
	public abstract double getY();
	public abstract void setName(String name);
	public abstract void setMass(double mass);
    public abstract void setX(double x);
    public abstract void setY(double y);
    public abstract void setvelocX(double velocX);
    public abstract void setvelocY(double velocY);
	

}
