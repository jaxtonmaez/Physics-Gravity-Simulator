/*
* Jaxton Maez
* CS 1410
* 11/10/19
*/

import java.security.SecureRandom;

public class Object
{
  
  protected String name = null;
  protected double[][] position = new double[10][10];
  
  public Object(String name, double[][] position)
  {
   this.name = name;
   this.position = position;
  }
  
  public String getName()
  {return name;}
  public double[][] getPosition()
  {return position;}
  
  public void printPosition()
  {
    for(int i=0; i<position.length; i++)
    {for(int j=0; j<position.length; j++)
     {System.out.print(position[i][j]+", ");}}
  }
}
