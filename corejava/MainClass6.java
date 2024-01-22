class Demo6
{
    int x = 10;
    int y = 20;
    void test()
    {
        System.out.println("running test() method");

    }
}
 class MainClass6
 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo6 d1 = new Demo6();
        System.out.println("x value in 1st object is :"+d1.x);
        System.out.println("y value in 1st object is :"+d1.y);
        d1.x=30;
        d1.y=40;
        Demo6 d2=new Demo6();
        System.out.println("x value in 1st object is :"+d2.x);
        System.out.println("y value in 1st object is :"+d2.y);
        d2.test();
        System.out.println("main method stopped");

        
    }
 }