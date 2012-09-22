package github.firsttime.system;

import java.util.Random;

/**
 * @author Chai Phonbopit 
 * Created on Sep 22, 2012 - 11:55:54 PM
 */
public class Gameplay {
	final String welcome = "Welcome to DemoRepository Football Match";
	
	public void initial(Team home, Team away, int match) {
		System.out.println(welcome + " #" + match);
		System.out.println("Home : "+ home.getName() + " VS ");
		System.out.println("Away : "+ away.getName());
		
		System.out.print("Loading result .....");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			return;
		}
		String result = this.random();
			
		System.out.println(home.getName() + " " + result + " " + away.getName());
		
	}
	
	
	/*
	 * For Printing Scoreboard
	 */
	public String score(int homeScore, int awayScore) {
		return homeScore + " : " + awayScore;
	}
	/*
	 * For random result match  
	 * Home chance greater than Away ^^
	 */
	public String random() {
		Random rand = new Random();
        int homeScore = rand.nextInt(4);
        int awayScore = rand.nextInt(3);
        return this.score(homeScore, awayScore);
	}

}
