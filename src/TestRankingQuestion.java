import java.util.ArrayList;
import java.util.List;

public class TestRankingQuestion extends RankingQuestion {
	
	public TestRankingQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType(){
		return "Test Ranking";
	}
	
	@Override
	public String printQuestion(){
		String question = "";
		question += super.printQuestion();
		question += printAnswer();
		
		return question;
	}
	
	public String printAnswer(){
		String answer = "";
		for(int i=0;i<m_rankingchoice.size();i++){
			answer += m_rankingchoice.get(i);
		}
		
		return answer;
	}
	
	public boolean checkAnswer(String match,int i){
		return m_rankingchoice.get(i).equals(match);
	}
}
