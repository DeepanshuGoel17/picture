import java.util.List;

import com.mindtree.entity.Match;
import com.mindtree.entity.Team;


public interface DAO {
	public List<Match> getAllMatches(String a);
	   public void  addMatch(Match a);
	   public List<Team> displayTeam();

}
