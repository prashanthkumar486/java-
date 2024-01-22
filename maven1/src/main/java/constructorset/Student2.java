package constructorset;

import java.util.Set;

public class Student2 {
	private int id;
	private String name;
	private Set<String> subjects;
	public Student2(int id, String name, Set<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}
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
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	


}
