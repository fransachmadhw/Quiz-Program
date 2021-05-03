import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Starter extends User {
    private JTextField nama, negara;
    private JLabel title, label1, label2;
    private JButton submit;

    public static String username;
    public static String country;

    public static String getName() {
        return username;
    }

    public static String getCountry() {
        return country;
    }

    public Starter() {
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

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // submit.addActionListener(this);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try {
                    setName();
                    setCountry();
                    // name = nama.getText();
                    // country = negara.getText();
                    if (username.equals("")) {
                        throw new Exception("\n Username must be filled");
                    } else if (country.equals("")) {
                        throw new Exception("\n Country must be filled");
                    } else {
                        if ((!username.matches("[a-zA-Z]+"))) {
                            throw new Exception("\n Username is only permitable using words");
                        } else if (!country.matches("[a-zA-Z]+")) {
                            throw new Exception("\n Country is only permitable using words");
                        } else {
                            JOptionPane.showMessageDialog(null, "Good Luck !");
                            frame.setVisible(false);
                            Question1 newFrame = new Question1();     
                        }
                    }
                } catch (Exception z) {
                    JOptionPane.showMessageDialog(null, "" + z);
                    System.err.println("" + z);
                }
                // call the object of NewWindow and set visible true
                // Question1 newFrame = new Question1();
                // newFrame.setVisible(true);
                // frame.setVisible(false);
                // set default close operation
                // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    public void setName() {
        username = nama.getText();
    }

    public void setCountry() {
        country = negara.getText();
    }
}
