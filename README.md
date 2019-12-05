# Physics-Simulator

The UserInterface.java contains the main class and is the driver. 

The program writes the data to two files. The 'data.txt' file is a readable file with all the information labeled. The 
'Mathematica'.txt is a file readable by Mathematica using the Import[file] command, which can then be plotted using
ListPlot[data]. These files are found in the main project folder. They are reset each time the program runs, and must be copied
into a separate folder if they are to be kept.

There is a Print Interval variable. Default is 3600. This means every 3600 seconds (loops), data is written into the files. If 
data were written every loop, it becomes very easy to run out of memory. Some simulations can run up to 180,000 times before 
they are stopped automatically, this means more than 900,000 lines in the text file. Don't do that, keep the Print Interval
large. 

The equation used for gravitation is just Newton's Universal Law, and has been made into a vector. This was done by multiplying
the equation by the unit vector, to have a vector in R^2. Gravity is calculated for two objects in a region once per loop, and
the time counter is increased by one. Once calculated, the amount each should move is calculated and the change in velocity is 
calculated. The loop then repeats until they either leave the region, collide, or remain steady for at least time=180,000 
seconds.  

As such, the data is very chaotic. Admittedtly, Newton's Universal Law of Gravitation may not have been the best choice of
equation for this application. But any higher level gravity equation would be very complex to solve here.
