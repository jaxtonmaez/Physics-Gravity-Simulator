/*
* Jaxton Maez
* CS 1410-02
* 12/3/19
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Physics extends JPanel{
	
    public static int time = 0;                 //create a time counter in seconds
    public static int PrintInterval = 3600;      //ask user for time intervals to print data. default once an hour
    public static String data = null;           //create empty string that will be written into data.txt
    public static String data2 = null;
    public static String data3 = null;
    public static Space sp = new Space(10000,10000);    //A region of space with size 10000,10000;
	public static double maxDistance = Math.pow(Math.pow(sp.getHeight(),2)+Math.pow(sp.getWidth(), 2),0.5); //max distance of two objects can be apart.  

	public static String run(Object ob, Object ob2) throws IOException
	{
		time = 0;
	    BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));  //make a writer for readable data.txt
	    BufferedWriter writer2 = new BufferedWriter(new FileWriter("MathematicaData.txt"));
	    BufferedWriter writer3 = new BufferedWriter(new FileWriter("MathematicaData2.txt"));
			
		do{
			Interact(ob, ob2);              //send objects to interact, until they collide or leave region
		    if(time%PrintInterval == 0) {
			writer.write(data);             //write data to file
			writer2.write(data2);
			writer3.write(data3);
		    }
		}
		while(Space.Distance(ob, ob2)>=1 && Space.Distance(ob, ob2)<=maxDistance && Space.Distance(ob, ob2)>0 && time<=180000);
        		
		if(Space.Distance(ob, ob2)<=1)
			{System.out.println("\nObjects have collided after "+time+" seconds, which is about "+time/60/60+" hours.");    //print different statements 
			data = "\nObjects have collided after "+time+" seconds, which is about "+time/60/60+" hours.";                  //depending on what the objects do.
			writer.write(data);}
		if(Space.Distance(ob, ob2)>=maxDistance)
			{System.out.println("\nObjects have left the region after "+time+" seconds, which is about "+time/60/60+" hours.");
			data = "\nObjects have left the region after "+time+" seconds, which is about "+time/60/60+" hours.";
			writer.write(data);}
		if(time>=180000)
			{System.out.println("\nObjects appear to be stable after about "+time/60/60+" hours.");
			data = "\nObjects appear to be stable after about "+time/60/60+" hours";
			writer.write(data);}
		writer.close();
		writer2.close();
		writer3.close();
		return data;
	}
		
	public static void Interact(Object ob, Object ob2)
    {
		time++;
		double distance = Space.Distance(ob, ob2);
		double[] gravity = Space.Gravity(ob, ob2);
        double[] delatVeloc = Space.deltaVeloc(ob,ob2);           //velocity MUST be calculated before move method
        double[] move = Space.Move(ob,ob2);                       //by using move(), gravity changes which is necessary for deltaVeloc()
              
		System.out.println("The distance: "+distance);
        System.out.println("Object One: ");
        for(int i=0; i<=1; i++)
        {System.out.println(" gravity: " +gravity[i]+"\n the motion: "+move[i]+"\n the velocity: "+delatVeloc[i]);}
        System.out.println("Object Two: ");
        for(int j=2; j<=3; j++)
        {System.out.println(" gravity: "+gravity[j]+"\n the motion: "+move[j]+"\n the velocity: "+delatVeloc[j]);}
  
        data = "\nDistance: "+distance+"\nTime: "+time+" seconds \nObject One: \t X gravity: "
        +gravity[0]+"\t X motion: "+move[0]+"\t X velocity: "+delatVeloc[0]
        +"\n\t\t Y gravity: " +gravity[1]+"\t Y motion: "+move[1]+"\t Y velocity: "+delatVeloc[1]
        +"\nObject Two: \t X gravity: " +gravity[2]+"\t X motion: "+move[2]+"\t X velocity: "+delatVeloc[2]
        +"\n\t\t Y gravity: " +gravity[3]+"\t Y motion: "+move[3]+"\t Y velocity: "+delatVeloc[3];           //put information into String data
        
        data2 =+ob.getX()+", "+ob.getY()+", "+time+"\n"; 
        data3 =+ob2.getX()+", "+ob2.getY()+", "+time+"\n";  
	}
	public static void setPrintInterval(int Interval) {Physics.PrintInterval = Interval;}


}
