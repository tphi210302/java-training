package Day_11_Exception_Handling;

import java.util.PrimitiveIterator;

public class Account {
    private int id ;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //nạp
    public void deposit(double amount){
        balance += amount; // balance = balance + amount
    }
    //rút
    public void withdraw(double amount){
        balance -= amount;
    }
}
