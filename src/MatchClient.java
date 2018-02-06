import java.util.List;
import java.util.Scanner;

import com.mindtree.entity.Match;
import com.mindtree.entity.Team;


public class MatchClient {
	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);	
		 MatchDAO dao=new MatchDAO();
         MatchManager man = new MatchManager();
		
		int a;
do{
		System.out.println("1. Add Match details");
		System.out.println("2. List all matches played by a given team.");
	    System.out.println("3. Exit     ");
	    System.out.println("Enter Choice[1\2\3]::");
	    
	   
	   a = in.nextInt();
	   in.nextLine();
	  
		   
		   if(a == 1){
	
			   List<Team> team = dao.displayTeam();
			   for(int i=0;i<team.size();i=i++){
				   
				   System.out.println(team.get(i).getTeamId() +"   "+ team.get(i+1).getTeamName());
				   
			   }
			   System.out.println("Select First Team Name:");
			   String firstteam;
			   firstteam =in.nextLine();
			   System.out.println("Select Second Team Name:");
			   String secondteam;
			   secondteam =in.nextLine();
			  System.out.println("Enter the match date:");
			  String date;
			  date =in.nextLine();
			  System.out.println("Enter the goal scored by first team:::");
			  int b;
			  b=in.nextInt();
			  in.nextLine();
			  System.out.println("Enter the goal scored by the second team:::");
			  int c;
			  c= in.nextInt();
			  in.nextLine();
			  man.isTeam(firstteam);
			  man.isTeam(secondteam);
			  man.isDate(date);
			  man.isGoal(b);
			  man.isGoal(c);
			  Match mat =new Match( date,b,c,firstteam,secondteam);
			  dao.addMatch(mat);
			  System.out.println("Match Details Added");
			   
		   }
		   else if(a== 2){
			   System.out.println("Enter the Team Name: ");
			   String na;
			   na =in.nextLine();
   			   man.isTeam(na);
			   List<Match> match;
			   match = dao.getAllMatches(na);
			   
			   System.out.println("***************************");
			   System.out.println("Team Name: "+na);
			   System.out.println("MATCH_DATE\t\t-OPPONENT\t\tGOALS");
			   for(int i=0;i<match.size();i=i++){
				   
				   System.out.println(match.get(i).getDate()+"\t\t"+match.get(i).getSecondTeam()+"\t\t"+match.get(i).getFirstTeamScore()+" - "+match.get(i).getSecondTeam());
				   
			   }
			   
			   System.out.println("***************************");
		   }
		   else{
			   
			 System.out.println("Error You have enter the wrong Choice please select again");  
			   
		   }
		   
		   
	   }while(a !=3);	    
	}
}
