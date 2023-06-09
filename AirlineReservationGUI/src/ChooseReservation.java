import javax.swing.*;
import java.awt.*;

public class ChooseReservation {
    String chosenLoc, chosenTime;

    Accounts accounts = new Accounts();
    Reserved reserved = new Reserved();
    Reservations reservations;
    JFrame frame = new JFrame();
    Button buttonJapan = new Button("Japan");
    Button buttonKorea = new Button("Korea");
    Button buttonChina = new Button("China");
    Button buttonTaiwan = new Button("Taiwan");
    Button buttonSingapore = new Button("Singapore");
    Button button7am = new Button("7 AM");
    Button button7pm = new Button("7 PM");
    JPanel destinations = new JPanel();
    JPanel time = new JPanel();
    JButton buttonSubmit = new JButton("Confirm");
    JPanel commit = new JPanel();
    ChooseReservation(){
        frame.setVisible(true);
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        destinations.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
        destinations.add(buttonJapan);
        destinations.add(buttonChina);
        destinations.add(buttonSingapore);
        destinations.add(buttonTaiwan);
        destinations.add(buttonKorea);

        time.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
        time.add(button7am);
        time.add(button7pm);
        commit.setLayout(new FlowLayout(FlowLayout.CENTER, 100,20));
        commit.add(buttonSubmit);

        frame.add(destinations);
        frame.add(time);
        frame.add(commit);

        reserved.reserve();
        reservations = reserved.reserved.get(accounts.accountID);
        System.out.println("Account ID: " + accounts.accountID);
        System.out.println("Account Name: " + accounts.accountName);
        buttonSubmit.addActionListener(e -> {
            reservations.destinations.add(chosenLoc);
            reservations.timeDeparture.add(chosenTime);
            frame.dispose();
            new MainPage();
        });





        button7am.addActionListener(e -> {
            button7am.setBackground(Color.green);
            button7pm.setBackground(Color.lightGray);
            chosenTime = "7 AM";

        });
        button7pm.addActionListener(e -> {
            button7am.setBackground(Color.LIGHT_GRAY);
            button7pm.setBackground(Color.GREEN);
            chosenTime = "7 PM";
        });
        buttonJapan.addActionListener(e -> {
            buttonJapan.setBackground(Color.GREEN);
            buttonChina.setBackground(Color.LIGHT_GRAY);
            buttonKorea.setBackground(Color.LIGHT_GRAY);
            buttonTaiwan.setBackground(Color.LIGHT_GRAY);
            buttonSingapore.setBackground(Color.LIGHT_GRAY);
            chosenLoc = "Japan";
        });
        buttonChina.addActionListener(e -> {
            buttonJapan.setBackground(Color.LIGHT_GRAY);
            buttonChina.setBackground(Color.GREEN);
            buttonKorea.setBackground(Color.LIGHT_GRAY);
            buttonTaiwan.setBackground(Color.LIGHT_GRAY);
            buttonSingapore.setBackground(Color.LIGHT_GRAY);
            chosenLoc = "China";
        });
        buttonKorea.addActionListener(e -> {
            buttonJapan.setBackground(Color.LIGHT_GRAY);
            buttonChina.setBackground(Color.LIGHT_GRAY);
            buttonKorea.setBackground(Color.GREEN);
            buttonTaiwan.setBackground(Color.LIGHT_GRAY);
            buttonSingapore.setBackground(Color.LIGHT_GRAY);
            chosenLoc = "Korea";
        });
        buttonTaiwan.addActionListener(e -> {
            buttonJapan.setBackground(Color.LIGHT_GRAY);
            buttonChina.setBackground(Color.LIGHT_GRAY);
            buttonKorea.setBackground(Color.LIGHT_GRAY);
            buttonTaiwan.setBackground(Color.GREEN);
            buttonSingapore.setBackground(Color.LIGHT_GRAY);
            chosenLoc = "Taiwan";
        });
        buttonSingapore.addActionListener(e -> {
            buttonJapan.setBackground(Color.LIGHT_GRAY);
            buttonChina.setBackground(Color.LIGHT_GRAY);
            buttonKorea.setBackground(Color.LIGHT_GRAY);
            buttonTaiwan.setBackground(Color.LIGHT_GRAY);
            buttonSingapore.setBackground(Color.GREEN);
            chosenLoc = "Singapore";
        });
        buttonSingapore.setFocusable(false);
        buttonJapan.setFocusable(false);
        buttonKorea.setFocusable(false);
        buttonTaiwan.setFocusable(false);
        buttonChina.setFocusable(false);
        button7am.setFocusable(false);
        button7pm.setFocusable(false);
    }
}
