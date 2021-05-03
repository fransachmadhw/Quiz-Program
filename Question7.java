import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question7 {
    private JTextArea quest;
    private JTextField a7;;
    private JButton btnNext;
    private JLabel label;

    public String answer7;

    public static int score = Question6.getScore();

    public static int getScore() {
        return score;
    }

    public Question7() {
        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setSize(700, 600);
        frame.setResizable(false);

        ImageIcon soal7 = new ImageIcon("7.png");
        label = new JLabel(soal7, JLabel.CENTER);
        label.setIcon(soal7);
        label.setBounds(175, 100, 325, 200);
        frame.add(label);

        JLabel input = new JLabel("Input your answer Here :");
        input.setBounds(260, 310, 300, 50);
        frame.add(input);

        a7 = new JTextField();
        a7.setBounds(185, 350, 300, 30);
        frame.add(a7);

        quest = new JTextArea(3, 5);
        quest.setEditable(false);
        quest.setText(
                "\n 7. Problem that limits the potential of other hardware due to differences in the maximum capabilities of the two components.  ");
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
                    answer7 = a7.getText();
                    if (answer7.equals("Bottleneck") || answer7.equals("bottleneck")) {
                        score += 10;
                    }

                    else if (answer7 == null || answer7 == "") {
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
                    Question8 newFrame = new Question8();
                    frame.setVisible(false);
                    // JOptionPane.showMessageDialog(null, "Your Score = " + score);
                    // System.exit(0);
                }

                // call the object of NewWindow and set visible true
                // Question5 newFrame = new Question5();
                // newFrame.setVisible(true);
                // frame.setVisible(false);
                // set default close operation
                // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            }
        });

    }

    // public void actionPerformed(ActionEvent e)
    // {
    // if(e.getSource() == btnNext)
    // {
    // if (a5_1.isSelected())
    // {
    // score += 0;
    // }

    // else if (a5_2.isSelected())
    // {
    // score += 10;
    // }

    // else if (a5_3.isSelected())
    // {
    // score += 0;
    // }

    // else
    // {
    // score += 0;
    // }

    // JOptionPane.showMessageDialog(this, "Your Score = " + score);

    // System.exit(0);

    // }
    // }
}
