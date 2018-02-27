This is the GUI team!

Author:
Ioanna Deni
Version:
2/27/2018

Members of the Team:
Ioanna Deni
Emilyann Nault
Sneha Kanaujia
Jaemarie Solyst
Kiera McCabe

The purpose of this team is to create a visualization of the geometrical shapes and apply functions of the Geometry Application for the software development project of Data Structures 211 of the spring semester of 2018. Further the GUI team for the completion of the visualization and for the programmers’ friendly use has created controllers to supplement the functions’ applications on the Java Objects.

How to use our code:
GitHub is an open source repository of code written in many programming languages, we wrote in Java using Eclipse Oxygen in 2018 and made our code available to all. We would advise to use eclipse as a tool when opening our code and also download the plug-in window builder in eclipse which downloads necessary libraries for the visualization of the buttons.   

What is in our code:
1.The window/View class:
The view class initiates the application and all objects necessary for the visualization of the drawings and the application of the functions. The pop up window that is generated is a JFrame object and is divided into 5 parts, the two top panels, one of which is the menuBar and the other is the toolbar hosting the icons/buttons as shortcuts for the users’ convenience but also for aesthetics. The main area of the frame is hosting another class that is a canvas object that has its own listeners and retrieval/storing drawings methods. Lastly, the frame contains a side toolbar with shortcuts of geometrical shapes of functions at the left side of the window and at the bottom of the window a label informing the user in which canvas the activity is taking place (goal is to be able to work in more than one workspaces/canvases). This class holds no logic but rather instantiate the object that hold the logic of the application. This class though provides a constant “paint” and “update” method (**NOT YET PRESENT**) for the continuing interaction of the user with the functions of the application.
2.The CanvasControl class:
**THIS IS TO BE EDITED**
3.The ButtonControl class:
**THIS IS TO BE EDITED**    

For the other COMCS211 teams:
In the case of adding functionality and objects on top of the visualization the GUI team would like you to place your function in the right controller and comment with big capital letters your addition so we can work on making it seen by the user. There are two different controllers for the update of the window class. The CanvasControl class is designed as a canvas with its own mouse listeners and its own communication with the data base. If your function is altering manipulating or drawing shapes/objects on the surface then add your function on the bottom of the controller class. If the functionality you are adding is responsible for exporting or importing objects or drawings in the application but not the canvas then add your function on the bottom of the ButtonController class. This class is responsible for accessing the objects on the canvas and altering their dimension or for selecting different modes and extracting information about the current state of the canvas. If there is a problem or you would like to be advised on where to add your code contact deni22i@mtholyoke.edu to be directed to the author responsible for the class we would prefer you to edit.

Citing the GUI authors: 
It has been a continuing struggle for programmers to maintain the credibility among their peers and their mentors thus the GUI team would like to propose the following criteria for citing and using the GUI code in order to minimize violating coders’ rights and also allowing the coders to claim credibility for their hard work. Firstly, if you are adding a function or another small section of code announce it with a small caption with capital letter and have a small introduction after /** saying what your function does, who wrote that and what version this is. If you are adding a whole class (ex. an object class ) and then initiating in one of the GUI controllers again announce it with capital letters in the instantiation but also make sure that in the new class you have a description of what the class does, who wrote that and what version this is. If you are updating a part that is either your teams’ or another teams’ have after the code // and your name and version, do not leave an extra line but rather comment directly after the code. The GUI team will constantly updating and altering the versions to improve it and maintain the application’s functionality but we will be specifically careful to maintain the contributions of the other teams on our classes. We would ask the same of you and since you are starting with our platform as a prototype be gentle and cite us for our hard work and effort to initiate this project.

Problems faced so far and remain unsolved.
The team unfortunately has not resolved the problem of the Java libraries. It came to our attention that certain libraries build in windowBuilder were not available across all of our PC’s. When generating the buttons and mainly the buttons icons there where some reference libraries used from classpaths inside eclipse’s workspace that were automatically build in some windowBuilders and not others. We hold download jar files of some of those extensions but not all thus we are still in search of how we could manually add .settings and .reference folders in the MACOX workspace. If you are facing the same problem when running the GUI code then contact us and we will update you on our process but first make sure that the dot files are not hidden from the user (that is you) if they are we can’t access what the eclipse on the specific PC is generating. If you have hidden dot files you should unhidden it first and google knows how.

For more information contact deni22i@mtholyoke.edu.  

 
