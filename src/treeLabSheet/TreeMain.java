package treeLabSheet;

import java.util.Scanner;

public class TreeMain {
	public static void main(String[] args) {
		Tree tree = new Tree (); // insert values to the tree
		tree.insert(129, "Anusha");
		tree.insert(167, "Kosala");
		tree.insert(47, "Dinuksha");
		tree.insert(66, "Mihiri");
		tree.insert(159, "Janani");
		tree.insert(118, "Nuwani");
		tree.insert(195, "Nishantha");
		tree.insert(34, "Ayodya");
		tree.insert(105, "NImashi");
		tree.insert(133, "Sampath");
		
		
		//order display 
		tree.inOrder();
		System.out.println("======================");
		
		tree.preOrder();
		System.out.println("======================");
		
		tree.postOrder();
		System.out.println("======================");
		
		
		
		
		//allow find the  details to employee from the keyboard
		System.out.print(" Enter the employee number and name :");
		
		Scanner mySccaner = new Scanner (System.in);
		int empId = mySccaner.nextInt();
		String nameOfEmployee = tree.Find(empId).Name;
		System.out.print("Name of the employee is : " + nameOfEmployee );
		//System.out.println(nameOfEmployee);
		
		
		tree.deleteAll();
		System.out.println("Tree is deleted");
		tree.inOrder();
	}
}
