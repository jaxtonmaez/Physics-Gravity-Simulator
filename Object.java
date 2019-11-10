/*
* Jaxton Maez
* CS 1410-02
* 10/10/19
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class Object
{
	
	public static double bigG = 6.67*Math.pow(10, -11);

	protected String name;
	protected double mass; 
	protected double[] veloc = new double[2];  
	protected Space sp;  //Region where object is located
	protected double x;     //position of object in region
	protected double y; 
	
	
	public Object()   //the default constructor
	{
		this.name = null;
		this.mass = -1;
		this.veloc = null;
		this.sp = null;
		this.x = -1;
		this.y = -1;
		
	}
	
	public Object(String name, double mass, double[] veloc, Space sp, double x, double y) //creates an object with these parameters
	{
		this.name = name;
		this.mass = mass;
		this.veloc = veloc;
		this.sp = sp;
		this.x = x;
		this.y = y;
	}
	
	public double getMass()
	{return mass;}
	public double[] getVeloc()
	{return veloc;}
	public double getX()
	{return x;}
	public double getY()
	{return y;}
	
	
	
	public static double Gravity(Object ob, Object ob2)   //returns the gravitation attraction force between two objects
	{
		double g = -1;
		g = (bigG*(ob.getMass()*ob2.getMass()))/Math.pow(Space.Distance(ob, ob2),2);
		return g;
	}



}
