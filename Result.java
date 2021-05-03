import javax.swing.*;
import java.awt.event.*;
import java.util.jar.Attributes.Name;
import java.awt.*;

class Result {
    private JLabel title, label1, label2, label3, nama, negara, hasil, gambar;
    private JButton again, exit;

    public static int score = Question10.getScore(); // Pass the score value from question10 to this class
    public static String username = Starter.getName(); // Declare username variable as method
    public static String country = Starter.getCountry(); // Same like username

    // These accessor methods below are to get a value of each variable within the methods
    public static int getScore() 
    {
        return score;
    }

    public static String getName() 
    {
        return username;
    }

    public static String getCountry() 
    {
        return country;
    }

    public Result() 
    {
        // Create a conditions about which image will be shown. Depends on the gathered score
        if (score > 70) 
        {
            ImageIcon picture = new ImageIcon("Congratulation.jpeg");
            gambar = new JLabel();
            gambar.setIcon(picture);
            gambar.setBounds(105, 225, 325, 200);

        } 
        else 
        {
            ImageIcon picture = new ImageIcon("try again.png");
            gambar = new JLabel();
            gambar.setIcon(picture);
            gambar.setBounds(125, 225, 325, 200);
        }

        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setBounds(500, 500, 500, 600);
        frame.setLayout(null);
        frame.setVisible(true);

        title = new JLabel("Here's your result");
        title.setBounds(200, 25, 150, 25);
        frame.add(title);

        label1 = new JLabel("Your name : " + getName());
        label1.setBounds(25, 75, 200, 25);
        frame.add(label1);

        label2 = new JLabel("Your Country : " + getCountry());
        label2.setBounds(25, 125, 200, 25);
        frame.add(label2);

        label3 = new JLabel("Your Score : " + getScore());
        label3.setBounds(25, 175, 100, 25);
        frame.add(label3);

        again = new JButton("Try Again");
        again.setBounds(100, 475, 90, 30);
        frame.add(again);

        exit = new JButton("Exit");
        exit.setBounds(300, 475, 90, 30);
        frame.add(exit);

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.add(gambar);
        frame.setLocation(x, y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        again.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Starter newFrame = new Starter();
            }
        });

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
