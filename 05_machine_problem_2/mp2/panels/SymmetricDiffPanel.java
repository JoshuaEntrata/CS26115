package mp2.panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import static mp2.utils.Utils.crossAndChristmasTreeArea;

public class SymmetricDiffPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Area[] areas = crossAndChristmasTreeArea(g2d);
        Area crossArea = areas[0];
        Area christmasTreeArea = areas[1];

        Area symmetricDiff = new Area(christmasTreeArea);
        symmetricDiff.exclusiveOr(crossArea);

        g2d.setPaint(Color.BLACK);
        g2d.fill(symmetricDiff);
    }
}
