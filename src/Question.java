import java.io.Serializable;

public abstract class Question implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5872281628739569016L;
	String m_question;
	String m_reply;
	String m_type;
	
	public Question(String Question){
		m_question = Question;
	}
	
	public String getType(){
		return m_type;
	}
	
	public abstract String printQuestion();
	
	public void setQuestion(String Question){
		m_question =Question;
	};
	
	public String getReply(){
		return m_reply;
	};
	
	public void setReply(String reply){
		m_reply = reply;
	}
	public String getQuestion(){
		return m_question;
	}
}
