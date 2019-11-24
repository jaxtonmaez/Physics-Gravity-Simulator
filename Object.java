/*
* Jaxton Maez
* CS 1410-02
* 10/10/19
*/

import java.security.SecureRandom;
import java.util.Scanner;

public abstract class Object
{
    	
	public static double bigG = 6.67*Math.pow(10, -11);

	protected String name;
	protected double mass; 
	protected double[] veloc = new double[2];  
	protected Space sp;  //Region where object is located
	protected double x;     //position of object in region
	protected double y;
    protected double[] position = new double[2];   //change x and y to array position
	
	public abstract double getMass();
	public abstract double[] getVeloc();
	public abstract double getX();
	public abstract double getY();
	
	//public abstract double Gravity(Object ob, Object ob2);   //returns the gravitation attraction force between two objects
}
