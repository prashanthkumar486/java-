class Employee
{
    int id;
    double salary;
    String name;
    int phno;
    String dept;
}
class MainClass10
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.id=51;
        e1.salary=10000;
        e1.name="madan";
        e1.phno=8765456;
        e1.dept="developer";
        Product p1= new Product();
        p1.id=1234;
        p1.price=5000.00;
        p1.brand="puma";
        p1.description= "im prashant";
        System.out.println("the employee id is:"+e1.id);
        System.out.println("the salary is:"+e1.salary);
        System.out.println("the name is:"+e1.name);
        System.out.println("the phno is:"+e1.phno);
        System.out.println("the dept is:"+e1.dept);
    }
}
