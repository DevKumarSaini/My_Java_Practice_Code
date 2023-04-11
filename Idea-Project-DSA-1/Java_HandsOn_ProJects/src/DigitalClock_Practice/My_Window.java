package DigitalClock_Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.Date;

public class My_Window extends JFrame{ // Jframe is Gui Class

    private JLabel heading;
    private JLabel clockLable;
    private Font font = new Font("",Font.BOLD,35);


    My_Window(){ // Constructor of Windows class which makes gui Dialog Box
    super.setTitle("My Clock");
    super.setSize(400,400);
    super.setLocation(300,300);
    super.setResizable(false);

    this.createGUI();  // this is local method which is making GUI
    this.startClock();
        super.setVisible(true);
    }

    // Creating GUI
    public void createGUI(){
        heading = new JLabel("My Clock");  // Making Object of JLable
        clockLable = new JLabel("Clock");  // Making Object of JLable

        heading.setFont(font);       // Setting Font reference
        clockLable.setFont(font);    // Setting Font reference

        //-----------------------------------------------------
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLable);
    }

    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clockLable.setText(dateTime);
            }
        });
        timer.start();
    }
}
