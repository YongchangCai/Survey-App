
import java.util.*;

public class MultiChoiceQuestion extends Question{
	
	public List<String> choice_list = new ArrayList<String>();
	public int m_num;
	public MultiChoiceQuestion(String Question) {
		super(Question);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getType(){
		return "Survey Multiple Choice";
	}
	
	public void setChoice(String choice){
		choice_list.add(choice);
	}
	
	public List<String> getChoice(){
		return choice_list;
	}

	public Boolean testAnswer(int answer) {
		if (answer <= m_num){
			return true;
		}
		return false;
	}

	@Override
	public String printQuestion() {
		// TODO Auto-generated method stub
		String question = "";
		question += getQuestion()+"\n";
		for (int i=0; i<choice_list.size();i++){
			question += i+1+") "+choice_list.get(i)+"\n";
		}
		
		return question;
	}


}
