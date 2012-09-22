package github.firsttime.system;

/**
 * @author Chai Phonbopit 
 * Created on Sep 22, 2012 - 11:33:28 PM
 */
public class Team {
	private String name;
	private String nationality;
	private String league;

	public Team(String teamName, String nationality, String league) {
		this.name = teamName;
		this.nationality = nationality;
		this.league = league;
	}
	
	public String getName() {
		return name;
	}
	public String getNationality() {
		return nationality;
	}
	public String getLeague() {
		return league;
	}
	
	
}
