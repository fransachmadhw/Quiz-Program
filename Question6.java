import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question6 {
    private JTextArea quest;
    private JTextField a6;
    private JButton btnNext;
    private JLabel label, input;
    public String answer6;

    public static int score = Question5.getScore();

    public static int getScore() {
        return score;
    }

    public Question6() {

        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setSize(700, 600);
        frame.setResizable(false);

        ImageIcon soal6 = new ImageIcon("6.jpg");
        label = new JLabel(soal6, JLabel.CENTER);
        label.setIcon(soal6);
        label.setBounds(175, 100, 325, 200);
        frame.add(label);

        JLabel input = new JLabel("Input your answer Here :");
        input.setBounds(260, 310, 300, 50);
        frame.add(input);

        a6 = new JTextField();
        a6.setBounds(185, 350, 300, 30);
        frame.add(a6);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText("\n 6. What is this? ");
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
                    answer6 = a6.getText();
                    if (answer6.equals("Video Random Access Memory") || answer6.equals("video random access memory")
                            || answer6.equals("Video RAM") || answer6.equals("VRAM")) {
                        score += 10;
                    }

                    else if (answer6 == null || answer6 == "") {
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
                    Question7 newFrame = new Question7();
                    frame.setVisible(false);
                }
            }
        });

    }
}