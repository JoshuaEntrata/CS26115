package mp2.panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CrossLineAndCurvePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        drawCrossLineAndCurve(g2d);
    }

    public static void drawCrossLineAndCurve(Graphics2D g2d) {
        // South Cross Part
        Line2D.Double southAB = new Line2D.Double(250, 280, 250, 380);
        QuadCurve2D.Double southBC = new QuadCurve2D.Double(250, 380, 250, 420, 290, 420);
        Line2D.Double southCD = new Line2D.Double(290, 420, 310, 420);
        QuadCurve2D.Double southDE = new QuadCurve2D.Double(310, 420, 350, 420, 350, 380);
        Line2D.Double southEF = new Line2D.Double(350, 380, 350, 280);

        // East Cross Part
        Line2D.Double eastAB = new Line2D.Double(350, 280, 450, 280);
        QuadCurve2D.Double eastBC = new QuadCurve2D.Double(450, 280, 490, 280, 490, 240);
        Line2D.Double eastCD = new Line2D.Double(490, 240, 490, 220);
        QuadCurve2D.Double eastDE = new QuadCurve2D.Double(490, 220, 490, 180, 450, 180);
        Line2D.Double eastEF = new Line2D.Double(450, 180, 350, 180);

        // North Cross Part
        Line2D.Double northAB = new Line2D.Double(350, 180, 350, 80);
        QuadCurve2D.Double northBC = new QuadCurve2D.Double(350, 80, 350, 40, 310, 40);
        Line2D.Double northCD = new Line2D.Double(310, 40, 290, 40);
        QuadCurve2D.Double northDE = new QuadCurve2D.Double(290, 40, 250, 40, 250, 80);
        Line2D.Double northEF = new Line2D.Double(250, 80, 250, 180);

        // West Cross Part
        Line2D.Double westAB = new Line2D.Double(250, 180, 150, 180);
        QuadCurve2D.Double westBC = new QuadCurve2D.Double(150, 180, 110, 180, 110, 220);
        Line2D.Double westCD = new Line2D.Double(110, 220, 110, 240);
        QuadCurve2D.Double westDE = new QuadCurve2D.Double(110, 240, 110, 280, 150, 280);
        Line2D.Double westEF = new Line2D.Double(150, 280, 250, 280);

        g2d.setPaint(Color.BLACK);
        g2d.draw(southAB);
        g2d.draw(southBC);
        g2d.draw(southCD);
        g2d.draw(southDE);
        g2d.draw(southEF);

        g2d.draw(eastAB);
        g2d.draw(eastBC);
        g2d.draw(eastCD);
        g2d.draw(eastDE);
        g2d.draw(eastEF);

        g2d.draw(northAB);
        g2d.draw(northBC);
        g2d.draw(northCD);
        g2d.draw(northDE);
        g2d.draw(northEF);

        g2d.draw(westAB);
        g2d.draw(westBC);
        g2d.draw(westCD);
        g2d.draw(westDE);
        g2d.draw(westEF);
    }
}
