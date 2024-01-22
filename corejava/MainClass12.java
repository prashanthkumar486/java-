class Student
{
    String usn;
    String name;
    String branch;
    long mobile;
    long DOB;

}
class MainClass12
{
    public static void main(String[] args) 
    {
       Student s1=new Student(); 
       s1.usn="1sj18ec121";
       s1.name="prashanth";
       s1.branch="ece";
       s1.mobile=9876543214l;
       System.out.println("the student usn is :"+s1.usn);
       System.out.println("the student usn is :"+s1.name);
       System.out.println("the student usn is :"+s1.branch); 
       System.out.println("the student usn is :"+s1.mobile);
       System.out.println("the student usn is :"+s1.DOB);
    }

}