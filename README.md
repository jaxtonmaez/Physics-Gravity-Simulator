# Physics-Simulator
This project takes information about 2 objects in space, and calculates the gravity between them and allows them to move. The 
program stops if they collide, leave the region, or seem stable after 180,000 loops. Mathematica can be used to see graphs of 
the movement. 
**************************
***Important Notes***

The UserInterface.java contains the main class and is the driver. 

DataPlotter.nb is a Mathematica File and can ONLY be used in Wolfram Mathematica! It works most the time. 

If it keeps saying there is not enough memory for the calculation, set the PrintInterval to 180,000.

If the project does not complete or has any issues running, included are images of the program working fully. They are in the 
'Example_of_Project_Working.zip' file.

**************************

Details: 

The program writes the data to three files. The 'data.txt' is a readable file with all the information labeled. The 
'MathematicaData.txt' and MathematicaData2.txt' are files readable by the 'DataPlotter.nb' file which is a Wolfram Mathematica 
notebook. Click the Open Mathematica File button, press 'Shift-Enter' while in Mathematica. This will give you a graph of the 
objects positions vs time. 

There is a Print Interval variable. Default is 1500. This means every 1500 seconds (loops), data is written into the files. If 
data were written every loop, it becomes very easy to run out of memory. Some simulations can run up to 180,000 times before 
they are stopped automatically, this means more than 900,000 lines in the text file. Don't do that, keep the Print Interval
large. 

The equation used for gravitation is just Newton's Universal Law, and has been made into a vector. This was done by multiplying
the equation by the unit vector, to have a vector in R^2. Gravity is calculated for two objects in a region once per loop, and
the time counter is increased by one. Once calculated, the amount each should move is calculated and the change in velocity is 
calculated. The loop then repeats until they either leave the region, collide, or remain steady for at least time=180,000 
seconds.  
