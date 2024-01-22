class Institute
{
    String name;
    String adress;
    int start;
    long mobile;
    

}
class MainClass13
{
    public static void main(String[] args) 
    {
       Institute s1=new Institute(); 
       s1.name="SJCIT";
       s1.adress="chickballapur";
       s1.start=1970;
       s1.mobile=9876543214l;
       System.out.println("the college name  is :"+s1.name);
       System.out.println("the college adress is :"+s1.adress);
       System.out.println("the college establishrd in  :"+s1.start); 
       System.out.println("the college mobile no  is :"+s1.mobile);
    }

}
