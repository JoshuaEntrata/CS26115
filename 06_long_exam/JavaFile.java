import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class JavaFile extends Frame {
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(10.0f);

        g2d.setStroke(bs);

        // Odd T-Shape General Path
        GeneralPath gp1 = new GeneralPath();

        gp1.moveTo(100,250);    // A
        gp1.lineTo(150, 250);   // B
        gp1.lineTo(150, 200);   // C
        gp1.lineTo(200, 200);   // D
        gp1.lineTo(200, 500);   //E
        gp1.lineTo(400, 500);   // F
        gp1.lineTo(400, 200);   // G
        gp1.lineTo(450, 200);   // H
        gp1.lineTo(450, 250);   // I
        gp1.lineTo(500, 250);   // J
        gp1.lineTo(500, 150);   // K
        gp1.lineTo(450, 100);   // L
        gp1.lineTo(150, 100);   // M
        gp1.lineTo(100, 150);   // N
        gp1.lineTo(100, 250);   // A

        // g2d.setPaint(Color.MAGENTA);
        // g2d.fill(gp1);

        // Boat T-Shape General Path
        GeneralPath gp2 = new GeneralPath();

        gp2.moveTo(100, 350);   // A
        gp2.lineTo(150, 450);   // B
        gp2.lineTo(450, 450);   // C
        gp2.lineTo(500, 350);   // D
        gp2.lineTo(305, 350);   // E
        gp2.lineTo(295, 350);   // F
        gp2.lineTo(100, 350);   // A

        gp2.lineTo(295, 350);   // F
        gp2.lineTo(295, 150);   // G
        gp2.lineTo(305, 150);   // H
        gp2.lineTo(305, 200);   // I
        gp2.lineTo(405, 200);   // J
        gp2.lineTo(305, 150);   // H
        gp2.lineTo(305, 350);   // E

        // g2d.setPaint(Color.GREEN);
        // g2d.fill(gp2);

        // Areas
        Area gp1Area = new Area(gp1);
        Area gp2Area = new Area(gp2);

        // Relative Difference (Odd T-Shape - Boat)
        Area relativeDiff = new Area(gp1Area);
        relativeDiff.subtract(gp2Area);
        // g2d.setPaint(Color.CYAN);
        // g2d.fill(relativeDiff);

        // Symmetric Difference 
        Area symmetricDiff = new Area(gp1Area);
        symmetricDiff.exclusiveOr(gp2Area);
        g2d.setPaint(Color.CYAN);
        g2d.fill(symmetricDiff);
    }

    public static void main(String[] args) {
        JavaFile jf = new JavaFile();
        jf.setTitle("Long Exam 1 Part 2");
        jf.setBackground(Color.WHITE);
        jf.setSize(1000, 1000);
        jf.setForeground(Color.BLACK);

        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        jf.setVisible(true);
    }
}
