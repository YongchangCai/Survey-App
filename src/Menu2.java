import java.awt.Choice;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public abstract class Menu2 implements Serializable {
	
	public QuestionSheet current_sheet;
	Map<String,QuestionSheet> sheet_library = new HashMap<String,QuestionSheet>();
	
	public Menu2(){
		printMenu();
	}
	
	abstract void printMenu();

	abstract void create();
	
	public void display() {
		this.current_sheet.printQuestion();
		this.printMenu();
	}
	public abstract void load();
	
	public abstract void save();
	
	public abstract void modify();
	
	public abstract void tabulate();
	
	public abstract void take();
	
	public void quit(){
		System.exit(0);
	}
}
