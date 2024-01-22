class Cllg
{
    String name;
    String adress;
    int start;
    long mobile;
    

}
class College
{
    public static void main(String[] args) 
    {
       Cllg s1=new Cllg(); 
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

