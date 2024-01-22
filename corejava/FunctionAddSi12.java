class FunctionAddSi12
{
    static int add()
    {
        int a=30;
        int b=10;
        int c=a+b;
        return c;
        
    }
    static double si()
    {
        System.out.println("si started");
        double p=10000.00;
        double t=2.00;
        double r=2.00;
        double si=p*t*r/100;
        return si;
       


    }

    public static void main(String[] args)
    {
        System.out.println("main started");
        System.out.println(si());
        System.out.println(add());
        System.out.println("main ended");
    }
}


