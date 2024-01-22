class Email
{
    String username;
    String password;
    long phno;
    void display()
    {
        username="prashu";
        password="pk1234";
        phno=9686569386l;
    System.out.println("the username is:"+username);
    System.out.println("the password is:"+password);
    System.out.println("the phno is:"+phno);
    }
}
class Mock2
{
    public static void main(String[] args)
    {
        Email e1=new Email();
        e1.display();

    }
}
