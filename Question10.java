import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Question10 {
    private JTextArea quest;
    private JTextField a10;
    private JButton btnNext;
    private JLabel label;

    public String answer10;

    public static int score = Question9.getScore();

    public static int getScore() {
        return score;
    }

    public Question10() {
        JFrame frame = new JFrame("Computer Science Quiz");
        frame.setSize(700, 600);
        frame.setResizable(false);

        ImageIcon soal10 = new ImageIcon("10.png");
        label = new JLabel(soal10, JLabel.CENTER);
        label.setIcon(soal10);
        label.setBounds(175, 100, 325, 200);
        frame.add(label);

        JLabel input = new JLabel("Input your answer Here :");
        input.setBounds(260, 310, 300, 50);
        frame.add(input);

        a10 = new JTextField();
        a10.setBounds(185, 350, 300, 30);
        frame.add(a10);

        quest = new JTextArea(4, 5);
        quest.setEditable(false);
        quest.setText(
                "\n 10. A free, open-source PHP web framework, created by Taylor Otwell \n and intended for the development of web applications.  ");
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

        int x = layar.width / 2 - frame.getSize().width / 2;
        int y = layar.height / 2 - frame.getSize().height / 2;

        frame.setLocation(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                answer10 = a10.getText();
                if (answer10.equals("Laravel") || answer10.equals("laravel")) {
                    score += 10;
                } else if (answer10.equals("")) {
                    score += 0;
                } else {
                    score += 0;
                }
                Result newFrame = new Result();
                frame.setVisible(false);
                // JOptionPane.showMessageDialog(null, "Your Score = " + score);
                // System.exit(0);
            }
        });
    }
}
