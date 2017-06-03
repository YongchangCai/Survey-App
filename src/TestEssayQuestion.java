
public class TestEssayQuestion extends EssayQuestion {
	
	String m_answer;
	
	public TestEssayQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
		}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Survey Essay";
	}

	@Override
	public String printQuestion() {
		String question = "";
		question+= getQuestion();
		question+= m_answer;
		return question;
	}
	
	public Boolean setAnswer(String answer){
		m_answer = answer;
		return true;
	}

}
