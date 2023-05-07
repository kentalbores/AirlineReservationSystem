import  java.util.*;
public class Accounts {
    int accountID;
    public String accountName = "";
    public boolean is_logged_in = false;
    private static ArrayList<String> email = new ArrayList<>();
    private static ArrayList<String> password = new ArrayList<>();
    public ArrayList<String> getEmailList(){
        return email;
    }
    public ArrayList<String> getPasswordList(){
        return password;
    }
    public void addEmail(String e){
       email.add(e);
    }
    public void addPass(String p){
        password.add(p);
    }


}

