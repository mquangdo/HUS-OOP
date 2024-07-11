package hus.oop.lab10.question2.ex2;

public class Database {
    private static Database instance;

    private Database(){
        System.out.println("Connecting to the Database server...");
    }

    public static Database getInstance(){
        if (Database.instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void query(){
        System.out.println("Queried");
    }
}
