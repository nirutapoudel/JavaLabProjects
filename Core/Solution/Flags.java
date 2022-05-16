package Core.Solution;
import java.awt.*;
public class Flags extends Frame {
    static Color NEPALIFLAG=new Color(221,12,39);
    Flags()
    {
        setVisible(true);
        setSize(600,400);
    } public void paint(Graphics flag) {
// for upper triangle
        int upperTriangleX[]= {210,360,210};
        int upperTriangleY[]= {50,200,200};
        flag.setColor(Color.blue);
        Polygon upperTriangle=new Polygon(upperTriangleX,upperTriangleY,3);
        flag.drawPolygon(upperTriangle);
        flag.setColor(NEPALIFLAG);
        flag.fillPolygon(upperTriangle);
// for lower triangle
        int lowerTriangleX[]= {210,380,210};
        int lowerTriangleY[]= {200,400,400};
        flag.setColor(Color.blue);
        Polygon lowerTriangle=new Polygon(lowerTriangleX,lowerTriangleY,3);
        flag.drawPolygon(lowerTriangle);
        flag.setColor(NEPALIFLAG);
        flag.fillPolygon(lowerTriangle);


// for moon
        flag.setColor(Color.white);
        flag.fillOval(250,140,30,30);
        flag.setColor(NEPALIFLAG);
        flag.fillOval(250,135,30,30);
// for sun
        flag.setColor(Color.white);
        flag.fillOval(250,330,30,30);






    }
    public static void main(String args[])
    {
        Flags f= new Flags();
    }}

