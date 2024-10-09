package mp2.panels;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CrossPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke (10.0f);
        g2d.setStroke(bs);

        GeneralPath cross = crossGeneralPath();
        g2d.setPaint(Color.RED);
        g2d.draw(cross);
    }

    public static GeneralPath crossGeneralPath() {
        // **Cross General Path**
        GeneralPath cross = new GeneralPath();

        // South Cross Part
        cross.moveTo(250, 280);    // initial point
        cross.lineTo(250, 380);
        cross.quadTo(250, 420, 290, 420); 
        cross.lineTo(310, 420);
        cross.quadTo(350, 420, 350, 380);  
        cross.lineTo(350, 280);

        // East Cross Part
        cross.lineTo(450, 280);
        cross.quadTo(490, 280, 490, 240);  
        cross.lineTo(490, 220);
        cross.quadTo(490, 180, 450, 180);  
        cross.lineTo(350, 180);

        // North Cross Part
        cross.lineTo(350, 80);
        cross.quadTo(350, 40, 310, 40);    
        cross.lineTo(290, 40);
        cross.quadTo(250, 40, 250, 80);    
        cross.lineTo(250, 180);

        // West Cross Part
        cross.lineTo(150, 180);
        cross.quadTo(110, 180, 110, 220);    
        cross.lineTo(110, 240);
        cross.quadTo(110, 280, 150, 280);    
        cross.lineTo(250, 280);

        return cross;
    }
}
