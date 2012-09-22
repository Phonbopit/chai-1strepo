package github.firsttime.main;


import github.firsttime.system.*;

public class MainApp {

	public static void main(String[] args) {
		
		
		Gameplay play = new Gameplay();
	
		Team pool 		= new Team("Liverpool",  "English", "Barclay Premier League");
		Team united	   	= new Team("ManUtd" ,    "English", "Barclay Premier League");
		Team barca		= new Team("Barcelona",  "Spanish", "La Liga");
		Team real		= new Team("Real Madrid","Spanish", "La Liga");
		
		play.initial(pool, united, 1);
		play.initial(barca, real, 2);
		play.initial(united, barca, 3);
		play.initial(real, pool, 4);
		
	}
	

}
