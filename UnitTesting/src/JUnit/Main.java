package JUnit;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animals animal1 = new Animals("Cat", "Joe");
		Animals animal2 = new Animals("Turtle", "Robert");
		Animals animal3 = new Animals("Bird", "Bird");
		Animals animal4 = new Animals("Shark", "Melissa");
		
		List <Animals> Zoo = new ArrayList<Animals>();
		
		Zoo.add(animal1);
		Zoo.add(animal2);
		Zoo.add(animal3);
		Zoo.add(animal4);
		
		for (Animals animal : Zoo) {
			System.out.println(animal.toString());
		}
		
	}

}
