import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
// Joshua Kyle K. Entrata   4CSC

public class GenPath extends Frame {
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke (10.0f);

        g2d.setStroke(bs);
    
        // **First General Path Example**
        // Creating general path
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(50, 50); // initial point
        gp1.lineTo(50, 200);    // creating line through GP
        gp1.quadTo(150, 500, 250, 200); // creating quadcurve through GP
        gp1.curveTo(350, 100, 150, 150, 100, 100);  // creating cubiccurve through GP
        gp1.lineTo(50, 50); // creating gp1 object
        
        // g2d.setPaint(Color.RED);
        // g2d.draw(gp1);
        // g2d.setPaint(Color.YELLOW);
        // g2d.fill(gp1);

        // **Second General Path Example**
        GeneralPath car = new GeneralPath();
        car.moveTo(60, 120);    // initial point
        car.lineTo(80, 120);    // front underbody
        car.quadTo(90, 140, 100, 120);  // front wheel
        car.lineTo(160, 120);   // middle underbody
        car.quadTo(170, 140, 180, 120); //rear wheel
        car.lineTo(200, 120);   // rear underbody
        car.curveTo(195, 100, 200, 80, 160, 80);    // rear
        car.lineTo(110, 80);    // roof
        car.lineTo(60, 100);    // bonnet
        car.lineTo(60, 120);    // trunk
        
        g2d.setPaint(Color.BLACK);
        g2d.draw(car);
        g2d.setPaint(Color.PINK);
        g2d.fill(car);
    }

    public static void main(String[] args) {
        GenPath genPath = new GenPath();
        genPath.setTitle("GenPath");
        genPath.setBackground(Color.GRAY);
        genPath.setSize(1000, 1000);
        genPath.setForeground(Color.GREEN);

        genPath.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        genPath.setVisible(true);
    }
}
