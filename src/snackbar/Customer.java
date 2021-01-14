package snackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double balance;


    public Customer( String name, double coh)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.balance = balance;


    }

    public void addCash(double cashAmount)
    {
        this.balance = this.balance + cashAmount;
    }

    public  double getCashTotal()
    {
        return this.balance;
    }

    public void buySnack(double cashAmount)
    {
        this.balance = this.balance - cashAmount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;

    }

}