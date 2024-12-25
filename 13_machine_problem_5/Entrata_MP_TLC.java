
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class Entrata_MP_TLC extends Frame {
    private BufferedImage backgroundImage;

    public Entrata_MP_TLC() {
        try {
            backgroundImage = ImageIO.read(new File("field.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);

        BasicStroke stroke = new BasicStroke(5.0f);
        g2d.setStroke(stroke);
        
        g2d.setPaint(Color.BLACK);
        GeneralPath road = new GeneralPath();
        road.moveTo(0,300);
        road.lineTo(500,300);
        road.lineTo(500,0);
        road.lineTo(800,0);
        road.lineTo(800,300);
        road.lineTo(1300,300);
        road.lineTo(1300,450);
        road.lineTo(800,450);
        road.lineTo(800,800);
        road.lineTo(500,800);
        road.lineTo(500,450);
        road.lineTo(0,450);
        road.lineTo(0,300);
        g2d.draw(road);
        g2d.setPaint(Color.GRAY);
        g2d.fill(road);
      
        g2d.setPaint(Color.YELLOW);
        GeneralPath road1 = new GeneralPath ();
        road1.moveTo(645,0);
        road1.lineTo(645,300);
        road1.moveTo(655,0);
        road1.lineTo(655,300);
        road1.moveTo(645,450);
        road1.lineTo(645,800);
        road1.moveTo(655,450);
        road1.lineTo(655,800);
        road1.moveTo(0,370);
        road1.lineTo(500,370);
        road1.moveTo(0,380);
        road1.lineTo(500,380);
        road1.moveTo(800,370);
        road1.lineTo(1300,370);
        road1.moveTo(800,380);
        road1.lineTo(1300,380);
        g2d.draw(road1);
        
    //Stoplight
        g2d.setPaint(Color.BLACK);
        Rectangle2D.Double stoplight_1 = new Rectangle2D.Double(225,75,50,200);
        g2d.fill(stoplight_1);
        Rectangle2D.Double stoplight_2 = new Rectangle2D.Double(1025,75,50,200);
        g2d.fill(stoplight_2);
        Rectangle2D.Double stoplight_3 = new Rectangle2D.Double(225,475,50,200);
        g2d.fill(stoplight_3);
        Rectangle2D.Double stoplight_4 = new Rectangle2D.Double(1025,475,50,200);
        g2d.fill(stoplight_4);
        
        g2d.setPaint(Color.RED.darker());
        Ellipse2D.Double red_1 = new Ellipse2D.Double(230,105,40,40);
        g2d.draw(red_1);
        Ellipse2D.Double red_2 = new Ellipse2D.Double(1030,105,40,40);
        g2d.draw(red_2);
        Ellipse2D.Double red_3 = new Ellipse2D.Double(230,505,40,40);
        g2d.draw(red_3);
        Ellipse2D.Double red_4 = new Ellipse2D.Double(1030,505,40,40);
        g2d.draw(red_4);
        
        g2d.setPaint(Color.YELLOW.darker());
        Ellipse2D.Double yellow_1 = new Ellipse2D.Double(230,155,40,40);
        g2d.draw(yellow_1);
        Ellipse2D.Double yellow_2 = new Ellipse2D.Double(1030,155,40,40);
        g2d.draw(yellow_2);
        Ellipse2D.Double yellow_3 = new Ellipse2D.Double(230,555,40,40);
        g2d.draw(yellow_3);
        Ellipse2D.Double yellow_4 = new Ellipse2D.Double(1030,555,40,40);
        g2d.draw(yellow_4);
        
        g2d.setPaint(Color.GREEN.darker());
        Ellipse2D.Double green_1 = new Ellipse2D.Double(230,205,40,40);
        g2d.draw(green_1);
        Ellipse2D.Double green_2 = new Ellipse2D.Double(1030,205,40,40);
        g2d.draw(green_2);
        Ellipse2D.Double green_3 = new Ellipse2D.Double(230,605,40,40);
        g2d.draw(green_3);
        Ellipse2D.Double green_4 = new Ellipse2D.Double(1030,605,40,40);
        g2d.draw(green_4);
        
        //car
        GeneralPath car = new GeneralPath();
        car.moveTo(60,120);
        car.lineTo(80,120);
        car.quadTo(90,140,100,120);
        car.lineTo(160,120);
        car.quadTo(170,140,180,120);
        car.lineTo(200,120);
        car.curveTo(195,100,200,80,160,80);
        car.lineTo(110,80);
        car.lineTo(90,100);
        car.lineTo(60,100);
        car.lineTo(60,120);
        
        AffineTransform translate= new AffineTransform();
        g2d.setPaint(Color.blue);
        translate.setToTranslation(1100,230);
        
        AffineTransform scaling = new AffineTransform();
        g2d.setPaint(Color.blue);
        scaling.setToScale(-1,1);
        g2d.fill(scaling.createTransformedShape(car));
        
        g2d.setPaint(Color.red);
        translate.setToTranslation(200,310);
      
        //Up and Down
        GeneralPath car1 = new GeneralPath();
        car1.moveTo(710,500);
        car1.lineTo(780,500);
        car1.lineTo(780,650);
        car1.lineTo(710,650);
        car1.lineTo(710,500);
        g2d.setPaint(Color.RED);
        g2d.fill(car1);
    
        Rectangle2D.Double car2 = new Rectangle2D.Double(540,100,60,100);
        g2d.setPaint(Color.RED);
        g2d.fill(car2);

        Color darkRed = Color.RED.darker().darker().darker();
        Color darkYellow = Color.YELLOW.darker().darker().darker();
        Color darkGreen = Color.GREEN.darker().darker().darker();
        
        int goRight = 1150;
        int goLeft = 220;
        AffineTransform moveRight = new AffineTransform();
        AffineTransform moveLeft = new AffineTransform();
        
        int yup = 0;
        int ydown = 0;
        AffineTransform movedown = new AffineTransform();
        AffineTransform moveup = new AffineTransform();

        for(int x = 0; x < 33; x++) {
            g2d.setColor(Color.RED);
            g2d.fill(red_2);
            g2d.fill(red_3);
            g2d.fill(red_1);
            g2d.fill(red_4);

            goRight = 1000;
            goLeft = 300;

            for(int z = 0; z < 20; z++){
                //Right Car
                g2d.setColor(Color.RED);
                moveRight.setToTranslation(goRight, 230);
                g2d.fill(moveRight.createTransformedShape(car));
                g2d.setColor(Color.RED);
                moveLeft.setToTranslation(goLeft, 315);
                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                
                runCars(50);
            }
        }
        
        for(int x = 0; x < 90; x++){
            // go1_stp2 green 30 red 30
            for(int y = 0; y < 30; y++) {
                g2d.setColor(Color.GREEN);
                g2d.fill(green_1);
                g2d.fill(green_4);
                g2d.setColor(Color.RED);
                g2d.fill(red_2);
                g2d.fill(red_3);

                g2d.setColor(darkRed);
                g2d.fill(red_1);
                g2d.fill(red_4);

                g2d.setColor(darkYellow);
                g2d.fill(yellow_1);
                g2d.fill(yellow_2);
                g2d.fill(yellow_3);
                g2d.fill(yellow_4);

                g2d.setColor(darkGreen);
                g2d.fill(green_2);
                g2d.fill(green_3);

                goRight = 1300;
                goLeft = 0;
                for(int z = 0; z < 20; z++){
                    g2d.setColor(Color.GREEN);
                    moveRight.setToTranslation(goRight, 230);
                    g2d.fill(moveRight.createTransformedShape(car));
                    g2d.setColor(Color.GREEN);
                    moveLeft.setToTranslation(goLeft, 315);
                    g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                    
                    runCars(50);

                    goRight = goRight - 100;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveRight.createTransformedShape(car));

                    goLeft = goLeft + 100;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                }
            }

            // rdy1_stp2 yellow 3 & go1_stp2 red 3
            
            goRight = 1300;
            goLeft = 0;
            for(int y = 0; y < 3; y++) {
                g2d.setColor(Color.YELLOW);
                g2d.fill(yellow_1);
                g2d.fill(yellow_4);
                g2d.setColor(Color.RED);
                g2d.fill(red_2);
                g2d.fill(red_3);

                g2d.setColor(darkRed);
                g2d.fill(red_1);
                g2d.fill(red_4);

                g2d.setColor(darkYellow);
                g2d.fill(yellow_2);
                g2d.fill(yellow_3);

                g2d.setColor(darkGreen);
                g2d.fill(green_1);
                g2d.fill(green_4);
                g2d.fill(green_2);
                g2d.fill(green_3);

                for(int z = 0; z < 4; z++){
                    g2d.setColor(Color.YELLOW);
                    moveRight.setToTranslation(goRight, 230);
                    g2d.fill(moveRight.createTransformedShape(car));
                    g2d.setColor(Color.YELLOW);
                    moveLeft.setToTranslation(goLeft, 315);
                    g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                    
                    runCars(250);

                    goRight = goRight - 50;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveRight.createTransformedShape(car));

                    goLeft = goLeft + 50;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                }
            }
            
            g2d.setColor(Color.RED);
            g2d.fill(moveRight.createTransformedShape(car));
            g2d.setColor(Color.RED);
            g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));

            // stp1_rdy2 red 30 & stp1_go2 green 30
            for(int y = 0; y < 30; y++) {
                g2d.setColor(Color.RED);
                g2d.fill(red_1);
                g2d.fill(red_4);
                g2d.setColor(Color.GREEN);
                g2d.fill(green_2);
                g2d.fill(green_3);

                g2d.setColor(darkRed);
                g2d.fill(red_2);
                g2d.fill(red_3);

                g2d.setColor(darkYellow);
                g2d.fill(yellow_3);
                g2d.fill(yellow_1);
                g2d.fill(yellow_4);
                g2d.fill(yellow_2);

                yup = 50;
                ydown = -50;

                for(int z = 0; z < 20; z++){
                    g2d.setColor(Color.GREEN);
                    moveup.setToTranslation(00,yup);
                    g2d.fill(moveup.createTransformedShape(car1));
                    g2d.setColor(Color.GREEN);
                    movedown.setToTranslation(00,ydown);
                    g2d.fill(movedown.createTransformedShape(car2));

                    runCars(50);

                    //Right Car
                    yup = yup - 50;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveup.createTransformedShape(car1));

                    //Left Car
                    ydown = ydown + 50;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(movedown.createTransformedShape(car2));
                }
            }
            
            // stp1_rdy2 red 3 & stp1_rdy2 yellow 3
            yup = 100;
            ydown = -100;
            for(int y = 0; y < 3; y++) {
                g2d.setColor(Color.RED);
                g2d.fill(red_1);
                g2d.fill(red_4);
                g2d.setColor(Color.YELLOW);
                g2d.fill(yellow_2);
                g2d.fill(yellow_3);

                g2d.setColor(darkYellow);
                g2d.fill(yellow_1);
                g2d.fill(yellow_4);

                g2d.setColor(darkGreen);
                g2d.fill(green_2);
                g2d.fill(green_3);
                g2d.fill(green_1);
                g2d.fill(green_4);


                for(int z = 0; z < 4; z++){
                    g2d.setColor(Color.YELLOW);
                    moveup.setToTranslation(00,yup);
                    g2d.fill(moveup.createTransformedShape(car1));
                    g2d.setColor(Color.YELLOW);
                    movedown.setToTranslation(00,ydown);
                    g2d.fill(movedown.createTransformedShape(car2));

                    runCars(250);

                    yup = yup - 10;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(moveup.createTransformedShape(car1));

                    ydown = ydown + 10;
                    g2d.setColor(Color.GRAY);
                    g2d.fill(movedown.createTransformedShape(car2));
                }
            }

            g2d.setColor(Color.GRAY);
            g2d.fill(moveRight.createTransformedShape(car));

            goLeft = goLeft + 50;
            g2d.setColor(Color.GRAY);
            g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
            
            g2d.setColor(Color.RED);
            g2d.fill(moveup.createTransformedShape(car1));
            g2d.setColor(Color.RED);
            g2d.fill(movedown.createTransformedShape(car2));
        }
    }  

     public void runCars(long t1){
        long finishGo = (new Date()).getTime() + t1;
        while((new Date()).getTime() < finishGo){
        }    
    }

    public static void main(String[] args) {
       Entrata_MP_TLC s = new Entrata_MP_TLC();
       s.setTitle("Entrata_MP_TLC");
       s.setSize (1300,700);
       s.setBackground(new Color(170,215,165));
       s.setVisible(true);
       s.setPreferredSize(new Dimension(500,500));
       s.addWindowListener
        (   new WindowAdapter() 
            {   public void windowClosing( WindowEvent e )
                {
                   System.exit(0);
                }
            }
        ); 
       
    }
}


