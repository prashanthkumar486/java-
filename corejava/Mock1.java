class Customer
{
    int id;
    String name;
    long phno;
    String adress;
}
class Mock1
{
    public static void main(String[] args){
    Customer c1= new Customer();
    c1.id=123;
    c1.name="prashanth";
    c1.phno=9686569386l;
    c1.adress="banglore";
    System.out.println("the id is:"+c1.id);
    System.out.println("the name is:"+c1.name);
    System.out.println("the phno is:"+c1.phno);
    System.out.println("the adress is:"+c1.adress);
    }

}
