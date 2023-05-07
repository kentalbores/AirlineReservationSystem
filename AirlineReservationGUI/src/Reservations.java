import java.util.ArrayList;

public class Reservations {
    public String accountName;
    public ArrayList<String> reservations = new ArrayList<>();
    public ArrayList<String> destinations = new ArrayList<>();
    Reservations(String accountName){
        this.accountName = accountName;
    }
}
