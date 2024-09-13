package mp2.panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import static mp2.utils.Utils.crossAndChristmasTreeArea;

public class RelativeDiffTreeCrossPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Area[] areas = crossAndChristmasTreeArea(g2d);
        Area crossArea = areas[0];
        Area christmasTreeArea = areas[1];

        Area relativeDiff = new Area(crossArea);
        relativeDiff.subtract(christmasTreeArea);

        g2d.setPaint(Color.BLACK);
        g2d.fill(relativeDiff);
    }
}
