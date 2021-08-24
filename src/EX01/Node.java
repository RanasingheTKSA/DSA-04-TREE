package EX01;

public class Node {
	public int iData; // this is a key
	public double dData; //it might be so many other values
	public Node LeftChild;
	public Node RightChild;
	
	//this is constructors
	public Node() {} //this constructor not must but it should be their
	public void displayNode() {
		System.out.println(iData + " , " +dData);
	}
	
}
