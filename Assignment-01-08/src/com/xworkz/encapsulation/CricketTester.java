package com.xworkz.encapsulation;

public class CricketTester {

	public static void main(String[] args) {
	Cricket game=new Cricket();
	
	game.isoutdoorgame=true;
	game.noofPlayers=12;
	game.name="cricket";	
	
	game.cricketplayer();
	game.outdoorgame();
	game.noofPlayers();
	game.name();

	}

}
