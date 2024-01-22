package steroTypeAnnoattion;

public class Ipl {
	private String teamName;
	private String teamCaption;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCaption() {
		return teamCaption;
	}
	public void setTeamCaption(String teamCaption) {
		this.teamCaption = teamCaption;
	}
	public Ipl(String teamName, String teamCaption) {
		super();
		this.teamName = teamName;
		this.teamCaption = teamCaption;
	}
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaption=" + teamCaption + "]";
	}
	
	

}
