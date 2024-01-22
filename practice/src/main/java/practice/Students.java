package practice;

import java.util.Set;

public class Students {
	private int id;
	private Set<Stud> stud;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<Stud> getStud() {
		return stud;
	}
	public void setStud(Set<Stud> stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", stud=" + stud + "]";
	}
	
	
	

}
