import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPage {
    JFrame frame = new JFrame();
    JButton button1 = new JButton("Add Reservations");
    JPanel topPanel = new JPanel();
    JPanel mainpanel = new JPanel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    MainPage(){
        Accounts accounts = new Accounts();
        Reserved reserved = new Reserved();
        if(reserved.reserved.get(accounts.accountID).destinations.size() != 0){
            for(String i: reserved.reserved.get(accounts.accountID).destinations){
                System.out.println("Travel Location: " + i);
            }
            for(String i: reserved.reserved.get(accounts.accountID).timeDeparture){
                System.out.println("Time: " + i);
            }
        }
        frame.setSize(500,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));

        label1.setText("");
        label2.setText("");

        topPanel.setPreferredSize(new Dimension(300,400));
        mainpanel.setPreferredSize(new Dimension(400, 600));
        topPanel.setBackground(Color.GREEN);
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
        mainpanel.setBackground(Color.LIGHT_GRAY);
        mainpanel.add(topPanel,BorderLayout.NORTH);
        mainpanel.add(button1);
        mainpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,30));
        topPanel.add(label1);
        topPanel.add(label2);

        frame.add(mainpanel);
        button1.addActionListener(e -> {
            new ChooseReservation();
            frame.dispose();

            //topPanel.add(new JLabel("Kent Albores"));
            //topPanel.revalidate();
            //topPanel.repaint();
        });

    }
}
