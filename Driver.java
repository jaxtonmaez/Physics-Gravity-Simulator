/*
* Jaxton Maez
* CS 1410
* 11/10/19
*/

import java.security.SecureRandom;

public class Driver
{
  public static void main(String[] args)
  {
    double aPos[][] = {{1,2},{1,1}};
    Object a = new Object("Mars", aPos);
    
   //a.printPosition();
    
   // double arr[][] = a.getPosition();
   // System.out.println(arr);
      
    a.move(aPos, 9);
    a.printPosition();
  }
}

