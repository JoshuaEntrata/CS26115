import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
// Joshua Kyle K. Entrata   4CSC

public class EntrataJOSHUA_LE2 extends Frame {
    private int windowHeight;

    EntrataJOSHUA_LE2(int height) {
        windowHeight = height;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform yUp = new AffineTransform();
        yUp.setToScale(1,-1);
        AffineTransform translate = new AffineTransform();
        translate.setToTranslation(40,windowHeight-50);
        yUp.preConcatenate(translate);

        g2d.transform(yUp);
        g2d.setStroke(new BasicStroke(3.0f));

        GeneralPath cross = crossGeneralPath();
        g2d.draw(cross);

        // a. Scaling
        AffineTransform scaling1 = new AffineTransform();
        scaling1.setToScale(1.0/3, 1.0/3);
        g2d.setStroke(new BasicStroke(
            3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float[] {50.0f, 10.0f}, 4.0f
        ));
        g2d.setColor(Color.BLUE);
        g2d.draw(scaling1.createTransformedShape(cross));

        // b. Scaling
        AffineTransform scaling2 = new AffineTransform();
        scaling2.setToScale(2, 1);
        g2d.setStroke(new BasicStroke(
            3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float[] {50.0f, 10.0f}, 4.0f
        ));
        g2d.setColor(Color.YELLOW);
        g2d.draw(scaling2.createTransformedShape(cross));

        // c. Shearing
        AffineTransform shearing = new AffineTransform();
        shearing.setToShear(1, 2);
        g2d.setStroke(new BasicStroke(
            3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float[] {50.0f, 10.0f}, 4.0f
        ));
        g2d.setColor(Color.PINK);
        g2d.draw(shearing.createTransformedShape(cross));

        // d. Translation
        AffineTransform translation = new AffineTransform();
        translation.setToTranslation(100, 50);
        g2d.setStroke(new BasicStroke(
            3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float[] {50.0f, 10.0f}, 4.0f
        ));
        g2d.setColor(Color.CYAN);
        g2d.draw(translation.createTransformedShape(cross));

        // e. Rotation
        AffineTransform rotation = new AffineTransform();
        rotation.setToRotation(Math.PI / (-4));
        g2d.setStroke(new BasicStroke(
            3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 8.0f, new float[] {50.0f, 10.0f}, 4.0f
        ));
        g2d.setColor(Color.RED);
        g2d.draw(rotation.createTransformedShape(cross));
        
        g2d.setColor(Color.BLACK);
        drawSimpleCoordinateSystem(1000,1000,g2d);
    }

    private static GeneralPath crossGeneralPath() {
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

    public static void drawSimpleCoordinateSystem(int xmax, int ymax, Graphics2D g2d) {
        int xOffset = 0;
        int yOffset = 0;
        int step = 20;
        String s;

        Font fo = g2d.getFont();

        int fontSize = 13;
        Font fontCoordSys = new Font("serif",Font.PLAIN,fontSize);
        
        AffineTransform flip = new AffineTransform();
        flip.setToScale(1,-1);
        AffineTransform lift = new AffineTransform();
        lift.setToTranslation(0,fontSize);
        flip.preConcatenate(lift);

        Font fontUpsideDown = fontCoordSys.deriveFont(flip);

        g2d.setFont(fontUpsideDown);
        g2d.drawLine(xOffset,yOffset,xmax,yOffset);

        for (int i=xOffset+step; i<=xmax; i=i+step) {
        g2d.drawLine(i,yOffset-2,i,yOffset+2);
        g2d.drawString(String.valueOf(i),i-7,yOffset-30);
        }

        g2d.drawLine(xOffset,yOffset,xOffset,ymax);

        s="  "; 
        for (int i=yOffset+step; i<=ymax; i=i+step){
            g2d.drawLine(xOffset-2,i,xOffset+2,i);

            if (i>99){
                s="";
            }

            g2d.drawString(s+String.valueOf(i),xOffset-25,i-20);
        }

        g2d.setFont(fo);
    }

  public static void main(String[] args) {
    int height = 1000;
    EntrataJOSHUA_LE2 le2 = new EntrataJOSHUA_LE2(height);

    le2.setTitle("Long Exam 2 Part 2 - Question 1");
    le2.setSize(1000, height);
    le2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    le2.setVisible(true);
  }
}
