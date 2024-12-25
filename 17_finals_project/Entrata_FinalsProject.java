import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Entrata_FinalsProject extends JPanel {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private double bladeRotation = 0; 
    private final double[] cloudX = {200, 600}; 

    public Entrata_FinalsProject() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(135, 206, 250));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        drawGrass(g2d);
        drawTrees(g2d);
        drawMovingClouds(g2d);
        drawWindmill(g2d);
    }

    private void drawGrass(Graphics2D g2d) {
        Rectangle2D.Double grass = new Rectangle2D.Double(0, HEIGHT - 100, WIDTH, 150);
        g2d.setColor(new Color(34, 139, 34));
        g2d.fill(grass);
        g2d.setColor(Color.BLACK);
        g2d.draw(grass);
    }

    private void drawTrees(Graphics2D g2d) {
        int[][] treeSizes = {
            {100, 200}, 
            {100, 120}, 
            {100, 190},
            {100, 120},  
            {100, 180}, 
            {100, 110}, 
            {100, 210}
        };

        int xPosition = 10;
        int trunkWidth = 20;
        int trunkHeight = 50;
        int treeY = HEIGHT - 150;
        int trunkY = HEIGHT - 100; 

        for (int[] size : treeSizes) {
            int treeWidth = size[0];
            int treeHeight = size[1];

            // Tree Leaves
            GeneralPath treeLeaves = new GeneralPath();
            treeLeaves.moveTo(xPosition, treeY);
            treeLeaves.lineTo(xPosition + treeWidth / 2, treeY - treeHeight);
            treeLeaves.lineTo(xPosition + treeWidth, treeY);
            treeLeaves.lineTo(xPosition, treeY);
            g2d.setColor(new Color(34, 139, 34));
            g2d.fill(treeLeaves);
            g2d.setColor(Color.BLACK);
            g2d.draw(treeLeaves);

            // Tree Trunk
            Rectangle2D.Double treeTrunk = new Rectangle2D.Double(
                xPosition + treeWidth / 2 - trunkWidth / 2, 
                trunkY - trunkHeight, 
                trunkWidth, 
                trunkHeight
            );
            g2d.setColor(new Color(139, 69, 19));
            g2d.fill(treeTrunk);
            g2d.setColor(Color.BLACK);
            g2d.draw(treeTrunk);

            xPosition += 120; 
        }
    }

    private void drawMovingClouds(Graphics2D g2d) {
        int[][] ellipseParams = {
            {-30, 0, 110, 40}, 
            {30, -50, 130, 90}, 
            {110, -20, 90, 50}
        };

        for (int i = 0; i < cloudX.length; i++) {
            AffineTransform translation = g2d.getTransform();

            double center = Math.abs(WIDTH / 2.0 - cloudX[i]);
            double scaling = 1.0 + (0.5 * (1 - center / (WIDTH / 2.0)));

            scaling = Math.min(scaling, 2.5);
            g2d.translate(cloudX[i], 100 + (i * 70));
            g2d.scale(scaling, scaling);

            double shearing = 0.1 * Math.sin(System.currentTimeMillis() / 500.0);
            g2d.shear(shearing, 0);

            drawCloud(g2d, ellipseParams);

            g2d.setTransform(translation);
            cloudX[i] -= 0.1;
            if (cloudX[i] < -200) cloudX[i] = WIDTH + 100;
        }
    }

    private void drawCloud(Graphics2D g2d, int[][] params) {
        Area cloud = new Area();
        for (int[] param : params) {
            int x = param[0];
            int y = param[1];
            int w = param[2];
            int h = param[3];

            Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, w, h);
            cloud.add(new Area(ellipse)); 
        }

        g2d.setColor(Color.WHITE);
        g2d.fill(cloud);
        g2d.setColor(Color.BLACK);
        g2d.draw(cloud);
    }

    private void drawWindmill(Graphics2D g2d) {
        // Windmill Base
        Rectangle2D.Double windmillBase = new Rectangle2D.Double(
            WIDTH / 2 - 50, 
            HEIGHT - 250, 
            100, 
            250
        );
        g2d.setColor(new Color(230, 230, 250));
        g2d.fill(windmillBase);
        g2d.setColor(Color.BLACK);
        g2d.draw(windmillBase);

        // Door
        Arc2D.Double door = new Arc2D.Double(WIDTH / 2 - 25, HEIGHT - 50, 50, 100, 0, 180, Arc2D.OPEN);
        g2d.setColor(new Color(139, 69, 19));
        g2d.fill(door);
        g2d.setColor(Color.BLACK);
        g2d.draw(door);

        // Dome
        Arc2D.Double dome = new Arc2D.Double(WIDTH / 2 - 60, HEIGHT - 280, 120, 100, 0, 180, Arc2D.OPEN);
        g2d.setColor(new Color(0, 102, 204));
        g2d.fill(dome);
        g2d.setColor(Color.BLACK);
        g2d.draw(dome);

        // Rotating Blades
        AffineTransform rotation = g2d.getTransform();
        g2d.translate(WIDTH / 2, HEIGHT - 270);
        g2d.rotate(Math.toRadians(bladeRotation));
        drawWindmillBlades(g2d);
        g2d.setTransform(rotation);

        // Middle Circle of Blades
        Ellipse2D.Double bladeCenter = new Ellipse2D.Double((WIDTH / 2) - 20, (HEIGHT / 2) + 10, 40, 40);
        g2d.setColor(new Color(0, 102, 204));
        g2d.fill(bladeCenter);
        g2d.setColor(Color.BLACK);
        g2d.draw(bladeCenter);

        bladeRotation = (bladeRotation + 0.1) % 360; 
        repaint();
    }

    private void drawWindmillBlades(Graphics2D g2d) {
        Rectangle2D.Double windmillBlade = new Rectangle2D.Double(-10, -120, 20, 120);
        for (int i = 0; i < 4; i++) {
            g2d.setColor(new Color(245, 222, 179));
            g2d.fill(windmillBlade);
            g2d.setColor(Color.BLACK);
            g2d.draw(windmillBlade);
            g2d.rotate(Math.toRadians(90));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CS26115 - Finals Project");
        Entrata_FinalsProject panel = new Entrata_FinalsProject();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Timer timer = new Timer(100, e -> panel.repaint()); 
        timer.start();
    }
}
