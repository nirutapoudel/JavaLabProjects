package Core.Solution;


import javax.swing.*;
import java.awt.*;

class NepaliFlag extends JFrame {

        public NepaliFlag(){
            setSize(450,450);
            setVisible(true);
        }

        public void paint(Graphics g) {


            g.drawLine(10, 10, 10, 350);
            g.drawLine(10, 10, 100, 130);
            g.drawLine(10, 130, 100, 130);
            g.drawLine(10, 130, 130, 200);
            g.drawLine(10, 200, 130, 200);
            String s = new String("Hello");
            g.setColor(Color.blue);
        }

        public static void main(String []args){
            NepaliFlag s=new NepaliFlag();
        }

    }
