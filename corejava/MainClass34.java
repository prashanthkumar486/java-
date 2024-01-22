class Account1 
 {
    double account_balance;
    double  deposite_amount;
    double withdraw_amount;
    double addamount;
    void show()
    {
        System.out.println("The Account balance is:"+deposite_amount);
        
        
    }
     void Accountblance(double n)
     {
      account_balance = deposite_amount -n;

      System.out.println("balance after withdrawing:"+account_balance);
      withdraw_amount = n;
     System.out.println("withdraw amount :"+withdraw_amount);
     }
     void addamount(double n )
     {
    addamount = account_balance+ n;
    System.out.println("adding sum amount:"+addamount);

     }
    
}
class MainClass34
{
    public static void main(String[] args) 
    {
        Account1 a1 = new Account1();
        a1.deposite_amount=500.00;
        a1.show();
        a1.Accountblance(200);
        a1.addamount(1000);
    }
}
