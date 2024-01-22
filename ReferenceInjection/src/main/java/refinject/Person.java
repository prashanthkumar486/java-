package refinject;

public class Person {
	private int id;
	private String name;
	private Adress adress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	
	
}
