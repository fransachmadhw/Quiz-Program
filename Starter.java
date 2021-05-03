import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// extends means this class (Starter) is a child class of User class. Apply some methods in User class
// User class isn't a common class in this case. But it's an abstract class that contains methods with no body
public class Starter extends User 
{ 
    // These are sample of encapsulations. Using private modifier which it means another class outside this class (not connected) can't apply these GUI objects
    private JTextField nama, negara;
    private JLabel title, label1, label2;
    private JButton submit;

    // These are empty variables
    public static String username;
    public static String country;

    // These methods are originally from this class. Literally, both are kind of Accessor Method. Its use mainly is to get a value by a return command
    public static String getName() 
    {
        return username;
    }

    public static String getCountry() 
    {
        return country;
    }

    // This is a constructor method (Use the same name with the class)
    public Starter() 
    {
        // Some created objects below are implementation of Java GUI library
        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setBounds(200, 200, 500, 325);
        frame.setLayout(null);
        frame.setVisible(true);

        title = new JLabel("Let me know you first!!");
        title.setBounds(185, 25, 150, 25);
        frame.add(title);

        label1 = new JLabel("Username : ");
        label1.setBounds(25, 75, 100, 25);
        frame.add(label1);

        nama = new JTextField();
        nama.setBounds(125, 75, 95, 30);
        frame.add(nama);

        label2 = new JLabel("Country : ");
        label2.setBounds(25, 125, 100, 25);
        frame.add(label2);

        negara = new JTextField();
        negara.setBounds(125, 125, 95, 30);
        frame.add(negara);

        submit = new JButton("Submit");
        submit.setBounds(200, 200, 90, 30);
        frame.add(submit);

        // Get a user screen size
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // Dividing both width and height by 2 so that the frame will show in the center of the screen
        int x = layar.width / 2 - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        // Locate the frame with declared x and y
        frame.setLocation(x, y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // submit.addActionListener(this);

        // Adding an action listener element manually to submit button without implements action listener to the whole class
        submit.addActionListener(new ActionListener() 
        {
            // To tell the object to do something after it being clicked by user
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    // Run the mutator methods which originally from User class (parent)
                    setName();
                    setCountry();

                    // Create some conditions to make the system easier to decide something to do next
                    if (username.equals("")) 
                    {
                        throw new Exception("\n Username must be filled");
                    } 
                    else if (country.equals("")) 
                    {
                        throw new Exception("\n Country must be filled");
                    } 
                    else 
                    {
                        if ((!username.matches("[a-zA-Z]+"))) 
                        {
                            throw new Exception("\n Username is only permitable using words");
                        } 
                        else if (!country.matches("[a-zA-Z]+")) 
                        {
                            throw new Exception("\n Country is only permitable using words");
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Good Luck !");
                            frame.setVisible(false);
                            Question1 newFrame = new Question1();     
                        }
                    }
                } 

                // To catch all thrown exceptions
                catch (Exception z) 
                {
                    JOptionPane.showMessageDialog(null, "" + z);
                    System.err.println("" + z);
                }
            }
        });
    }

    // These methods below are the declaration of Mutator methods which applied before
    public void setName() 
    {
        username = nama.getText();
    }

    public void setCountry() 
    {
        country = negara.getText();
    }
}
