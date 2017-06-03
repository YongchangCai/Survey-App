
public class ShortQuestion extends EssayQuestion {

	public ShortQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Short Question";
	}
	
	public Boolean answerLength(String answer){
		if (answer.length()<=25){
			return true;
		}
		return false;
	}
}
