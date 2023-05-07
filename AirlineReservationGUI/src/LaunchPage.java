import javax.swing.*;
import java.awt.*;

public class LaunchPage extends JFrame {

    LaunchPage(){
        JFrame frame = new JFrame("Airline Reservation System");
        Accounts accounts = new Accounts();
        JButton button1 = new JButton("Log-in");
        JButton button2 = new JButton("Sign-up");
        JLabel label = new JLabel();
        label.setText("Log-in or Sign-up?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBackground(Color.LIGHT_GRAY);

        JPanel textpanel = new JPanel();
        JPanel buttonpanel = new JPanel();

        textpanel.add(label);
        buttonpanel.add(button1);
        buttonpanel.add(button2);
        button1.addActionListener(e -> {
            new LoginPage();
            System.out.println("Logging in");
            frame.dispose();
            for (String i:accounts.getEmailList()){
                System.out.println(i);
            }
        });
        button2.addActionListener(e -> {
            new SignupPage();
            System.out.println("Signing up");
            frame.dispose();
        });

        textpanel.setBackground(Color.LIGHT_GRAY);
        buttonpanel.setBackground(Color.LIGHT_GRAY);
        textpanel.setPreferredSize(new Dimension(200,50));
        buttonpanel.setPreferredSize(new Dimension(200,50));

        frame.add(textpanel, BorderLayout.NORTH);
        frame.add(buttonpanel, BorderLayout.CENTER);

        button2.setFocusable(false);
        button1.setFocusable(false);
        frame.pack();
    }
}
