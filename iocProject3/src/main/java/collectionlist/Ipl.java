package collectionlist;

import java.util.List;

public class Ipl {
	private String teamname;
	private String captainname;
	private List<String> players;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getCaptainname() {
		return captainname;
	}
	public void setCaptainname(String captainname) {
		this.captainname = captainname;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Ipl [teamname=" + teamname + ", captainname=" + captainname + ", players=" + players + "]";
		
		
		
	}
}
