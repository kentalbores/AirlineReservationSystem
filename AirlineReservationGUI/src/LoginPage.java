import javax.swing.*;
import java.awt.*;


public class LoginPage {
    boolean is_an_account = false, correct_password = false;
    Accounts accounts = new Accounts();

    LoginPage(){
        JFrame frame = new JFrame("Log-in");
        JTextField textFielduser = new JTextField();
        JTextField textFieldpass = new JTextField();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();

        label1.setText("Username");
        label2.setText("Password");
        label1.setBounds(120,150,80,40);
        label2.setBounds(120,210,80,40);

        JButton submitButton = new JButton("Submit");

        JPanel panel = new JPanel();
        JPanel toppanel = new JPanel();

        submitButton.setPreferredSize(new Dimension(50,20));
        textFieldpass.setPreferredSize(new Dimension(200,30));
        textFielduser.setPreferredSize(new Dimension(200, 30));

        toppanel.setPreferredSize(new Dimension(400,100));
        toppanel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100,30));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(textFielduser);
        panel.add(textFieldpass);
        panel.add(submitButton);
        frame.add(label1);
        frame.add(label2);

        frame.add(toppanel, BorderLayout.NORTH);
        frame.add(panel);
        frame.setSize(460,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        submitButton.addActionListener(e -> {
            String username = textFielduser.getText();
            String pass = textFieldpass.getText();

            if (accounts.getEmailList().contains(username)){
                is_an_account = true;
                accounts.accountID = accounts.getEmailList().indexOf(username);
                if (pass.equals(accounts.getPasswordList().get(accounts.accountID))){
                    correct_password = true;
                }
            }
            if (is_an_account && correct_password){
                new MainPage();
                frame.dispose();
                accounts.accountName = accounts.getEmailList().get(accounts.accountID);
                accounts.is_logged_in = true;
                System.out.println("You are loggied in");
            }
        });
    }
}
