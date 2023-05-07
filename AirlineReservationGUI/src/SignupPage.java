import javax.swing.*;
import java.awt.*;

public class SignupPage extends Accounts{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField textFielduser= new JTextField();
    JTextField textFieldpass1= new JTextField();
    JTextField textFieldpass2= new JTextField();
    JButton submitbutton = new JButton("Submit");
    JPanel toppanel = new JPanel();
    Accounts accounts = new Accounts();

    SignupPage(){

        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBackground(Color.LIGHT_GRAY);

        toppanel.setLayout(new BorderLayout());
        toppanel.setPreferredSize(new Dimension(300, 150));
        toppanel.setBackground(Color.yellow);

        textFielduser.setText("Username");
        textFieldpass1.setText("Password");
        textFieldpass2.setText("Password");
        textFieldpass1.setPreferredSize(new Dimension(300,40));
        textFieldpass2.setPreferredSize(new Dimension(300,40));
        textFielduser.setPreferredSize(new Dimension(300,40));
        submitbutton.setPreferredSize(new Dimension(80, 25));

        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(toppanel, BorderLayout.NORTH);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100,20));
        panel.add(textFielduser);
        panel.add(textFieldpass1);
        panel.add(textFieldpass2);
        panel.add(submitbutton);

        frame.add(panel);

        submitbutton.addActionListener(e -> {
            String user = textFielduser.getText();
            String pass1 = textFieldpass1.getText();
            String pass2 = textFieldpass2.getText();
            if (pass1.equals(pass2)){
                System.out.println("Closing");
                accounts.addEmail(user);
                accounts.addPass(pass1);
                for (String i:accounts.getEmailList()){
                    System.out.println(i);
                }
                new LaunchPage();
                frame.dispose();
                Reserved reserved = new Reserved();
                reserved.reserve();
            }
        });

    }
}
