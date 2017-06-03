
public class TestTFChoiceQuestion extends TestMultiChoiceQuestion {

	public TestTFChoiceQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType(){
		return "Test T/F Question";
	}
	
	@Override
	public void setChoice(String choice){
		throw new UnsupportedOperationException();//TF choice not allowed set Choice as a multiplechoice 
	}
	
	@Override
	public Boolean testAnswer(int answer){
		if (answer <=2 & answer>0){
			return true;
		}
		return false;
	}
	
}
