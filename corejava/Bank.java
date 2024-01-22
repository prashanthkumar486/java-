class Bank
{
    public static void main(String[] args)
    {
        int balance = 7896;
        while(balance >= 2000)
        {
            
            System.out.println(balance);  
            balance=balance-2000;
            
        }
        System.out.println("balance in your account :"+balance);
    }
}