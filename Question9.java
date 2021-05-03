import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question9 {
    private JTextArea quest;
    private JTextField a9;
    private JButton btnNext;
    private JLabel label;

    public String answer9;

    public static int score = Question8.getScore();

    public static int getScore() {
        return score;
    }

    public Question9() {
        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setSize(700, 600);
        frame.setResizable(false);

        ImageIcon soal9 = new ImageIcon("9.jpg");
        label = new JLabel(soal9, JLabel.CENTER);
        label.setIcon(soal9);
        label.setBounds(175, 100, 325, 200);
        frame.add(label);

        JLabel input = new JLabel("Input your answer Here :");
        input.setBounds(260, 310, 300, 50);
        frame.add(input);

        a9 = new JTextField();
        a9.setBounds(185, 350, 300, 30);
        frame.add(a9);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText(
                "\n 9. A branch of artificial intelligence (AI) focused on building applications. ");
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
                    answer9 = a9.getText();
                    if (answer9.equals("Machine Learning") || answer9.equals("Machine learning")
                            || answer9.equals("machine learning")) {
                        score += 10;
                    }

                    else if (answer9 == null || answer9 == "") {
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
                    Question10 newFrame = new Question10();
                    frame.setVisible(false);
                }
            }
        });

    }
}
