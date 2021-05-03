import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question5 {
    private JTextArea quest;
    private JTextField chosen;
    private JRadioButton a5_1, a5_2, a5_3, a5_4;
    private ButtonGroup bg;
    private JButton btnNext;
    private JLabel label;

    public static int score = Question4.getScore();

    public static int getScore() {
        return score;
    }

    public Question5() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 5");
        frame.setSize(700, 600);
        frame.setResizable(false);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText(
                "\n 5. A variable that stores a memory address. Used to store the addresses of other variables or memory items.  ");
        frame.add(quest);

        chosen = new JTextField();
        chosen.setEditable(false);
        chosen.setBounds(35, 500, 235, 40);
        frame.add(chosen);

        ImageIcon soal5 = new ImageIcon("5.png");
        label = new JLabel(soal5, JLabel.CENTER);
        label.setIcon(soal5);
        frame.add(label);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

        a5_1 = new JRadioButton("Array", false);
        a5_2 = new JRadioButton("Pointer", false);
        a5_3 = new JRadioButton("Typedef", false);
        a5_4 = new JRadioButton("Define", false);

        bg = new ButtonGroup();
        bg.add(a5_1);
        bg.add(a5_2);
        bg.add(a5_3);
        bg.add(a5_4);

        JPanel p2 = new JPanel(new GridLayout(0, 1));
        p2.add(a5_1);
        p2.add(a5_2);
        p2.add(a5_3);
        p2.add(a5_4);

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

        a5_1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        a5_4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                chosen.setText(" Your choice : " + e.getActionCommand());
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (a5_1.isSelected()) {
                    score += 0;
                }

                else if (a5_2.isSelected()) {
                    score += 10;
                }

                else if (a5_3.isSelected()) {
                    score += 0;
                }

                else if (a5_4.isSelected()) {
                    score += 0;
                }

                else {
                    score += 0;
                }
                Question6 newFrame = new Question6();
                frame.setVisible(false);
            }
        });

    }
}
