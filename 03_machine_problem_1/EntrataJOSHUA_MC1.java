import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


public class EntrataJOSHUA_MC1 extends Frame {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs =  new BasicStroke(7.0f);

        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 16));
        g2d.drawString("Joshua Kyle K. Entrata - 4CSC", 50, 895);

        g2d.setColor(Color.BLACK);
        Line2D.Double line1 = new Line2D.Double(50, 475, 500, 125);
        Line2D.Double line2 = new Line2D.Double(500, 125, 300, 300);
        Line2D.Double line3 = new Line2D.Double(300, 300, 450, 500);
        Line2D.Double line4 = new Line2D.Double(450, 500, 200, 375);
        g2d.draw(line1);
        g2d.draw(line2);
        g2d.draw(line3);
        g2d.draw(line4);
        g2d.drawString("Polyline", 50, 395);

        g2d.setColor(Color.GREEN);
        QuadCurve2D.Double quadCurve = new QuadCurve2D.Double(175, 500, 200, 300, 400, 550);
        g2d.draw(quadCurve);
        g2d.setColor(Color.BLACK);
        g2d.drawString("QuadCurve", 175, 520);

        g2d.setColor(Color.BLUE);
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(375, 300, 450, 550, 550, 450, 575, 350);
        g2d.draw(cubicCurve);
        g2d.setColor(Color.BLACK);
        g2d.drawString("CubicCurve", 475, 330);

        g2d.setColor(Color.RED);
        Rectangle2D.Double rectangle = new Rectangle2D.Double(100, 100, 150, 200);
        g2d.draw(rectangle);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Rectangle", 130, 80);

        g2d.setColor(Color.YELLOW);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(80, 60, 40, 60);
        g2d.draw(ellipse);
        g2d.setColor(Color.BLACK);
        g2d.drawString("Ellipse", 80, 50);

        g2d.setColor(Color.ORANGE);
        Arc2D.Double arcPie = new Arc2D.Double(300, 50, 100, 75, 15, 75, Arc2D.PIE);
        g2d.draw(arcPie);
        g2d.setColor(Color.BLACK);
        g2d.drawString("ArcPie", 330, 120);
        
    }
    public static void main(String[] args) {
        EntrataJOSHUA_MC1 s = new EntrataJOSHUA_MC1();
        s.setTitle("MP1: String and Basic Geom Objects");
        s.setBackground(Color.WHITE);
        s.setSize(1000, 1000);
        
        s.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0); 
            }
        });

        s.setVisible(true);
    }
    
}
