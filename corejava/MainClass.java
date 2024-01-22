
class Product 
{
    int id;
    double price;
    String brand;
    String description;
    //default initialization
    //byte,short,int,long------> 0
    //float,double---------> 0.0
    //char------->
    //boolean----->false
    //string------> null
}
class MainClass
{
    public static void main(String[] args)
    {
    System.out.println("main started");
    Product p1= new Product();
    p1.id=1234;
    p1.price=5000.00;
    p1.brand="puma";
    p1.description= "im prashant";
    System.out.println("the id is:"+p1.id);
    System.out.println("the price is:"+p1.price);
    System.out.println("the brand is:"+p1.brand);
    System.out.println("the description is:"+p1.description);
    Product p2= new Product();
    p2.id=123234;
    p2.price=4000.00;
    p2.brand="nike";
    p2.description= "im chethan";
    System.out.println("the id is:"+p2.id);
    System.out.println("the price is:"+p2.price);
    System.out.println("the brand is:"+p2.brand);
    System.out.println("the description is:"+p2.description);
    }
}
