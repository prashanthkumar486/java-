package collectionSet;

import java.util.Set;

public class Ipl2 {
	private String tname;
	private String cname;
	private Set<String> players;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<String> getPlayers() {
		return players;
	}
	public void setPlayers(Set<String> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Ipl2 [tname=" + tname + ", cname=" + cname + ", players=" + players + "]";
	}
	

}
