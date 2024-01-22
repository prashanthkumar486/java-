class Demo7
{
    int x = 10;
    int y = 20;
    void test()
    {
        System.out.println("running test() method");

    }
}
 class MainClass7
 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo7 d1=new Demo7();
        Demo7 d2;
        d2=d1;
        System.out.println("x value in 1st object is :"+d1.x);
        System.out.println("y value in 1st object is :"+d1.y);
        d1.x=30;
        d1.y=40;
        //Demo7 d2 = new Demo7();
        System.out.println("x value in 1st object is :"+d2.x);
        System.out.println("y value in 1st object is :"+d2.y);
        System.out.println("main method stopped");

        
    }
 }