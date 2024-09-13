
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class StringAndGraphics2D extends Frame {
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs =  new BasicStroke(7.0f);
        
        // Drawing the String
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 30));
        g2d.drawString("Welcome 4CSC in Graphics using Java", 50, 75);

        // Drawing the Line
        Line2D.Double line1 = new Line2D.Double(75, 120, 250, 350);
        g2d.draw(line1);

        // Drawing the Quadratic Curve
        QuadCurve2D.Double quadcurve1 = new QuadCurve2D.Double(75, 120, 150, 400, 250, 350);
        g2d.draw(quadcurve1);

        // Drawing the Cubic Curve
        CubicCurve2D.Double cubiccurve1 = new CubicCurve2D.Double(75, 120, 120, 20, 250, 350, 400, 300);
        g2d.draw(cubiccurve1);

        // Drawing the Rectangle
        Rectangle2D.Double rectangle1 = new Rectangle2D.Double(100, 400, 300, 100);
        g2d.fill(rectangle1);

        // Drawing the Circle
        Ellipse2D.Double circle1 = new Ellipse2D.Double(100, 700, 200, 200);
        g2d.draw(circle1);

        // Drawing the Ellipse
        Ellipse2D.Double ellipse1 = new Ellipse2D.Double(400, 700, 500, 200);
        g2d.draw(ellipse1);

        // Drawing the Ellipse Arc
        Arc2D.Double arc_pie = new Arc2D.Double(700, 200, 300, 100, 30, 90, Arc2D.PIE);
        g2d.draw(arc_pie);

        // Drawing the Open Arc
        Arc2D.Double arc_open = new Arc2D.Double(700, 400, 300, 100, 30, 110, Arc2D.OPEN);
        g2d.draw(arc_open);

        // Drawing the Chord Arc
        Arc2D.Double arc_chord = new Arc2D.Double(700, 500, 300, 100, 30, 130, Arc2D.CHORD);
        g2d.draw(arc_chord);
    }
    
    public static void main(String[] args) {
        StringAndGraphics2D s = new StringAndGraphics2D();
        s.setTitle("String and Graphics 2D in Java");
        s.setBackground(Color.MAGENTA);
        s.setSize(1000, 1000);
        s.setForeground(Color.YELLOW);
        
        s.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); 
            }
        });

        s.setVisible(true);
    }
}
