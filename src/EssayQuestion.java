
public class EssayQuestion extends Question {

	public EssayQuestion(String Question) {
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
		return getQuestion();
	}

}
