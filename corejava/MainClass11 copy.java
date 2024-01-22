class Account
{
    double accno;
    String accname;
    long phno;
    String address;
    String bankname;

    Account(double accno, String accname,long phno)
    {
    this.accno=accno;
    this.accname=accname;
    this.phno=phno;
    }
    Account(String accname,String bankname, long phno)
    {
    this.bankname=bankname;
    this.accname=accname;
    this.phno=phno;
    }
    void display()
    {
        System.out.println("the accno is"+accno);
        System.out.println("the accname is"+accname);
        System.out.println("the phno is"+phno);
    }
}
class Mock3
{
    public static void main(String[] args) 
    {
    Account a1=new Account(1234565,"nandish",9686569386l);
    a1.display();
    Account a2=new Account ("nandish","canara",9686569386l);
    a2.display();
        
    }
}
