
public class TestShortQuestion extends TestEssayQuestion {

	public TestShortQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Test Short Question";
	}
	
	@Override
	public Boolean setAnswer(String answer){
		if (answerLength(answer)){
			super.setAnswer(answer);
			return true;
		}
		return false;
	}
	
	@Override
	public String printQuestion(){
		String question = "";
		question+=getQuestion()+"\n";
		question+=m_answer;
		return question;
	}

	private Boolean answerLength(String answer){
		if (answer.length()<=25){
			return true;
		}
		return false;
	}
}
