package mp2.panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import static mp2.utils.Utils.starGeneralPath;
import static mp2.utils.Utils.treeGeneralPath;
import static mp2.utils.Utils.baseGeneralPath;

public class ChristmasTreePanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke (10.0f);
        g2d.setStroke(bs);

        GeneralPath star = starGeneralPath();
        g2d.setPaint(Color.YELLOW);
        g2d.fill(star);

        GeneralPath tree = treeGeneralPath();
        g2d.setPaint(Color.GREEN);
        g2d.fill(tree);

        GeneralPath base = baseGeneralPath();
        g2d.setPaint(Color.GRAY);
        g2d.fill(base);
    }
}
