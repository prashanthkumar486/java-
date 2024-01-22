package practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private List<String> books;
	private Map<Integer, String> sandl;
	private Set<Students> students;
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
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Map<Integer, String> getSandl() {
		return sandl;
	}
	public void setSandl(Map<Integer, String> sandl) {
		this.sandl = sandl;
	}
	public Set<Students> getStudents() {
		return students;
	}
	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", books=" + books + ", sandl=" + sandl + ", students="
				+ students + "]";
	}
	
	
	

}
