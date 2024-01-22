class Demo5
{
    int x = 10;
    int y = 20;
    void test()
    {
        System.out.println("running test() method");

    }
}
 class MainClass5
 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo5 d1;
        d1=new Demo5();
        System.out.println("x value in 1st object is :"+d1.x);
        System.out.println("y value in 1st object is :"+d1.y);
        d1.test();

        Demo5 d2 =new Demo5();
        System.out.println("x value in 1st object is :"+d2.x);
        System.out.println("y value in 1st object is :"+d2.y);
        d2.test();
        System.out.println("main method stopped");

        
    }
 }