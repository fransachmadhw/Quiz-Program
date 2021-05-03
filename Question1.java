import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question1 {
    private JTextArea quest;
    private JTextField chosen;
    private JRadioButton a1_1, a1_2, a1_3, a1_4;
    private ButtonGroup bg;
    private JButton btnNext;
    private JLabel label;

    public static int score = 0;

    public static int getScore() {
        return score;
    }

    public Question1() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 1");
        frame.setSize(700, 600);
        frame.setResizable(true);

        quest = new JTextArea(3, 25);
        quest.setEditable(false);
        quest.setText("\n 1. A machine that uses electronics to input, process, and then output data. ");
        frame.add(quest);

        chosen = new JTextField();
        chosen.setEditable(false);
        chosen.setBounds(35, 500, 235, 40);
        frame.add(chosen);

        ImageIcon soal1 = new ImageIcon("1.jpg");
        label = new JLabel(soal1, JLabel.CENTER);
        label.setIcon(soal1);
        frame.add(label);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

        a1_1 = new JRadioButton("AC Adaptor", false);
        a1_2 = new JRadioButton("Power Bank", false);
        a1_3 = new JRadioButton("Computer", false);
        a1_4 = new JRadioButton("Power Supply", false);

        bg = new ButtonGroup();
        bg.add(a1_1);
        bg.add(a1_2);
        bg.add(a1_3);
        bg.add(a1_4);
        // frame.add(bg);

        JPanel p2 = new JPanel(new GridLayout(0, 1));
        p2.add(a1_1);
        p2.add(a1_2);
        p2.add(a1_3);
        p2.add(a1_4);

        frame.add(p2, BorderLayout.LINE_START);
        p2.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        btnNext = new JButton("Next");
        p3.add(btnNext);
        frame.add("South", p3);

        // a1_1.addActionListener(this);
        // a1_2.addActionListener(this);
        // a1_3.addActionListener(this);
        // btnNext.addActionListener(this);

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a1_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a1_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });


        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
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
                // call the object of NewWindow and set visible true
                Question2 newFrame = new Question2();
                // newFrame.setVisible(true);
                frame.setVisible(false);
                // set default close operation
                // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

    }

    // public void actionPerformed(ActionEvent e)
    // {
    // if(e.getSource() == btnNext)
    // {
    // if (a1_1.isSelected())
    // {
    // score += 0;
    // }

    // else if (a1_2.isSelected())
    // {
    // score += 0;
    // }

    // else if (a1_3.isSelected())
    // {
    // score += 10;
    // }

    // else
    // {
    // score += 0;
    // }

    // Question2 frame = new Question2();
    // frame.setVisible(true);
    // }
    // }
}
