import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question4 {
    private JTextArea quest;
    private JTextField chosen;
    private JRadioButton a4_1, a4_2, a4_3, a4_4;
    private ButtonGroup bg;
    private JButton btnNext;
    private JLabel label;

    public static int score = Question3.getScore();

    public static int getScore() {
        return score;
    }

    public Question4() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 4");
        frame.setSize(700, 600);
        frame.setResizable(false);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText("\n 4. Which is the advantage of Linked List? (Except) ");
        frame.add(quest);

        chosen = new JTextField();
        chosen.setEditable(false);
        chosen.setBounds(35, 500, 235, 40);
        frame.add(chosen);

        ImageIcon soal4 = new ImageIcon("4.png");
        label = new JLabel(soal4, JLabel.CENTER);
        label.setIcon(soal4);
        frame.add(label);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

        a4_1 = new JRadioButton("Dynamic Data Structure", false);
        a4_2 = new JRadioButton("Insertion and Deletion", false);
        a4_3 = new JRadioButton("Reverse Traversing", false);
        a4_4 = new JRadioButton("Forwarding Data", false);

        bg = new ButtonGroup();
        bg.add(a4_1);
        bg.add(a4_2);
        bg.add(a4_3);
        bg.add(a4_4);

        JPanel p2 = new JPanel(new GridLayout(0, 1));
        p2.add(a4_1);
        p2.add(a4_2);
        p2.add(a4_3);
        p2.add(a4_4);

        frame.add(p2, BorderLayout.LINE_START);
        p2.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 20));

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        btnNext = new JButton("Next");
        p3.add(btnNext);
        frame.add("South", p3);

        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        int x = layar.width / 2  - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        a4_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a4_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (a4_1.isSelected()) {
                    score += 0;
                }

                else if (a4_2.isSelected()) {
                    score += 0;
                }

                else if (a4_3.isSelected()) {
                    score += 10;
                }

                else if (a4_4.isSelected()) {
                    score += 0;
                } else {
                    score += 0;
                }
                // call the object of NewWindow and set visible true
                Question5 newFrame = new Question5();
                // newFrame.setVisible(true);
                frame.setVisible(false);
                // set default close operation
                // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
