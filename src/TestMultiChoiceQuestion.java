public class TestMultiChoiceQuestion extends MultiChoiceQuestion{
	
	String m_answer;
	
	public TestMultiChoiceQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType(){
		return "Test Multiple Choice";
	}

	@Override
	public String printQuestion() {
		String question = "";
		question += getQuestion()+"\n";
		for (int i=0; i<choice_list.size();i++){
			question += i+1+") "+choice_list.get(i)+"\n";
			question += "The correct Answer is: "+ m_answer;
		}
		
		return question;
	}
	
	public void setAnswer(String answer){
		m_answer = answer;
	}
	
	public boolean checkAnswer(){
		if (m_answer==m_reply){
			return true;
		}
		else{
			return false;
		}
	}
}
