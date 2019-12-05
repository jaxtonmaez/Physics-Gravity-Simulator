/*
* Jaxton Maez
* CS 1410-02
* 12/3/19
*/

public class Planet extends Object
{
	public static double bigG = 6.67*Math.pow(10, -11);
	
	public Planet()
	{
		name = null;
		mass = 0;
		sp = null;
		x = 0;
		y = 0;
		velocX = 0;
		velocY = 0;
	}
    public Planet(String name, double mass, double velocX, double velocY, Space sp, double x, double y) //creates a planet with these parameters
	{
		this.name = name;
		this.mass = mass;
		this.velocX = velocX;
		this.velocY = velocY;
		this.sp = sp;
		this.x = x;
		this.y = y;
	}
	
	
	public double getMass(){return mass;}
	public double getvelocX(){return velocX;}
	public double getvelocY(){return velocY;}
	public double getX(){return x;}
	public double getY(){return y;}
	public void setName(String name) {this.name=name;}
	public void setMass(double mass) {this.mass = mass;}
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public void setvelocX(double velocX){this.velocX = velocX;}
    public void setvelocY(double velocY) {this.velocY = velocY;}
	

	
}
