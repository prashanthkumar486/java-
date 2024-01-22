class Bike
{
    String name;
    String bikeno;
    String brand;
    String colour;
    double cost;
}
class BikeDemo
{
    public static void main(String[] args) 
    {
        Bike c1=new Bike();
        c1.name="audid2";
        c1.bikeno="ka40ad1230";
        c1.brand="audi";
        c1.colour="black";
        c1.cost=12344556.00;
        System.out.println("the bike name is:"+c1.name);
        System.out.println("the carno is:"+c1.bikeno);
        System.out.println("the brand is:"+c1.brand);
        System.out.println("the colour is:"+c1.colour);
        System.out.println("the cost is:"+c1.cost);
    }
}


