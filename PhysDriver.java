/*
* Jaxton Maez
* CS 1410-02
* 11/14/19
*/
public class PhysDriver{
	
	//public static double bigG = 6.67*Math.pow(10, -11);
    public int time = 0;
	
	

	public static void main(String[] args)
	{
		
		
		Space sp = new Space(50,50);    //A square region of space with sidelegth 50;
		
		double[] obVeloc = {1,1};         //A velocity vector to send to Object.
		Object ob = new Planet("Earth", Integer.MAX_VALUE, obVeloc , sp, 30, 18);   //create an object
		
		double[] ob2Veloc = {1,1};
		Object ob2 = new Planet("Moon", Integer.MAX_VALUE/2, ob2Veloc, sp, 1, 1);
		
		Interact(ob, ob2);
		
	}
	
	public static void Interact(Object ob, Object ob2)
    {
		double a = Space.Distance(ob, ob2);
		double[] b = Space.Gravity(ob, ob2);
        double[] c = Space.Move(ob,ob2);
		System.out.println("The distance: "+a);
        System.out.println("Object One: ");
        for(int i=0; i<=1; i++)
        {System.out.println(" gravity: " +b[i]+"\n the motion: "+c[i]);}
        System.out.println("Object Two: ");
        for(int j=2; j<=3; j++)
        {System.out.println(" gravity: "+b[j]+"\n the motion: "+c[j]);}
        
        
       // double[] arr = Space.Move1(ob, ob2);
       // for(int i=0; i<=1; i++)
       //     System.out.println("object1 moves by: "+arr[i]);
       // double[] arr2 = Space.Move2(ob, ob2);
       //for(int i=0; i<=1; i++)
        //    System.out.println("object2 moves by: "+arr2[i]);
        
        
        
		
	}


}
