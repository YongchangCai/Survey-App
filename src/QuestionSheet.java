import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Yongchang Cai
 *
 */
public class QuestionSheet implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Question> questionSheet = new ArrayList<Question>();
	private Boolean m_type; //True for survey and False for Test (since only have 2 type so using boolean)
	
	/**
	 * 
	 * @param type(true: Survey, false: Test)
	 */
	public QuestionSheet(Boolean type){
		m_type = type;
	}
	/**
	 * Method using to add question to a Question sheet
	 * @param choice
	 */
	public void addQuestion(String choice){
		Scanner scanner = new Scanner(System.in);
		String question_string = getQuestion();
		//add different question based on the user choice.
		switch(choice){
		case"1": 
			if (!m_type){
			TestTFChoiceQuestion tf_question = new TestTFChoiceQuestion(question_string);
			
			System.out.println("Enter correct Choice: ");
			tf_question.setAnswer(scanner.nextLine());
			questionSheet.add((Question)tf_question);
			}
			else{
				TFChoiceQuestion tf_question = new TFChoiceQuestion(question_string);
				questionSheet.add((Question)tf_question);
			}
			
			break;
		case"2": 
			System.out.println("Enter number of Choice:");
				int num = Integer.parseInt(scanner.nextLine());
			if (!m_type){
				TestMultiChoiceQuestion mult_question = new TestMultiChoiceQuestion(question_string);
				mult_question.m_num = num;
				for (int i =0; i<num;i++){
					System.out.println("Enter choice #"+(i+1));
					mult_question.setChoice(scanner.nextLine());
				}
				System.out.println("Enter correct Choice: ");
				mult_question.setAnswer(scanner.nextLine());
				questionSheet.add((Question)mult_question);
			}
				else{
					MultiChoiceQuestion mult_question = new MultiChoiceQuestion(question_string);
					mult_question.m_num = num;
					for (int i =0; i<num;i++){
						System.out.println("Enter choice #"+(i+1));
						mult_question.setChoice(scanner.nextLine());
					}
					questionSheet.add((Question)mult_question);
				}
		break;
		case "3": 
			if (!m_type){
				TestShortQuestion short_question = new TestShortQuestion(question_string);
				System.out.println("Enter correct Choice: ");
				short_question.setAnswer(scanner.nextLine());
				questionSheet.add((Question)short_question);
			}
			else{
				ShortQuestion short_question = new ShortQuestion(question_string);
				questionSheet.add((Question)short_question);
			}
			break;
		case "4": EssayQuestion essay_question = new EssayQuestion(question_string);
			questionSheet.add((Question)essay_question);
		break;
		case "5": 
				RankingQuestion ranking_question = new RankingQuestion(question_string);
				System.out.println("Enter ranking eletment QUIT to quit enter ranking");
				System.out.println("Enter elements inorder");
				while(!scanner.nextLine().equals("QUIT")){
					String match = scanner.nextLine();
					ranking_question.addRank(match);
				}
				questionSheet.add((Question)ranking_question);
				break;
		case "6": MatchingQuestion matching_question = new MatchingQuestion(question_string);
				System.out.println("Enter matching eletment QUIT to quit enter matching");
				while(!scanner.nextLine().equals("QUIT")){
					System.out.println("Enter first element of matching:");
					String match1 = scanner.nextLine();
					System.out.println("Enter next elemnet of matching:");
					String match2 = scanner.nextLine();
					matching_question.addMatching(match1, match2);
				}
				questionSheet.add((Question)matching_question);
			break;
		}
	}
	
	public void printQuestion(){
		for (int i = 0;i < questionSheet.size();i++){
			System.out.println((i+1)+") "+ questionSheet.get(i).printQuestion());
			
		}
		
	}
	
	
	private String getQuestion(){
		System.out.println("Input Question");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
