import java.util.Scanner;

public class Main_menu {

	public static void main(String[] args) {
		System.out.println("Welcome to Question APP");
		System.out.println("1) Survey \n2) Test");
		Scanner scanner = new Scanner(System.in);
		String user_choice = scanner.nextLine();
		if (user_choice.equals("1")){
			Menu2 menu = new Menu2Survey();
			menu.printMenu();
		}
		else if(user_choice.equals("2")){
			Menu2 menu = new Menu2Test();
		}
		

	}

}
