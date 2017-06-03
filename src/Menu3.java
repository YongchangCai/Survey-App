import java.util.Scanner;

public class Menu3 {
	public Menu3(QuestionSheet sheet){
		String choice = "";
		while(true){
			System.out.print("1) Add a new T/F question" + "\n2) Add a new Multiple choice question"
					+ "\n3) Add a new Short question" + "\n4) Add a Essay question" + "\n5) Add a new Ranking question"
					+ "\n6) Add a new Matching question" + "\n7) Quit");
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextLine();
			if (choice.equals("7")){
				break;
			}
			sheet.addQuestion(choice);
		}
	}
	
}
