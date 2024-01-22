class Account
{
    int accno;
    double balance;
    String accname;
    long phno;
    String address;
    String bankname;
}
class MainClass11
{
    public static void main(String[] args) 
    {
        Account a1=new Account();
        a1.bankname="state bank";
        a1.accno=5111;
        a1.balance=10000.00;
        a1.accname="madan";
        a1.phno=87654566l;
        a1.address="guttenahally";
        System.out.println("the bankname  is:"+a1.bankname);
        System.out.println("the accno  is:"+a1.accno);
        System.out.println("the balance is:"+a1.balance);
        System.out.println("the accname is:"+a1.accname);
        System.out.println("the phno is:"+a1.phno);
        System.out.println("the adress is:"+a1.address);
        Account a2=new Account();
        a2.bankname="canara bank";
        a2.accno=5411;
        a2.balance=14000.00;
        a2.accname="naveen";
        a2.phno=87656554456l;
        a2.address="namagondlu";
        System.out.println("the bankname  is:"+a2.bankname); 
        System.out.println("the accno  is:"+a2.accno);
        System.out.println("the balance is:"+a2.balance);
        System.out.println("the accname is:"+a2.accname);
        System.out.println("the phno is:"+a2.phno);
        System.out.println("the adress is:"+a2.address);
    }
}
