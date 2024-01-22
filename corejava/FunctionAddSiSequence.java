class FunctionAddSiSequence 
{
    static void add()
    {
        System.out.println("adition started");
        int a=30;
        int b=10;
        int c=a+b;
        System.out.println(c);
        System.out.println("adition started");
    }
    static void si()
    {
        System.out.println("si started");
        double p=10000;
        double t=2;
        double r=2;
        double si=p*t*r/100;
        System.out.println(si);
        System.out.println("si ended");


    }
    public static void main(String[] args)
    {
        System.out.println("main started");
        add();
        si();
        System.out.println("main ended");
    }
}
