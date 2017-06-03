
public class TestMatchingQuestion extends MatchingQuestion {

	public TestMatchingQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType(){
		return "Test Matching";
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
		for(int i=0;i<matching_list_1.size();i++){
			answer += matching_list_1.get(i);
			answer += matching_list_2.get(i)+"/n";
		}
		
		return answer;
	}
	
	public boolean checkAnswer(String match1,String match2){
		return matching_list_2.get(matching_list_1.indexOf(match1)).equals(match2);
	}
}
