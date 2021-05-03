import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question8 {
    private JTextArea quest;
    private JTextField a8;
    private JButton btnNext;
    private JLabel label;

    public String answer8;

    public static int score = Question7.getScore();

    public static int getScore() {
        return score;
    }

    public Question8() {
        JFrame frame = new JFrame("Computer Science Quiz");
        // super("Question Number 5");
        frame.setSize(700, 600);
        frame.setResizable(false);

        ImageIcon soal8 = new ImageIcon("8.png");
        label = new JLabel(soal8, JLabel.CENTER);
        label.setIcon(soal8);
        label.setBounds(175, 100, 325, 200);
        frame.add(label);

        JLabel input = new JLabel("Input your answer Here :");
        input.setBounds(260, 310, 300, 50);
        frame.add(input);

        a8 = new JTextField();
        a8.setBounds(185, 350, 300, 30);
        frame.add(a8);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText("\n 8. Dynamic voltage scaling to decrease voltage  ");
        frame.add(quest);

        JPanel p1 = new JPanel();
        p1.add(quest);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 30));
        frame.add("North", p1);

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

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    answer8 = a8.getText();
                    if (answer8.equals("Undervolting") || answer8.equals("Undervolt") || answer8.equals("undervolting")
                            || answer8.equals("undervolt")) {
                        score += 10;
                    }

                    else if (answer8 == null || answer8 == "") {
                        score += 0;
                        throw new NullPointerException();
                    }

                    else {
                        score += 0;
                    }
                } catch (Exception z) {
                    JOptionPane.showMessageDialog(null, "Caught exception is " + z);
                    System.err.println("Caught exception is " + z);
                } finally {
                    Question9 newFrame = new Question9();
                    frame.setVisible(false);
                    // JOptionPane.showMessageDialog(null, "Your Score = " + score);
                    // System.exit(0);
                }
            }
        });
    }
}
