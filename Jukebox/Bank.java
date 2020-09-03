package jukebox;

public class Bank 
{
    private double balance;
    private int numOf1Bills, numOf5Bills, numOf10Bills, numOf20Bills;
     
    /*
    We are going to initialize jukebox's bank to have (10) One dollar bills, 
    (5) Five dollar bills, (2) Ten dollar bills, and (1) Twenty dollar bill for giving change purposes
    */
    Bank()
    {
        this.numOf1Bills = 10;
        this.numOf5Bills = 5;
        this.numOf10Bills = 2;
        this.numOf20Bills = 1;
    }
    
    //The machine can update how many bills are still in the jukebox by sensors if owner takes out money or leave how many they want
    
    public void setBills(int numOf1Bills, int numOf5Bills, int numOf10Bills, int numOf20Bills)
    {
        this.numOf1Bills = numOf1Bills;
        this.numOf5Bills = numOf5Bills;
        this.numOf10Bills = numOf10Bills;
        this.numOf20Bills = numOf20Bills;
    }

    //Only owner can press buttons in to check total balance
    public void updateBalance()
    {
        double total = 0.00;
        
        total += numOf1Bills * 1.00;
        total += numOf5Bills * 5.00;
        total += numOf10Bills * 10.00;
        total += numOf20Bills * 20.00;
        
        this.balance = total;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    //Increment num of bills depending which identified bill the jukebox received. Returns true if bill is legit and false if fake/unidentified bills
    public boolean addMoney(int bill)
    {
        switch(bill)
        {
            case 1:
                numOf1Bills += 1;
                return true;
            case 5:
                numOf5Bills += 1;
                return true;
            case 10:
                numOf10Bills += 1;
                return true;
            case 20:
                numOf20Bills += 1;
                return true;
            default:
                return false;
                
        }
    }
}
