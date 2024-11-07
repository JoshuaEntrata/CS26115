import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class Entrata_MPAnimationTL extends Frame{
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (7.0f));

        g2d.setColor(Color.WHITE);
        g2d.drawString("Joshua Kyle K. Entrata", 50, 50);

        Rectangle2D.Double leftstoplight = new Rectangle2D.Double(50,93,120,293);
        g2d.setColor(Color.GRAY);
        g2d.fill(leftstoplight);
        g2d.setColor(Color.WHITE);
        g2d.draw(leftstoplight);
 
        Rectangle2D.Double rightstoplight = new Rectangle2D.Double(250,93,120,293);
        g2d.setColor(Color.GRAY);
        g2d.fill(rightstoplight);
        g2d.setColor(Color.WHITE);
        g2d.draw(rightstoplight);

        Rectangle2D.Double leftTimer = new Rectangle2D.Double(50, 450, 120, 120);
        g2d.setColor(Color.GRAY);
        g2d.fill(leftTimer);
        g2d.setColor(Color.WHITE);
        g2d.draw(leftTimer);

        Rectangle2D.Double rightTimer = new Rectangle2D.Double(250, 450, 120, 120);
        g2d.setColor(Color.GRAY);
        g2d.fill(rightTimer);
        g2d.setColor(Color.WHITE);
        g2d.draw(rightTimer);
 
        Ellipse2D.Double leftred = new Ellipse2D.Double(80,110,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(leftred);
        g2d.setColor(Color.RED.darker().darker().darker().darker());
        g2d.fill(leftred);

        Ellipse2D.Double leftyellow = new Ellipse2D.Double(80,210,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(leftyellow);
        g2d.setColor(Color.YELLOW.darker().darker().darker().darker());
        g2d.fill(leftyellow);
 
        Ellipse2D.Double leftgreen = new Ellipse2D.Double(80,310,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(leftgreen);
        g2d.setColor(Color.GREEN.darker().darker().darker().darker());
        g2d.fill(leftgreen);
 
        Ellipse2D.Double rightred = new Ellipse2D.Double(280,110,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(rightred);
        g2d.setColor(Color.RED.darker().darker().darker().darker());
        g2d.fill(rightred);

        Ellipse2D.Double rightyellow = new Ellipse2D.Double(280,210,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(rightyellow);
        g2d.setColor(Color.YELLOW.darker().darker().darker().darker());
        g2d.fill(rightyellow);
 
        Ellipse2D.Double rightgreen = new Ellipse2D.Double(280,310,60,60);
        g2d.setColor(Color.WHITE);
        g2d.draw(rightgreen);
        g2d.setColor(Color.GREEN.darker().darker().darker().darker());
        g2d.fill(rightgreen);
 
        
        g2d.setColor(Color.RED);
        g2d.fill(leftred);
        g2d.fill(rightred);
        countdown(g2d, 33, 33, Color.RED, Color.RED);  // start 33 seconds

        for(int x = 0; x<90; x++)
        {
            g2d.setColor(Color.RED.darker().darker().darker().darker());
            g2d.fill(leftred);
            g2d.setColor(Color.GREEN);
            g2d.fill(leftgreen);
            countdown(g2d, 30, 33, Color.GREEN, Color.RED);   // go1_stp2 green 30 red 30
            
            g2d.setColor(Color.GREEN.darker().darker().darker().darker());
            g2d.fill(leftgreen);
            g2d.setColor(Color.YELLOW);
            g2d.fill(leftyellow);
            g2d.setColor(Color.RED);
            g2d.fill(rightred);
            countdown(g2d, 3, 3, Color.YELLOW, Color.RED);  // rdy1_stp2 yellow 3 & go1_stp2 red 3
            
            g2d.setColor(Color.RED);
            g2d.fill(rightred);
            g2d.setColor(Color.YELLOW.darker().darker().darker().darker());
            g2d.fill(leftyellow);
            g2d.setColor(Color.RED);
            g2d.fill(leftred);
            countdown(g2d, 33, 33, Color.RED, Color.RED);  // stp1_go2 red 33 & rdy1_stp2 red 33
            
            g2d.setColor(Color.RED);
            g2d.fill(leftred);
            g2d.setColor(Color.RED.darker().darker().darker().darker());
            g2d.fill(rightred);
            g2d.setColor(Color.GREEN);
            g2d.fill(rightgreen);
            countdown(g2d, 33, 30, Color.RED, Color.GREEN); // stp1_rdy2 red 30 & stp1_go2 green 30
            
            g2d.setColor(Color.GREEN.darker().darker().darker().darker());
            g2d.fill(rightgreen);
            g2d.setColor(Color.YELLOW);
            g2d.fill(rightyellow);
            countdown(g2d, 3, 3, Color.RED, Color.YELLOW); // stp1_rdy2 red 3 & stp1_rdy2 yellow 3
            
            g2d.setColor(Color.YELLOW.darker().darker().darker().darker());
            g2d.fill(rightyellow);
            g2d.setColor(Color.RED);
            g2d.fill(rightred);
            countdown(g2d, 30, 30, Color.RED, Color.RED);
        }
    }
    
    public void sustain(long t)
    {
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() <finish){
 
        }
    }

    public void countdown(Graphics2D g2d, int leftTime, int rightTime, Color leftColor, Color rightColor) {
    for (int i = leftTime, j = rightTime; i > 0 || j > 0; i--, j--) {
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.fill(new Rectangle2D.Double(50, 450, 120, 120));  
        g2d.fill(new Rectangle2D.Double(250, 450, 120, 120)); 

        g2d.setColor(leftColor);
        if (i >= 0) {
            g2d.drawString(Integer.toString(i), 100, 510);
        }

        g2d.setColor(rightColor);
        if (j >= 0) {
            g2d.drawString(Integer.toString(j), 300, 510); 
        }
         
        if (i < 0 || j < 0) {
            break;
        }

        sustain(1000);
    }
}
 
    public static void main (String[] argv){
        Entrata_MPAnimationTL t = new Entrata_MPAnimationTL ();
        t.setVisible(true);
        t.setTitle("Stoplight");
        t.setSize(500, 750);
        t.setBackground(Color.BLUE);
    }
}