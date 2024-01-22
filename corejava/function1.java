class function1 
{
    public static double simple(int p,int t,double r )
    {
        //int p=1000;
        //int t=30;
        //double r=3.6;
        double si=p*t*r/100;
        return si;
        //sqr();
       // System.out.println(si);
        //sqr();
    }
    //public static void sqr(int n)
    {
        //int n=5;
        //int sq=n*n;
       // System.out.println(sq);
    }
    public static void main(String[] args)
    {
        System.out.println(simple(10000,30,3.5));
        //sqr(6);
        //sqr();
    }
    
}

