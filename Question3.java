import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question3 {
    private JTextArea quest;
    private JTextField chosen;
    private JRadioButton a3_1, a3_2, a3_3, a3_4;
    private ButtonGroup bg;
    private JButton btnNext;
    private JLabel label;

    public static int score = Question2.getScore();

    public static int getScore() {
        return score;
    }

    public Question3() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 3");
        frame.setSize(700, 600);
        frame.setResizable(false);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText("\n 3. Both Java and JavaScript are much different. ");
        frame.add(quest);

        chosen = new JTextField();
        chosen.setEditable(false);
        chosen.setBounds(35, 500, 235, 40);
        frame.add(chosen);

        ImageIcon soal3 = new ImageIcon("3_1.jpg");
        label = new JLabel(soal3, JLabel.CENTER);
        label.setIcon(soal3);
        frame.add(label);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

        a3_1 = new JRadioButton("Exactly!", false);
        a3_2 = new JRadioButton("I Don't Think So", false);
        a3_3 = new JRadioButton("Really?", false);
        a3_4 = new JRadioButton("Probably", false);

        bg = new ButtonGroup();
        bg.add(a3_1);
        bg.add(a3_2);
        bg.add(a3_3);
        bg.add(a3_4);

        JPanel p2 = new JPanel(new GridLayout(0, 1));
        p2.add(a3_1);
        p2.add(a3_2);
        p2.add(a3_3);
        p2.add(a3_4);

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

        a3_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a3_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
                // call the object of NewWindow and set visible true
                Question4 newFrame = new Question4();
                // newFrame.setVisible(true);
                frame.setVisible(false);
                // set default close operation
                // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
}
