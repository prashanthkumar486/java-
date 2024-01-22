package autowired;

public class Student {
	private Certificate certi;
	public Student() {
		System.out.println("by using constrcutors");
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public Student(Certificate certi) {
		super();
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [certi=" + certi + "]";
	}
	
	
	

}
