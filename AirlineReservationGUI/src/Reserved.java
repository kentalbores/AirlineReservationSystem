import java.util.ArrayList;

public class Reserved {
    Accounts accounts = new Accounts();
    public ArrayList<Reservations> reserved = new ArrayList<>();
    public void reserve(){
        for(int i = 0; i < accounts.getEmailList().size(); i++){
            Reservations reservations = new Reservations(accounts.getEmailList().get(i));
            reserved.add(reservations);
        }
        reserved.add(new Reservations("kent"));
    }
}
