
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RankingQuestion extends MatchingQuestion{
	
	public List<String> m_rankingchoice = new ArrayList<String>();
	public RankingQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Ranking";
	}
	
	public void addRank(String rank){
		m_rankingchoice.add(rank);
	}
	
	@Override
	public String printQuestion(){
		String question = "";
		question += getQuestion()+"\n";
		question += printMatch();
		
		return question;
	}
	
	public String printMatch(){
		String matching ="";
		List<String> cp_matching_list_2 = m_rankingchoice;
		Collections.shuffle(cp_matching_list_2);
		for(int i = 0;i<cp_matching_list_2.size();i++){
			matching += String.format("%1$10s", cp_matching_list_2.get(i));
		}
		return matching;
	}

}
