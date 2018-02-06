package com.mindtree.entity;

public class Team {
String teamid;
String teamName;
	Team(){}
 public	Team(String a,String b){
		
		this.teamid =a;
		this.teamName=b;
		
	}
public Team(String a){
		
		this.teamid =a;
	
		
	}
	public String getTeamId(){
		
		return teamid;
		
	}
	public String getTeamName(){
		
		return teamName;
	}
	
}
