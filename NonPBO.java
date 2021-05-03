import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
    On this case, we're not using any OOP elements such as like Inhertance, Encapsulation, Abstract, Interface, etc
    So, we write all declarations manually one by one
*/

public class NonPBO 
{
    static String username;
    static String country;
    static int score = 0;
    static String answer6;
    static String answer7;
    static String answer8;
    static String answer9;
    static String answer10;
    static String answer11;

    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Hello, good luck on working these questions", 
        "Computer Science Quiz", JOptionPane.INFORMATION_MESSAGE);


        /***********************************************************
        Starter configurations are below
        ***********************************************************/
        JFrame starterFrame = new JFrame("Computer Science Quiz");
        starterFrame.setBounds(200, 200, 500, 325);
        starterFrame.setLayout(null);
        starterFrame.setVisible(true);

        JLabel starterTitle = new JLabel("Let me know you first!!");
        starterTitle.setBounds(185, 25, 150, 25);
        starterFrame.add(starterTitle);

        JLabel starterLabel_1 = new JLabel("Username : ");
        starterLabel_1.setBounds(25, 75, 100, 25);
        starterFrame.add(starterLabel_1);

        JTextField starterNama = new JTextField();
        starterNama.setBounds(125, 75, 95, 30);
        starterFrame.add(starterNama);

        JLabel starterLabel_2 = new JLabel("Country : ");
        starterLabel_2.setBounds(25, 125, 100, 25);
        starterFrame.add(starterLabel_2);

        JTextField starterNegara = new JTextField();
        starterNegara.setBounds(125, 125, 95, 30);
        starterFrame.add(starterNegara);

        JButton starterSubmit = new JButton("Submit");
        starterSubmit.setBounds(200, 200, 90, 30);
        starterFrame.add(starterSubmit);

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2 - starterFrame.getSize().width / 2;
        int y = layar.height / 2 - starterFrame.getSize().height / 2;

        starterFrame.setLocation(x, y);
        starterFrame.setResizable(false);
        starterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        /***********************************************************
        Question 1 configurations are below
        ***********************************************************/

        JFrame question1Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 1");
        question1Frame.setSize(700, 600);
        question1Frame.setResizable(false);

        JTextArea quest1 = new JTextArea(3, 25);
        quest1.setEditable(false);
        quest1.setText("\n 1. A machine that uses electronics to input6, process, and then output data. ");
        question1Frame.add(quest1);

        JTextField chosen1 = new JTextField();
        chosen1.setEditable(false);
        chosen1.setBounds(35, 500, 235, 40);
        question1Frame.add(chosen1);

        ImageIcon soal1 = new ImageIcon("1.jpg");
        JLabel label1 = new JLabel(soal1, JLabel.CENTER);
        label1.setIcon(soal1);
        question1Frame.add(label1);

        JPanel quest1_p1 = new JPanel();
        quest1_p1.add(quest1);
        quest1_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question1Frame.add("North", quest1_p1);

        JRadioButton a1_1 = new JRadioButton("AC Adaptor", false);
        JRadioButton a1_2 = new JRadioButton("Power Bank", false);
        JRadioButton a1_3 = new JRadioButton("Computer", false);
        JRadioButton a1_4 = new JRadioButton("Power Supply", false);

        ButtonGroup quest1_bg = new ButtonGroup();
        quest1_bg.add(a1_1);
        quest1_bg.add(a1_2);
        quest1_bg.add(a1_3);
        quest1_bg.add(a1_4);
        // question1Frame.add(quest1_bg);

        JPanel quest1_p2 = new JPanel(new GridLayout(0, 1));
        quest1_p2.add(a1_1);
        quest1_p2.add(a1_2);
        quest1_p2.add(a1_3);
        quest1_p2.add(a1_4);

        question1Frame.add(quest1_p2, BorderLayout.LINE_START);
        quest1_p2.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        JPanel quest1_p3 = new JPanel();
        quest1_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question1_btnNext = new JButton("Next");
        quest1_p3.add(question1_btnNext);
        question1Frame.add("South", quest1_p3);

        // Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x_1 = layar.width / 2  - question1Frame.getSize().width / 2;
        int y_1 = layar.height / 2 - question1Frame.getSize().height / 2;

        question1Frame.setLocation(x_1, y_1);

        question1Frame.setVisible(false);
        question1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen1.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen1.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen1.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen1.setText(" Your choice : " + e.getActionCommand());
            }
        });





        /***********************************************************
        Transition from starterFrame to question1Frame configurations are below
        ***********************************************************/

        // In order to connect 2 frames, we should at least write JFrame declarations of them first

        starterSubmit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                username = starterNama.getText();
                country = starterNegara.getText();
                if (username.equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Username must be filled", 
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
                    
                } 
                else if (country.equals("")) 
                {
                    JOptionPane.showMessageDialog(null, "Country must be filled", 
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
                    
                } 
                else 
                {
                    if ((!username.matches("[a-zA-Z]+"))) 
                    {
                        JOptionPane.showMessageDialog(null, "Username is only permitable using words", 
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
                        
                    } 
                    else if (!country.matches("[a-zA-Z]+")) 
                    {
                        JOptionPane.showMessageDialog(null, "Country is only permitable using words", 
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
                        
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Good Luck !");
                        starterFrame.setVisible(false);   
                        question1Frame.setVisible(true); 
                    }
                }
            } 
        });




        /***********************************************************
        Question 2 configurations are below
        ***********************************************************/

        JFrame question2Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 2");
        question2Frame.setSize(700, 600);
        question2Frame.setResizable(false);

        JTextArea quest2 = new JTextArea(3, 5);
        quest2.setEditable(false);
        quest2.setText("\n 2. The study of algorithmic processes, computational machines and computation itself. ");
        question2Frame.add(quest2);

        JTextField chosen2 = new JTextField();
        chosen2.setEditable(false);
        chosen2.setBounds(35, 500, 235, 40);
        question2Frame.add(chosen2);

        ImageIcon soal2 = new ImageIcon("2.jpg");
        JLabel label72 = new JLabel(soal2, JLabel.CENTER);
        label72.setIcon(soal2);
        question2Frame.add(label72);

        JPanel quest2_p1 = new JPanel();
        quest2_p1.add(quest2);
        quest2_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question2Frame.add("North", quest2_p1);

        JRadioButton a2_1 = new JRadioButton("Computer Science", false);
        JRadioButton a2_2 = new JRadioButton("Computer Scientist", false);
        JRadioButton a2_3 = new JRadioButton("Computer Engineering", false);
        JRadioButton a2_4 = new JRadioButton("Computer Programming", false);

        ButtonGroup quest2_bg = new ButtonGroup();
        quest2_bg.add(a2_1);
        quest2_bg.add(a2_2);
        quest2_bg.add(a2_3);
        quest2_bg.add(a2_4);

        JPanel quest2_p2 = new JPanel(new GridLayout(0, 1));
        quest2_p2.add(a2_1);
        quest2_p2.add(a2_2);
        quest2_p2.add(a2_3);
        quest2_p2.add(a2_4);

        question2Frame.add(quest2_p2, BorderLayout.LINE_START);
        quest2_p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel quest2_p3 = new JPanel();
        quest2_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question2_btnNext = new JButton("Next");
        quest2_p3.add(question2_btnNext);
        question2Frame.add("South", quest2_p3);

        int x_2 = layar.width / 2  - question1Frame.getSize().width / 2;
        int y_2 = layar.height / 2 - question1Frame.getSize().height / 2;

        question2Frame.setLocation(x_2, y_2);

        question2Frame.setVisible(false);
        question2Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a2_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen2.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen2.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen2.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen2.setText(" Your choice : " + e.getActionCommand());
            }
        });





        /***********************************************************
        Transition from question1Frame to question2Frame configurations are below
        ***********************************************************/

        question1_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                if (a1_1.isSelected()) {
                    score += 0;
                }

                else if (a1_2.isSelected()) {
                    score += 0;
                }

                else if (a1_3.isSelected()) {
                    score += 10;
                }

                else if (a1_4.isSelected()) {
                    score += 0;
                }

                else {
                    score += 0;
                }
                question1Frame.setVisible(false); 
                question2Frame.setVisible(true); 
            }
        });





        /***********************************************************
        Question 3 configurations are below
        ***********************************************************/

        JFrame question3Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 3");
        question3Frame.setSize(700, 600);
        question3Frame.setResizable(false);

        JTextArea quest3 = new JTextArea(3, 5);
        quest3.setEditable(false);
        quest3.setText("\n 3. Both Java and JavaScript are much different. ");
        question3Frame.add(quest3);

        JTextField chosen3 = new JTextField();
        chosen3.setEditable(false);
        chosen3.setBounds(35, 500, 235, 40);
        question3Frame.add(chosen3);

        ImageIcon soal3 = new ImageIcon("3_1.jpg");
        JLabel label73 = new JLabel(soal3, JLabel.CENTER);
        label73.setIcon(soal3);
        question3Frame.add(label73);

        JPanel quest3_p1 = new JPanel();
        quest3_p1.add(quest3);
        quest3_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question3Frame.add("North", quest3_p1);

        JRadioButton a3_1 = new JRadioButton("Exactly!", false);
        JRadioButton a3_2 = new JRadioButton("I Don't Think So", false);
        JRadioButton a3_3 = new JRadioButton("Really?", false);
        JRadioButton a3_4 = new JRadioButton("Probably", false);

        ButtonGroup quest3_bg = new ButtonGroup();
        quest3_bg.add(a3_1);
        quest3_bg.add(a3_2);
        quest3_bg.add(a3_3);
        quest3_bg.add(a3_4);

        JPanel quest3_p2 = new JPanel(new GridLayout(0, 1));
        quest3_p2.add(a3_1);
        quest3_p2.add(a3_2);
        quest3_p2.add(a3_3);
        quest3_p2.add(a3_4);

        question3Frame.add(quest3_p2, BorderLayout.LINE_START);
        quest3_p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel quest3_p3 = new JPanel();
        quest3_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question3_btnNext = new JButton("Next");
        quest3_p3.add(question3_btnNext);
        question3Frame.add("South", quest3_p3);

        int x_3 = layar.width / 2  - question3Frame.getSize().width / 2;
        int y_3 = layar.height / 2 - question3Frame.getSize().height / 2;

        question3Frame.setLocation(x_3, y_3);

        question3Frame.setVisible(false);
        question3Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a3_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen3.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen3.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen3.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen3.setText(" Your choice : " + e.getActionCommand());
            }
        });





        /***********************************************************
        Transition from question2Frame to question3Frame configurations are below
        ***********************************************************/

        question2_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                if (a2_1.isSelected()) {
                    score += 10;
                }

                else if (a2_2.isSelected()) {
                    score += 0;
                }

                else if (a2_3.isSelected()) {
                    score += 0;
                }

                else if (a2_4.isSelected()) {
                    score += 0;
                }

                else {
                    score += 0;
                }
                question2Frame.setVisible(false); 
                question3Frame.setVisible(true); 
            }
        });





        /***********************************************************
        Question 4 configurations are below
        ***********************************************************/

        JFrame question4Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 4");
        question4Frame.setSize(700, 600);
        question4Frame.setResizable(false);

        JTextArea quest4 = new JTextArea(3, 5);
        quest4.setEditable(false);
        quest4.setText("\n 4. Which is the advantage of Linked List? (Except) ");
        question4Frame.add(quest4);

        JTextField chosen4 = new JTextField();
        chosen4.setEditable(false);
        chosen4.setBounds(35, 500, 235, 40);
        question4Frame.add(chosen4);

        ImageIcon soal4 = new ImageIcon("4.png");
        JLabel label74 = new JLabel(soal4, JLabel.CENTER);
        label74.setIcon(soal4);
        question4Frame.add(label74);

        JPanel quest4_p1 = new JPanel();
        quest4_p1.add(quest4);
        quest4_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question4Frame.add("North", quest4_p1);

        JRadioButton a4_1 = new JRadioButton("Dynamic Data Structure", false);
        JRadioButton a4_2 = new JRadioButton("Insertion and Deletion", false);
        JRadioButton a4_3 = new JRadioButton("Reverse Traversing", false);
        JRadioButton a4_4 = new JRadioButton("Forwarding Data", false);

        ButtonGroup quest4_bg = new ButtonGroup();
        quest4_bg.add(a4_1);
        quest4_bg.add(a4_2);
        quest4_bg.add(a4_3);
        quest4_bg.add(a4_4);

        JPanel quest4_p2 = new JPanel(new GridLayout(0, 1));
        quest4_p2.add(a4_1);
        quest4_p2.add(a4_2);
        quest4_p2.add(a4_3);
        quest4_p2.add(a4_4);

        question4Frame.add(quest4_p2, BorderLayout.LINE_START);
        quest4_p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel quest4_p3 = new JPanel();
        quest4_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question4_btnNext = new JButton("Next");
        quest4_p3.add(question4_btnNext);
        question4Frame.add("South", quest4_p3);

        int x_4 = layar.width / 2  - question4Frame.getSize().width / 2;
        int y_4 = layar.height / 2 - question4Frame.getSize().height / 2;

        question4Frame.setLocation(x_4, y_4);

        question4Frame.setVisible(false);
        question4Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a4_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen4.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen4.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen4.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen4.setText(" Your choice : " + e.getActionCommand());
            }
        });





        /***********************************************************
        Transition from question3Frame to question4Frame configurations are below
        ***********************************************************/

        question3_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                
                if (a3_1.isSelected()) {
                    score += 10;
                }

                else if (a3_2.isSelected()) {
                    score += 0;
                }

                else if (a3_3.isSelected()) {
                    score += 0;
                }

                else if (a3_4.isSelected()) {
                    score += 0;
                }

                else {
                    score += 0;
                }
                question3Frame.setVisible(false); 
                question4Frame.setVisible(true); 
            }
        });





        /***********************************************************
        Question 5 configurations are below
        ***********************************************************/

        JFrame question5Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 5");
        question5Frame.setSize(700, 600);
        question5Frame.setResizable(false);

        JTextArea quest5 = new JTextArea(3, 5);
        quest5.setEditable(false);
        quest5.setText(
                "\n 5. A variable that stores a memory address. Used to store the addresses of other variables or memory items.  ");
        question5Frame.add(quest5);

        JTextField chosen5 = new JTextField();
        chosen5.setEditable(false);
        chosen5.setBounds(35, 500, 235, 40);
        question5Frame.add(chosen5);

        ImageIcon soal5 = new ImageIcon("5.png");
        JLabel label5 = new JLabel(soal5, JLabel.CENTER);
        label5.setIcon(soal5);
        question5Frame.add(label5);

        JPanel quest5_p1 = new JPanel();
        quest5_p1.add(quest5);
        quest5_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question5Frame.add("North", quest5_p1);

        JRadioButton a5_1 = new JRadioButton("Array", false);
        JRadioButton a5_2 = new JRadioButton("Pointer", false);
        JRadioButton a5_3 = new JRadioButton("Typedef", false);
        JRadioButton a5_4 = new JRadioButton("Define", false);

        ButtonGroup bg = new ButtonGroup();
        bg.add(a5_1);
        bg.add(a5_2);
        bg.add(a5_3);
        bg.add(a5_4);

        JPanel quest5_p2 = new JPanel(new GridLayout(0, 1));
        quest5_p2.add(a5_1);
        quest5_p2.add(a5_2);
        quest5_p2.add(a5_3);
        quest5_p2.add(a5_4);

        question5Frame.add(quest5_p2, BorderLayout.LINE_START);
        quest5_p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel quest5_p3 = new JPanel();
        quest5_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question5_btnNext = new JButton("Next");
        quest5_p3.add(question5_btnNext);
        question5Frame.add("South", quest5_p3);

        int x_5 = layar.width / 2  - question5Frame.getSize().width / 2;
        int y_5 = layar.height / 2 - question5Frame.getSize().height / 2;

        question5Frame.setLocation(x_5, y_5);

        question5Frame.setVisible(false);
        question5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a5_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen5.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen5.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen5.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen5.setText(" Your choice : " + e.getActionCommand());
            }
        });




        /***********************************************************
        Transition from question4Frame to question5Frame configurations are below
        ***********************************************************/

        question4_btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (a4_1.isSelected()) 
                {
                    score += 0;
                }

                else if (a4_2.isSelected()) 
                {
                    score += 0;
                }

                else if (a4_3.isSelected()) 
                {
                    score += 10;
                }

                else if (a4_4.isSelected()) 
                {
                    score += 0;
                } 
                
                else 
                {
                    score += 0;
                }

                question4Frame.setVisible(false); 
                question5Frame.setVisible(true); 
            }
        });






        /***********************************************************
        Question 6 configurations are below
        ***********************************************************/

        JFrame question6Frame = new JFrame("Computer Science Quiz");
        question6Frame.setSize(700, 600);
        question6Frame.setResizable(false);

        ImageIcon soal6 = new ImageIcon("6.jpg");
        JLabel label76 = new JLabel(soal6, JLabel.CENTER);
        label76.setIcon(soal6);
        label76.setBounds(175, 100, 325, 200);
        question6Frame.add(label76);

        JLabel input6 = new JLabel("Input your answer Here :");
        input6.setBounds(260, 310, 300, 50);
        question6Frame.add(input6);

        JTextField a6 = new JTextField();
        a6.setBounds(185, 350, 300, 30);
        question6Frame.add(a6);

        JTextArea quest6 = new JTextArea(3, 5);
        quest6.setEditable(false);
        quest6.setText("\n 6. What is this? ");
        question6Frame.add(quest6);

        JPanel quest6_p1 = new JPanel();
        quest6_p1.add(quest6);
        quest6_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question6Frame.add("North", quest6_p1);

        JPanel quest6_p3 = new JPanel();
        quest6_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question6_btnNext = new JButton("Next");
        quest6_p3.add(question6_btnNext);
        question6Frame.add("South", quest6_p3);

        int x_6 = layar.width / 2  - question6Frame.getSize().width / 2;
        int y_6 = layar.height / 2 - question6Frame.getSize().height / 2;

        question6Frame.setLocation(x_6, y_6);

        question6Frame.setVisible(false);
        question6Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        /***********************************************************
        Transition from question5Frame to question6Frame configurations are below
        ***********************************************************/

        question5_btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (a5_1.isSelected()) 
                {
                    score += 0;
                }

                else if (a5_2.isSelected()) 
                {
                    score += 10;
                }

                else if (a5_3.isSelected()) 
                {
                    score += 0;
                }

                else if (a5_4.isSelected()) 
                {
                    score += 0;
                }

                else 
                {
                    score += 0;
                }

                question5Frame.setVisible(false);
                question6Frame.setVisible(true);
            }
        });






        /***********************************************************
        Question 7 configurations are below
        ***********************************************************/

        JFrame question7Frame = new JFrame("Computer Science Quiz");
        question7Frame.setSize(700, 600);
        question7Frame.setResizable(false);

        ImageIcon soal7 = new ImageIcon("7.png");
        JLabel label7 = new JLabel(soal7, JLabel.CENTER);
        label7.setIcon(soal7);
        label7.setBounds(175, 100, 325, 200);
        question7Frame.add(label7);

        JLabel input7 = new JLabel("Input your answer Here :");
        input7.setBounds(260, 310, 300, 50);
        question7Frame.add(input7);

        JTextField a7 = new JTextField();
        a7.setBounds(185, 350, 300, 30);
        question7Frame.add(a7);

        JTextArea quest7 = new JTextArea(3, 5);
        quest7.setEditable(false);
        quest7.setText(
                "\n 7. Problem that limits the potential of other hardware due to differences in the maximum capabilities of the two components.  ");
        question7Frame.add(quest7);

        JPanel quest7_p1 = new JPanel();
        quest7_p1.add(quest7);
        quest7_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question7Frame.add("North", quest7_p1);

        JPanel quest7_p3 = new JPanel();
        quest7_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question7_btnNext = new JButton("Next");
        quest7_p3.add(question7_btnNext);
        question7Frame.add("South", quest7_p3);

        int x_7 = layar.width / 2  - question7Frame.getSize().width / 2;
        int y_7 = layar.height / 2 - question7Frame.getSize().height / 2;

        question7Frame.setLocation(x_7, y_7);

        question7Frame.setVisible(false);
        question7Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        /***********************************************************
        Transition from question6Frame to question7Frame configurations are below
        ***********************************************************/

        question6_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                answer6 = a6.getText();
                if (answer6.equals("Video Random Access Memory") || answer6.equals("video random access memory")
                        || answer6.equals("Video RAM") || answer6.equals("VRAM")) 
                {
                    score += 10;
                }

                else 
                {
                    score += 0;
                }

                question6Frame.setVisible(false);
                question7Frame.setVisible(true);
            }
        });






        /***********************************************************
        Question 8 configurations are below
        ***********************************************************/

        JFrame question8Frame = new JFrame("Computer Science Quiz");
        // super("Question Number 5");
        question8Frame.setSize(700, 600);
        question8Frame.setResizable(false);

        ImageIcon soal8 = new ImageIcon("8.png");
        JLabel label8 = new JLabel(soal8, JLabel.CENTER);
        label8.setIcon(soal8);
        label8.setBounds(175, 100, 325, 200);
        question8Frame.add(label8);

        JLabel input8 = new JLabel("Input your answer Here :");
        input8.setBounds(260, 310, 300, 50);
        question8Frame.add(input8);

        JTextField a8 = new JTextField();
        a8.setBounds(185, 350, 300, 30);
        question8Frame.add(a8);

        JTextArea quest8 = new JTextArea(3, 5);
        quest8.setEditable(false);
        quest8.setText("\n 8. Dynamic voltage scaling to decrease voltage  ");
        question8Frame.add(quest8);

        JPanel quest8_p1 = new JPanel();
        quest8_p1.add(quest8);
        quest8_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question8Frame.add("North", quest8_p1);

        JPanel quest8_p3 = new JPanel();
        quest8_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question8_btnNext = new JButton("Next");
        quest8_p3.add(question8_btnNext);
        question8Frame.add("South", quest8_p3);

        int x_8 = layar.width / 2  - question8Frame.getSize().width / 2;
        int y_8 = layar.height / 2 - question8Frame.getSize().height / 2;

        question8Frame.setLocation(x_8, y_8);

        question8Frame.setVisible(false);
        question8Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        /***********************************************************
        Transition from question7Frame to question8Frame configurations are below
        ***********************************************************/

        question7_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                answer7 = a7.getText();
                if (answer7.equals("Bottleneck") || answer7.equals("bottleneck")) 
                {
                    score += 10;
                }

                else 
                {
                    score += 0;
                }
                question7Frame.setVisible(false);
                question8Frame.setVisible(true);
            }
        });






        /***********************************************************
        Question 9 configurations are below
        ***********************************************************/

        JFrame question9Frame = new JFrame("Computer Science Quiz");
        question9Frame.setSize(700, 600);
        question9Frame.setResizable(false);

        ImageIcon soal9 = new ImageIcon("9.jpg");
        JLabel label9 = new JLabel(soal9, JLabel.CENTER);
        label9.setIcon(soal9);
        label9.setBounds(175, 100, 325, 200);
        question9Frame.add(label9);

        JLabel input9 = new JLabel("Input your answer Here :");
        input9.setBounds(260, 310, 300, 50);
        question9Frame.add(input9);

        JTextField a9 = new JTextField();
        a9.setBounds(185, 350, 300, 30);
        question9Frame.add(a9);

        JTextArea quest9 = new JTextArea(3, 5);
        quest9.setEditable(false);
        quest9.setText(
                "\n 9. A branch of artificial intelligence (AI) focused on building applications. ");
        question9Frame.add(quest9);

        JPanel quest9_p1 = new JPanel();
        quest9_p1.add(quest9);
        quest9_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question9Frame.add("North", quest9_p1);

        JPanel quest9_p3 = new JPanel();
        quest9_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question9_btnNext = new JButton("Next");
        quest9_p3.add(question9_btnNext);
        question9Frame.add("South", quest9_p3);

        int x_9 = layar.width / 2  - question9Frame.getSize().width / 2;
        int y_9 = layar.height / 2 - question9Frame.getSize().height / 2;

        question9Frame.setLocation(x_9, y_9);

        question9Frame.setVisible(false);
        question9Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        /***********************************************************
        Transition from question8Frame to question9Frame configurations are below
        ***********************************************************/

        question8_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                answer8 = a8.getText();
                if (answer8.equals("Undervolting") || answer8.equals("Undervolt") || answer8.equals("undervolting")
                        || answer8.equals("undervolt")) 
                {
                    score += 10;
                }

                else 
                {
                    score += 0;
                }

                question8Frame.setVisible(false);
                question9Frame.setVisible(true);
            }
        });





        /***********************************************************
        Question 10 configurations are below
        ***********************************************************/

        JFrame question10Frame = new JFrame("Computer Science Quiz");
        question10Frame.setSize(700, 600);
        question10Frame.setResizable(false);

        ImageIcon soal10 = new ImageIcon("10.png");
        JLabel label10 = new JLabel(soal10, JLabel.CENTER);
        label10.setIcon(soal10);
        label10.setBounds(175, 100, 325, 200);
        question10Frame.add(label10);

        JLabel input10 = new JLabel("Input your answer Here :");
        input10.setBounds(260, 310, 300, 50);
        question10Frame.add(input10);

        JTextField a10 = new JTextField();
        a10.setBounds(185, 350, 300, 30);
        question10Frame.add(a10);

        JTextArea quest10 = new JTextArea(4, 5);
        quest10.setEditable(false);
        quest10.setText(
                "\n 10. A free, open-source PHP web framework, created by Taylor Otwell \n and intended for the development of web applications.  ");
        question10Frame.add(quest10);

        JPanel quest10_p1 = new JPanel();
        quest10_p1.add(quest10);
        quest10_p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        question10Frame.add("North", quest10_p1);

        JPanel quest10_p3 = new JPanel();
        quest10_p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        JButton question10_btnNext = new JButton("Next");
        quest10_p3.add(question10_btnNext);
        question10Frame.add("South", quest10_p3);

        int x_10 = layar.width / 2 - question10Frame.getSize().width / 2;
        int y_10 = layar.height / 2 - question10Frame.getSize().height / 2;

        question10Frame.setLocation(x_10, y_10);
        question10Frame.setVisible(false);
        question10Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        /***********************************************************
        Transition from question9Frame to question10Frame configurations are below
        ***********************************************************/

        question9_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                answer9 = a9.getText();
                if (answer9.equals("Machine Learning") || answer9.equals("Machine learning")
                        || answer9.equals("machine learning")) 
                {
                    score += 10;
                }

                else 
                {
                    score += 0;
                }

                question9Frame.setVisible(false);
                question10Frame.setVisible(true);
            }
        });






        /***********************************************************
        Result configurations are below
        ***********************************************************/

        JLabel gambar = new JLabel();

        if (score > 70) 
        {
            ImageIcon picture = new ImageIcon("Congratulation.jpeg");
            gambar.setIcon(picture);
            gambar.setBounds(105, 225, 325, 200);

        } else 
        {
            ImageIcon picture = new ImageIcon("try again.png");
            gambar.setIcon(picture);
            gambar.setBounds(125, 225, 325, 200);
        }

        JFrame resultFrame = new JFrame("Computer Science Quiz");
        resultFrame.setBounds(500, 500, 500, 600);
        resultFrame.setLayout(null);

        JLabel title = new JLabel("Here's your result");
        title.setBounds(200, 25, 150, 25);
        resultFrame.add(title);

        /*
            Attention, We think that something isn't right with these 3 values calling
            Because the shown values aren't the proper values. But, if we call it with other than JLabel. Not only JLabel, but also in JButton, JTextField, JTextArea, etc
            For example, like JOptionPane. The result is correct 
        */
        // Call the gathered username value to shown
        JLabel result_label1 = new JLabel();
        result_label1.setText("Your name : " + username);
        result_label1.setBounds(25, 75, 200, 25);
        resultFrame.add(result_label1);

        // Call the gathered country value to shown
        JLabel result_label2 = new JLabel("Your Country : " + country);
        result_label2.setBounds(25, 125, 200, 25);
        resultFrame.add(result_label2);

        // Call the gathered score value to shown
        JLabel result_label3 = new JLabel("Your Score : " + score);
        result_label3.setBounds(25, 175, 100, 25);
        resultFrame.add(result_label3);

        JButton again = new JButton("Try Again");
        again.setBounds(100, 475, 90, 30);
        resultFrame.add(again);

        JButton exit = new JButton("Exit");
        exit.setBounds(300, 475, 90, 30);
        resultFrame.add(exit);

        int x_result = layar.width / 2 - resultFrame.getSize().width / 2;
        int y_result = layar.height / 2 - resultFrame.getSize().height / 2;

        resultFrame.add(gambar);
        resultFrame.setLocation(x_result, y_result);
        resultFrame.setResizable(false);
        resultFrame.setVisible(false);
        resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        /***********************************************************
        Transition from question10Frame to resultFrame configurations are below
        ***********************************************************/

        question10_btnNext.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                answer10 = a10.getText();
                if (answer10.equals("Laravel") || answer10.equals("laravel")) 
                {
                    score += 10;
                } 
                else 
                {
                    score += 0;
                }
                JOptionPane.showMessageDialog(null, username + country, 
                "Computer Science Quiz", JOptionPane.INFORMATION_MESSAGE);
                question10Frame.setVisible(false);
                resultFrame.setVisible(true);
            }
        });






        /***********************************************************
        Final transition from result frame configurations are below
        ***********************************************************/

        again.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                // JOptionPane.showMessageDialog(null, username_result + country_result, 
                // "Computer Science Quiz", JOptionPane.INFORMATION_MESSAGE);
                resultFrame.setVisible(false);
                starterFrame.setVisible(true);
            }
        });

        exit.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
    }
}
