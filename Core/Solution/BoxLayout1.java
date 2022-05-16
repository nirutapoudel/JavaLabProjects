package Core.Solution;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

    public class BoxLayout1 extends Frame {
        Button buttons[];

        public BoxLayout1 () {
            buttons = new Button [6];
            Panel container = new Panel();
            Panel container2 = new Panel();
            Panel container3 = new Panel();


            buttons[0]= new Button("West");
            buttons[2]= new Button("Center");
            buttons[3]= new Button("East");
            container.add(buttons[0]);
            container.add(buttons[2]);
            container.add(buttons[3]);

            buttons[5]=new Button("South");
            buttons[1]=new Button("North");
            container2.add(buttons[1]);
            container3.add(buttons[5]);
            add(container2);
            add(container);
            add(container3);
            container2.setLayout(new BoxLayout(container2,BoxLayout.X_AXIS));
            container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));
            container3.setLayout(new BoxLayout(container3,BoxLayout.X_AXIS));
            // the buttons will be placed horizontally
            setLayout (new BoxLayout (this, BoxLayout.PAGE_AXIS));
            setSize(400,400);
            setVisible(true);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e){
                    dispose();
                }
            });
        }
        // main method
        public static void main(String args[]) {
            BoxLayout1 b=new BoxLayout1();
        }
    }



