# Assignment 1

## Functionality

Create a simple JavaFX window that allows users to choose one of 
two selections from a drop-down menu, and then select or delete them.
The selections and deletions should be shown in a messages text area
displaying what option was selected or deleted.

## Files

### app.java

Displays a "Dashboard" window with a user interface defined in the app.fxml file and functionality defined in the AppController.java file. The app class extends Application and initializes the GUI in the start method, setting up a window titled "Dashboard", and launches via the main method.

### AppController.java

Manages the interaction between the user and the graphical interface defined in the app.fxml file. It provides functionality for selecting and deleting options from a dropdown menu (ComboBox) and displaying the results in a text area (TextArea) via the handleSelect() and handleDelete() methods.

### app.fxml

Defines the layout of the UI using XML. The interface includes a dropdown menu, two buttons, and a text area, all organized within a SplitPane.

### Deployment Instructions

I used IntelliJ Community Edition to write the code for this project and Scenebuilder to design the UI. To deploy it locally on your machine, you will first need to pull the files from git,
then run the "mvnw" shell script to build the maven project.

## Screenshots

![Image](https://github.com/lcmiles/CS-420/blob/main/Assignment1/Screenshot%202024-09-10%20at%2011.15.14%E2%80%AFAM.png?raw=true)
![Image](https://github.com/lcmiles/CS-420/blob/main/Assignment1/Screenshot%202024-09-10%20at%2011.15.28%E2%80%AFAM.png?raw=true)
![Image](https://github.com/lcmiles/CS-420/blob/main/Assignment1/Screenshot%202024-09-10%20at%2011.15.34%E2%80%AFAM.png?raw=true)
![Image](https://github.com/lcmiles/CS-420/blob/main/Assignment1/Screenshot%202024-09-10%20at%2011.15.44%E2%80%AFAM.png?raw=true)



## Sources

* https://jenkov.com/tutorials/javafx/combobox.html
* https://stackoverflow.com/questions/29673188/appending-text-into-textarea
* https://www.youtube.com/watch?v=K3CenJ2bMok
* https://chatgpt.com/share/ec959ae1-f841-4573-8116-1faaa0baa30f
* https://www.youtube.com/watch?v=PPwVwpdYFeU
* https://www.youtube.com/watch?v=LMdjhuYSrqg
