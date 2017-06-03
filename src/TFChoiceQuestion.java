
public class TFChoiceQuestion extends MultiChoiceQuestion{
	
	public TFChoiceQuestion(String Question) {
		super(Question);
		choice_list.add("True");
		choice_list.add("False");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType(){
		return "Survey T/F Question";
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
