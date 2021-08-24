package treeLabSheet;

public class Node {
	
	public int EmpNo; // use as key value
	public String Name; //data item
	public Node leftChild; //node left child
	public Node rightChild; // node right child
	
	//display data value with node
	public void displayNode() {  
		System.out.println(EmpNo +","+ Name);
	}
}
