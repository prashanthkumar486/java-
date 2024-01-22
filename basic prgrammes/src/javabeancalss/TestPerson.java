package javabeancalss;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(26);
		p.setSal(56.3256);
		
        int	res	=p.getAge();
         double res1= p.getSal();
         
         System.out.println(p.getAge());
         System.out.println(p.getSal());

	}

}
