import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
// Joshua Kyle K. Entrata   4CSC

public class SetOperations extends Frame {
    @Override
    public void paint (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke (10.0f);

        g2d.setStroke(bs);

        // Creating close objects
        // Ellipse2D.Double elli = new Ellipse2D.Double(20, 40, 300, 200);
        // Ellipse2D.Double circ = new Ellipse2D.Double(80, 100, 200, 200);
        Rectangle2D.Double rect = new Rectangle2D.Double(230, 100, 200, 300);
        Rectangle2D.Double sq = new Rectangle2D.Double(200, 150, 200, 200);

        // Area E = new Area(elli);
        // Area C = new Area(circ);
        Area R = new Area(rect);
        Area S = new Area(sq);

        g2d.setPaint(Color.YELLOW);

        // E.add(R);
        // g2d.setPaint(Color.BLACK);
        // g2d.draw(E);
        // g2d.setPaint(Color.YELLOW);
        // g2d.fill(E);

        // C.intersect(S);
        // g2d.draw(circ);
        // g2d.draw(sq);
        // g2d.fill(C);

        // C.subtract(S);
        // g2d.draw(circ);
        // g2d.draw(sq);
        // g2d.fill(C);

        g2d.setPaint(Color.BLACK);
        g2d.draw(R);
        R.exclusiveOr(S);
        g2d.setPaint(Color.YELLOW);
        g2d.fill(R);
    }

    public static void main(String[] args) {
        SetOperations setOper = new SetOperations();
        setOper.setTitle("Set Operations");
        setOper.setBackground(Color.GRAY);
        setOper.setSize(1000, 1000);
        setOper.setForeground(Color.GREEN);

        setOper.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setOper.setVisible(true);
    }
}
