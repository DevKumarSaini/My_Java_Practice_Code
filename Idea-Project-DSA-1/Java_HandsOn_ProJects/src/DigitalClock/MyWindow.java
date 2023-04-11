package DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {  // To Extending JFrame we can access all of its methods and variables in our class using Inheritance

    private JLabel heading;
    private JLabel clocklable;
    private Font font = new Font("Arial",Font.BOLD,35);



    // This is constructor which is constructed your Dialog Box frame
    // super keyword is used because we use all the properties of JFrame Class using Inheritance and super points the base class (JFrame Class)
    MyWindow(){
        super.setTitle("My Digital Clock");             // This can be setting title on your displayed dialog Box
        super.setSize(500,400);   // This can adjust your size of your windows
        super.setLocation(300,100);       // This maintains your display position on you screen
        this.createGUI();                       // This constructor is invoking the GUI function of this class
        this.startClock();                      // After creating our full clock gui we can call startClock to display our clock
        super.setVisible(true);                // This helps to display all your changes done in your windows (Dialog Box)
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setResizable(false);
    }

    public void createGUI(){

        // Creating Object
        heading = new JLabel("My Clock");  // Creating Object of heading instance variable of class
        clocklable = new JLabel("Clock");  // Creating Object of clocklable instance variable of class

        // Setting fonts on variable
        heading.setFont(font);                  // Setting font in heading variable
        clocklable.setFont(font);               // Setting font in clocklable variable

        // partitioning our GUI into two phases
        this.setLayout(new GridLayout(2,1));  // this can partition our windows into 1 column and 2 rows
        this.add(heading);
        this.add(clocklable);

    }

    public void startClock(){
     Timer timer = new Timer(1, new ActionListener() {  // Here ActionListener is a anonymous class(Interface) which have no class name and we override its method in child class
         @Override
         public void actionPerformed(ActionEvent e) {
             // Date is a class which is present in java.util package
//             String dateTime = new Date().toString();  // We can derive  Date and time from Date class in a string format
             Date d = new Date();
             SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss SS");
             String dateTime=sdf.format(d);

             clocklable.setText(dateTime);
         }
     });
     timer.start();
    }
}
