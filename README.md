# PopularityOfBabyNames
Q) Write a program that reads a file (babyNames.txt) containing data about the popularity of various baby names over time and displays the data about a particular name. 
Each line of the file stores a name followed by integers representing the name’s popularity in each decade: 1900, 1910, 1920, and so on. The rankings range from 1 (most popular) to 1000 (least popular), or 0 for a name that was less popular than the 1000th name. The following lines are a sample of the file format:

Sally 0 0 0 0 0 0 0 0 0 0 886 <br/>
Sam 58 69 99 131 168 236 278 380 467 408 466 <br/>
Samantha 0 0 0 0 0 0 272 107 26 5 7 <br/>
Samir 0 0 0 0 0 0 0 0 920 0 798 <br/>
Your program should prompt the user for a name and search the file for that name:
This program allows you to search through the data from the Social Security Administration
to see how popular a particular name has been
since 1900.
<br/>
Name? Sam
If the name is found, the program should display data about the name on the screen:
<br/>
Statistics on name "Sam" <br/>
1900: 58 <br/>
1910: 69 <br/>
1920: 99 <br/>
1930: 131 <br/>
... <br/>

Your program should work correctly regardless of the capitalization the user uses to type the name.  For example, if the user asks you to search for "LISA" or "lisa", you should find it even though the input file has it as "Lisa".  
