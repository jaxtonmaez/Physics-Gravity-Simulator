/*
* Jaxton Maez
* CS 1410-02
* 10/10/19
*/
public class PhysDriver{
	
	public static double bigG = 6.67*Math.pow(10, -11);
	
	

	public static void main(String[] args)
	{
		
		
		Space sp = new Space(50,50);    //A square region of space with sidelegth 50;
		
		double[] obVeloc = {0,0};         //A velocity vector to send to Object.
		Object ob = new Object("Earth", 999999, obVeloc , sp, 10, 10);   //create an object
		
		double[] ob2Veloc = {1,0};
		Object ob2 = new Object("Moon", 999999, obVeloc, sp, 0, 0);
		
		Interact(ob, ob2);
		
	}
	
	public static void Interact(Object ob, Object ob2)
	{
		double a = Space.Distance(ob, ob2);
		double b = Object.Gravity(ob, ob2);
		System.out.println("The distance: "+a);
		System.out.println("The gravity: " +b);
		
		
	}


}
