import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


//CLOCK
public class manual_clock extends JFrame {

    private JLabel setTimeLabel;
    private JTextField hour, minutes, seconds;
    private JButton button;

    Graphics2D graphics2D;
    Line2D.Double hourHand;
    Line2D.Double minuteHand;
    Line2D.Double secondHand;

    private manual_clock(){
        super("Clock");
        setSize(700, 800);
        setLayout(null);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setTimeLabel = new JLabel("Set Time: ");
//        setTimeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(setTimeLabel);
        setTimeLabel.setLocation(100, 650);
        setTimeLabel.setSize(100, 50);

        hour = new JTextField("00");
        add(hour);
        hour.setLocation(150, 650);
        hour.setSize(50, 50);

        minutes = new JTextField("00");
        add(minutes);
        minutes.setLocation(200, 650);
        minutes.setSize(50, 50);

        seconds = new JTextField("00");
        add(seconds);
        seconds.setLocation(250, 650);
        seconds.setSize(50, 50);

        button = new JButton("Set");
        button.addActionListener(e -> {

            repaint();
            System.out.println(hour.getText() + " : " + minutes.getText() + " : " + seconds.getText());
        });
        add(button);
        button.setLocation(300, 650);
        button.setSize(100, 50);

        setVisible(true);

    }
    public Shape rotate(Shape shape, double deg){
        AffineTransform transform = new AffineTransform();
        transform.rotate(Math.toRadians(deg), 350, 350);
        return transform.createTransformedShape(shape);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (g instanceof Graphics2D){
            graphics2D = (Graphics2D) g;
            BasicStroke basicStroke = new BasicStroke(5.0f);
            graphics2D.setStroke(basicStroke);

            Ellipse2D.Double clock = new Ellipse2D.Double(100, 100, 500, 500);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(clock);

            Ellipse2D.Double clock2 = new Ellipse2D.Double(90, 90, 520, 520);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(clock2);

            Ellipse2D.Double center = new Ellipse2D.Double(340, 340, 20, 20);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.fill(center);

            Ellipse2D.Double hour12 = new Ellipse2D.Double(335, 120-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour12);

            Ellipse2D.Double hour1 = new Ellipse2D.Double(450, 150-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour1);

            Ellipse2D.Double hour2 = new Ellipse2D.Double(535, 235-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour2);

            Ellipse2D.Double hour3 = new Ellipse2D.Double(565, 350-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour3);

            Ellipse2D.Double hour4 = new Ellipse2D.Double(535, 465-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour4);

            Ellipse2D.Double hour5 = new Ellipse2D.Double(450, 550-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour5);

            Ellipse2D.Double hour6 = new Ellipse2D.Double(335, 580-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour6);

            Ellipse2D.Double hour7 = new Ellipse2D.Double(220, 550-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour7);

            Ellipse2D.Double hour8 = new Ellipse2D.Double(135, 465-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour8);

            Ellipse2D.Double hour9 = new Ellipse2D.Double(105, 350-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour9);

            Ellipse2D.Double hour10 = new Ellipse2D.Double(135, 235-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour10);

            Ellipse2D.Double hour11 = new Ellipse2D.Double(220, 150-15, 30, 30);
            graphics2D.setPaint(Color.BLACK);
            graphics2D.draw(hour11);

            graphics2D.drawString("Joshua Kyle K. Entrata", 320, 250);
            drawHourHand();
            drawMinuteHand();
            drawSecondHand();

        }
    }

    public void drawHourHand(){
        BasicStroke basicStroke2 = new BasicStroke(7.0f);
        graphics2D.setStroke(basicStroke2);
        hourHand = new Line2D.Double(350, 350, 350, 200);
        graphics2D.setPaint(Color.GRAY);
        if (hour.getText() != null && minutes.getText() != null && seconds.getText() != null){
            double deg = (Integer.parseInt(hour.getText()) * 30) + 
                    (Integer.parseInt(minutes.getText()) / 2);
            graphics2D.draw(rotate(hourHand, deg));
        }else {
            graphics2D.draw(hourHand);
        }

    }

    public void drawMinuteHand(){
        BasicStroke basicStroke2 = new BasicStroke(7.0f);
        graphics2D.setStroke(basicStroke2);
        minuteHand = new Line2D.Double(350, 350, 350, 190);
        graphics2D.setPaint(Color.BLUE);
        if (hour.getText() != null && minutes.getText() != null && seconds.getText() != null) {
            double deg = Integer.parseInt(minutes.getText()) * 6;
            graphics2D.draw(rotate(hourHand, deg));
        }else {
            graphics2D.draw(minuteHand);
        }

    }

    public void drawSecondHand(){
        BasicStroke basicStroke2 = new BasicStroke(7.0f);
        graphics2D.setStroke(basicStroke2);
        secondHand = new Line2D.Double(350, 350, 350, 180);
        graphics2D.setPaint(Color.RED);
        if (hour.getText() != null && minutes.getText() != null && seconds.getText() != null) {
            double deg = Integer.parseInt(seconds.getText()) * 6;
            graphics2D.draw(rotate(secondHand, deg));
        }else {
            graphics2D.draw(secondHand);
        }

    }

    public static void main(String[] args) {
        new manual_clock();
    }
}
