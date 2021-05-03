import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question2 {
    private JTextArea quest;
    private JTextField chosen;
    private JRadioButton a2_1, a2_2, a2_3, a2_4;
    private ButtonGroup bg;
    private JButton btnNext;
    private JLabel label;

    public static int score = Question1.getScore();

    public static int getScore() {
        return score;
    }

    public Question2() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 2");
        frame.setSize(700, 600);
        frame.setResizable(false);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText("\n 2. The study of algorithmic processes, computational machines and computation itself. ");
        frame.add(quest);

        chosen = new JTextField();
        chosen.setEditable(false);
        chosen.setBounds(35, 500, 235, 40);
        frame.add(chosen);

        ImageIcon soal2 = new ImageIcon("2.jpg");
        label = new JLabel(soal2, JLabel.CENTER);
        label.setIcon(soal2);
        frame.add(label);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

        a2_1 = new JRadioButton("Computer Science", false);
        a2_2 = new JRadioButton("Computer Scientist", false);
        a2_3 = new JRadioButton("Computer Engineering", false);
        a2_4 = new JRadioButton("Computer Programming", false);

        bg = new ButtonGroup();
        bg.add(a2_1);
        bg.add(a2_2);
        bg.add(a2_3);
        bg.add(a2_4);

        JPanel p2 = new JPanel(new GridLayout(0, 1));
        p2.add(a2_1);
        p2.add(a2_2);
        p2.add(a2_3);
        p2.add(a2_4);

        frame.add(p2, BorderLayout.LINE_START);
        p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        btnNext = new JButton("Next");
        p3.add(btnNext);
        frame.add("South", p3);

        // a2_1.addActionListener(this);
        // a2_2.addActionListener(this);
        // a2_3.addActionListener(this);
        // btnNext.addActionListener(this);

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a2_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a2_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
                // call the object of NewWindow and set visible true
                Question3 newFrame = new Question3();
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
    // if (a2_1.isSelected())
    // {
    // score += 10;
    // }

    // else if (a2_2.isSelected())
    // {
    // score += 0;
    // }

    // else if (a2_3.isSelected())
    // {
    // score += 0;
    // }

    // else
    // {
    // score += 0;
    // }

    // Question3 frame = new Question3();
    // setVisible(false);
    // }
    // }
}
