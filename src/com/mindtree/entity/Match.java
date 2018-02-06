package com.mindtree.entity;

public class Match {
	int matchid;
	String matchDate;
	int firstTeamScore;
	int secondTeamScore;
	Team firstTeam;
	Team secondTeam;
	Match(){}
	public Match(String b,int c,int d,String e,String f){
		
		
		this.matchDate=b;
		this.firstTeamScore=c;
		this.secondTeamScore=d;
		firstTeam = new Team(e);
	    secondTeam= new Team(f);
		
	}
	public int getMatchId(){
		
		return matchid;
	}
public int getFirstTeamScore(){
		
		return firstTeamScore;
	}public int getSecondTeamScore(){
		
		return secondTeamScore;
	}public Team getFirstTeam(){
		
		return firstTeam;
	}public Team getSecondTeam(){
		
		return secondTeam;
	}public String getDate(){
		
		return matchDate;
	}
}
