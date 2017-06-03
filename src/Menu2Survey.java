import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu2Survey extends Menu2 {

	
	@Override
	void printMenu() {
		System.out.println("1) Create new Survey\n2) Display Survey\n3) Load Survey\n4) Save Survey\n5) Modify Survey\n6) Take Survey\n7) Tabulate Survey\n8) Quit");
		Scanner scanner = new Scanner(System.in);
		String user_choice = scanner.nextLine();
		switch(user_choice){
			case "1": create();
				 break;
			case "2": display();
				 break;
			case "3": load();
				 break;
			case "4": save();
				 break;
			case "5": quit();
				 break;
		}
	}

	@Override
	void create() {
		// TODO Auto-generated method stub
		super.current_sheet = new QuestionSheet(true);
		Menu3 menu3 = new Menu3(super.current_sheet);
		this.printMenu();
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		File file = new File("survey_library.ser");
		if (file.exists()){
			try{
				FileInputStream fileIn = new FileInputStream("survey_library.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				sheet_library = (Map<String,QuestionSheet>)in.readObject();
				System.out.println("Sheet library deserialized");
			}catch(IOException e){
				e.printStackTrace();
				return;
			}catch(ClassNotFoundException ec){
				System.out.println("No file saved");
				ec.printStackTrace();
				return;
			}
		}
		System.out.println("Enter the name to save ");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();
		sheet_library.put(filename, current_sheet);
		
		try{
			FileOutputStream file_out = new FileOutputStream("survey_library.ser");
			ObjectOutputStream out = new ObjectOutputStream(file_out);
			out.writeObject(sheet_library);
			out.close();
			file_out.close();
			System.out.println("Serialized data is saved in survey_library.ser");
			printMenu();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void load(){
		try{
			FileInputStream fileIn = new FileInputStream("test_library.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			sheet_library = (Map<String,QuestionSheet>)in.readObject();
			System.out.println("Sheet library deserialized");
		}catch(IOException e){
			e.printStackTrace();
			return;
		}catch(ClassNotFoundException ec){
			System.out.println("No file saved");
			ec.printStackTrace();
			return;
		}
		Set<String> key = sheet_library.keySet();
		String allfiles = "Choose the File. Please input the number\n";
		int i = 1;
		for(String name : key){
			allfiles += i+") "+name+"\n";
			i++;
		}
		System.out.println(allfiles);
		Scanner scanner = new Scanner(System.in);
		int choice = Integer.parseInt(scanner.nextLine());
		scanner.close();
		if (choice > sheet_library.size()){
			System.out.println("Error input, please input the number of choosing file");
			load();
			return;
		}
		else{
			current_sheet = sheet_library.get(key.toArray()[choice-1]);
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tabulate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void take() {
		// TODO Auto-generated method stub
		
	};

}
