package treeLabSheet;

public class Tree {
	private Node root; //first node of the tree
	
	public Tree() { //constructors
		root = null;
	}

	
	//this is find method
	public Node Find(int key) {
		Node current = root;
		while (current.EmpNo != key) {
			if (key < current.EmpNo) {
				current = current.leftChild;
			}
			else {
				current = current.rightChild; 
			}
			
			if(current == null) {
				return null;
			}
		}
		//current = null; 
		return current;
	}

	
	
	
	
	
	//this is insert method
	public void insert (int empNo, String name) {
		Node newNode = new Node();
		newNode.EmpNo = empNo;
		newNode.Name = name;
		
		if(root == null) {// no need in the root
			root = newNode;
		}
		else { //if there is root node
			Node current = root;
			Node parents;
			
			while(true) {
				parents = current;
				
				if(empNo < current.EmpNo) { // go to the left
					current = current.leftChild;
					if(current == null) {
						parents.leftChild = newNode;
						return;
					}
				}
				else { //go to the right
					current = current.rightChild;
					if (current == null) {
						parents.rightChild = newNode;
						return;
					}
						
				}			
			}
		}	
	}
	
	
	
	
	
	
	
	
	//this is in-order method
	private  void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	void inOrder() {
		inOrder(root);
	}
	
	
	
	
	
	//this is pre-order method
	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.rightChild);
			preOrder(localRoot.rightChild);
		}
	}
	void preOrder() {
		preOrder(root);
	}
	
	
	//this is post-order method
	private void postOrder (Node localRoot) {
		if (localRoot != null) {
			postOrder (localRoot.leftChild);
			postOrder (localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	void postOrder() {
		postOrder(root);
	}
	

	
	
	
	
	
	
	
	//this is find recursive method
	public Node findRecursive (int key, Node cur) {
		if (cur == null)
			return null;
		else if(key == cur.EmpNo)
			return cur;
		else if (key < cur.EmpNo) 
			return findRecursive (key, cur.leftChild);
		else
			return findRecursive (key, cur.rightChild);
	}
	
	
	//this is delete all method
	public void deleteAll(Node loaclRoot) {
		root = null;
	}
	public void deleteAll() {
		deleteAll (root);
		 
	}
	
}
