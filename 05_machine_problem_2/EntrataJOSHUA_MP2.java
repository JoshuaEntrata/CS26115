import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
// Joshua Kyle K. Entrata   4CSC

public class EntrataJOSHUA_MP2 extends Frame {

    private static void drawCrossLineAndCurve(Graphics2D g2d) {
        // **Cross Lines and QuadCurves**
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

    private static Area[] crossAndChristmasTreeArea(Graphics2D g2d) {

        GeneralPath cross = crossGeneralPath();
        GeneralPath christmasTree = new GeneralPath();
        christmasTree.append(starGeneralPath(), false);
        christmasTree.append(treeGeneralPath(), false);
        christmasTree.append(baseGeneralPath(), false);

        Area crossArea = new Area(cross);
        Area christmasTreeArea = new Area(christmasTree);

        return new Area[] { crossArea, christmasTreeArea };
    }

    static class CrossLineAndCurvePanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            drawCrossLineAndCurve(g2d);
        }
    }

    static class CrossPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            BasicStroke bs = new BasicStroke (10.0f);
            g2d.setStroke(bs);

            GeneralPath cross = crossGeneralPath();
            g2d.setPaint(Color.RED);
            g2d.draw(cross);
        }
    }

    static class ChristmasTreePanel extends JPanel {
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

    static class UnionPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            Area[] areas = crossAndChristmasTreeArea(g2d);
            Area crossArea = areas[0];
            Area christmasTreeArea = areas[1];

            Area union = new Area(crossArea);
            union.add(christmasTreeArea);

            g2d.setPaint(Color.BLACK);
            g2d.fill(union);
        }
    }

    static class IntersectionPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            Area[] areas = crossAndChristmasTreeArea(g2d);
            Area crossArea = areas[0];
            Area christmasTreeArea = areas[1];

            Area intersection = new Area(crossArea);
            intersection.intersect(christmasTreeArea);

            g2d.setPaint(Color.BLACK);
            g2d.fill(intersection);
        }
    }

    static class SymmetricDiffPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            Area[] areas = crossAndChristmasTreeArea(g2d);
            Area crossArea = areas[0];
            Area christmasTreeArea = areas[1];

            Area symmetricDiff = new Area(crossArea);
            symmetricDiff.exclusiveOr(christmasTreeArea);

            g2d.setPaint(Color.BLACK);
            g2d.fill(symmetricDiff);
        }
    }

    static class RelativeDiffTreeCrossPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            Area[] areas = crossAndChristmasTreeArea(g2d);
            Area crossArea = areas[0];
            Area christmasTreeArea = areas[1];

            Area relativeDiff = new Area(christmasTreeArea);
            relativeDiff.subtract(crossArea);

            g2d.setPaint(Color.BLACK);
            g2d.fill(relativeDiff);
        }
    }

    static class RelativeDiffCrossTreePanel extends JPanel {
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
    
    private static GeneralPath starGeneralPath() {
        GeneralPath star = new GeneralPath();

        star.moveTo(300, 100);
        star.lineTo(320, 120);
        star.lineTo(300, 140);
        star.lineTo(280, 120);
        star.lineTo(300, 100);

        return star;
    }

    private static GeneralPath treeGeneralPath() {
        GeneralPath tree = new GeneralPath();

        tree.moveTo(300, 140);
        tree.lineTo(370, 290);  // right first level
        tree.lineTo(350, 290);
        tree.lineTo(410, 440);  // right second level
        tree.lineTo(390, 440);
        tree.lineTo(450, 590);  // right third level
        tree.lineTo(150, 590);  // left third level
        tree.lineTo(210, 440); 
        tree.lineTo(190, 440);  //left second level
        tree.lineTo(250, 290);
        tree.lineTo(230, 290);  //left first level
        tree.lineTo(300, 140);

        return tree;
    }

    private static GeneralPath baseGeneralPath() {
        GeneralPath base = new GeneralPath();

        base.moveTo(315, 590);
        base.lineTo(315, 620);
        base.lineTo(285, 620);
        base.lineTo(285, 590);
        base.lineTo(315, 590);

        return base;
    }
    
    
    public static void main(String[] args) {
        EntrataJOSHUA_MP2 mp2 = new EntrataJOSHUA_MP2();
        mp2.setTitle("Machine Problem 2: General Path and Areas");
        mp2.setBackground(Color.lightGray);
        mp2.setSize(1000, 1000);
        mp2.setForeground(Color.BLACK);
        
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cross - Lines and Curves", new CrossLineAndCurvePanel());
        tabbedPane.addTab("Cross - General Path", new CrossPanel());
        tabbedPane.addTab("Christmas Tree", new ChristmasTreePanel());
        tabbedPane.addTab("Union", new UnionPanel());
        tabbedPane.addTab("Intersection", new IntersectionPanel());
        tabbedPane.addTab("Symmetric Difference", new SymmetricDiffPanel());
        tabbedPane.addTab("Relative Diff (Tree-Cross)", new RelativeDiffTreeCrossPanel());
        tabbedPane.addTab("Relative Diff (Cross-Tree)", new RelativeDiffCrossTreePanel());

        mp2.add(tabbedPane);
        mp2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        mp2.setVisible(true);
    }
}
