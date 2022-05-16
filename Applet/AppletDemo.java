package Applet;

import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet {
   public void init(){
       setBackground(Color.BLACK);
       setForeground(Color.cyan);

   }
   public void paint(Graphics g){
       g.drawString("Hello Students", 100,100);
   }
}
