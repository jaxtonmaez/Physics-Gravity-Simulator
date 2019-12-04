import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPanel;

/*
* Jaxton Maez
* CS 1410-02
* 12/3/19
*/
public class PhysDriver extends JPanel{
	

    public static int time = 0;       //create a time counter in seconds
    public static int timeStamp = 3600;  //ask user for time intervals to print data. default once an hour
    public static String data = null; //create empty string that will be written into data.txt
    public static String data2 = null;
    


	public static void run() throws IOException
	{
		Space sp = new Space(10000,10000);    //A square region of space with side length 50;
		double maxDistance = Math.pow(Math.pow(sp.getHeight(),2)+Math.pow(sp.getWidth(), 2),2); //max distance of region
								//name    mass    vX  vY      Position
		Object ob = new Planet("Earth", 300000, 10, 10, sp, 100000, 100000);   //create an object
		Object ob2 = new Planet("Mars", 200000, 0, 0, sp, 1, 1);
		
	    BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));  //make a writer for readable data.txt
	    BufferedWriter writer2 = new BufferedWriter(new FileWriter("MathematicaData.txt"));
			
		do{
			Interact(ob, ob2);    //send objects to interact, until they collide or leave region
		    if(time%timeStamp == 0) {
			writer.write(data);   //write data to file
			writer2.write(data2);
		    }
		}
		while(Space.Distance(ob, ob2)>=1 && Space.Distance(ob, ob2)<=maxDistance && time<=151200);
        		
		if(Space.Distance(ob, ob2)<=1)
			{System.out.println("\nObjects have collided after "+time+" seconds, which is about "+time/60/60+" hours.");
			data = "\nObjects have collided after "+time+" seconds, which is about "+time/60/60+" hours.";
			writer.write(data);}
		if(Space.Distance(ob, ob2)>=maxDistance)
			{System.out.println("\nObjects have left the region after "+time+" seconds, which is about "+time/60/60+" hours.");
			data = "\nObjects have left the region after "+time+" seconds, which is about "+time/60/60+" hours.";
			writer.write(data);}
		if(time>=151200)
			{System.out.println("\nObjects appear to be stable after about "+time/60/60+" hours");
			data = "\nObjects appear to be stable after about "+time/60/60+" hours";
			writer.write(data);}
		writer.close();
		writer2.close();
	}
		
	public static void Interact(Object ob, Object ob2)
    {
		time++;
		double distance = Space.Distance(ob, ob2);
		double[] gravity = Space.Gravity(ob, ob2);
        double[] delatVeloc = Space.deltaVeloc(ob,ob2); //velocity MUST be calculated before move method
        double[] move = Space.Move(ob,ob2);       //by using move(), gravity changes which is necessary for deltaVeloc()
              
		System.out.println("The distance: "+distance);
        System.out.println("Object One: ");
        for(int i=0; i<=1; i++)
        {System.out.println(" gravity: " +gravity[i]+"\n the motion: "+move[i]+"\n the velocity: "+delatVeloc[i]);}
        System.out.println("Object Two: ");
        for(int j=2; j<=3; j++)
        {System.out.println(" gravity: "+gravity[j]+"\n the motion: "+move[j]+"\n the velocity: "+delatVeloc[j]);}
  
        data = "\nDistance: "+distance+"\nTime: "+time+" seconds \nObject One: \t X gravity: "
        +gravity[0]+"\t X motion: "+move[0]+"\t X velocity: "+delatVeloc[0]
        +"\n\t\t\t\t Y gravity: " +gravity[1]+"\t Y motion: "+move[1]+"\t Y velocity: "+delatVeloc[1]
        +"\nObject Two: \t X gravity: " +gravity[2]+"\t X motion: "+move[2]+"\t X velocity: "+delatVeloc[2]
        +"\n\t\t\t\t Y gravity: " +gravity[3]+"\t Y motion: "+move[3]+"\t Y velocity: "+delatVeloc[3];  //put information into String data
        
        data2 =+ob.getvelocX()+", "+ob.getvelocY()+"\n"; 
	}


}
